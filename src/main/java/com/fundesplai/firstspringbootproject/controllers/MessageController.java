package com.fundesplai.firstspringbootproject.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fundesplai.firstspringbootproject.persistence.DTO.MessageUsers;
import com.fundesplai.firstspringbootproject.persistence.entities.Message;
import com.fundesplai.firstspringbootproject.persistence.entities.MessageUser;
import com.fundesplai.firstspringbootproject.persistence.entities.User;
import com.fundesplai.firstspringbootproject.persistence.repositories.MessageRepository;
import com.fundesplai.firstspringbootproject.persistence.repositories.MessageUserRepository;
import com.fundesplai.firstspringbootproject.persistence.repositories.UserRepository;

@CrossOrigin
@RestController
public class MessageController {

	@Autowired
	MessageRepository messageRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	MessageUserRepository messageUserRepository;

	@GetMapping(path = "/messages")
	public List<Message> listMessages(@RequestParam int userId) {
		if(userId > 0){
			return messageRepository.findMessageByReceiverId(userId);
		}
		return null;
	}

	@PostMapping(path = "/messages")
	public void saveMessage(@RequestBody MessageUsers messageUsers) {

		Message message = new Message();
		message.setText(messageUsers.getMessage());
		Message savedMessage = messageRepository.save(message);

		User sender = userRepository.findById(messageUsers.getSubmitUserID()).orElse(null);

		messageUsers.getDestinationUserIds().forEach(destinationUserId->{
			MessageUser messageUser = new MessageUser();
			User destinationUser = userRepository.findById(destinationUserId).orElse(null);
			messageUser.setReceiverId(destinationUser);
			messageUser.setMessage(savedMessage);
			messageUser.setCreatedBy(sender);
			messageUserRepository.save(messageUser);
		});
		

	}
}