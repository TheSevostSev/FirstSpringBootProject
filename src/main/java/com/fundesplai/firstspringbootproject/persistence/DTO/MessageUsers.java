package com.fundesplai.firstspringbootproject.persistence.DTO;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageUsers {

    private String message;
    private int submitUserID;
    private List<Integer> destinationUserIds;
    
}
