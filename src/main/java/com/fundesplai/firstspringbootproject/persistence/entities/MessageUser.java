package com.fundesplai.firstspringbootproject.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "message_user")
public class MessageUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="receiver_id",nullable = false)
    private User receiverId;

    @ManyToOne
    @JoinColumn(name="created_by",nullable = false)
    private User createdBy;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Message message;

}
