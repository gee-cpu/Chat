package com.gonchaba.chat.sevice;

import com.gonchaba.chat.model.Message;

import java.util.List;

public interface MessageService {

    List<Message> getAllMessages();

    Message getMessageById(Long id);

    List<Message> getMessagesBetweenUsers(Long senderId, Long recipientId);

    Message saveMessage(Message message);

}
