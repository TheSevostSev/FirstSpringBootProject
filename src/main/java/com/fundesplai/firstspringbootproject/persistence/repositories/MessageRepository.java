package com.fundesplai.firstspringbootproject.persistence.repositories;

import com.fundesplai.firstspringbootproject.persistence.entities.Message;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface MessageRepository extends CrudRepository<Message, Integer> {
    @Query("Select m from Message m inner join m.userMessages um where um.receiverId.id=:receiver_id")
    public List<Message> findMessageByReceiverId(@Param("receiver_id") int receiverId);
}
