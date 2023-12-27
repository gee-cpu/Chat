package com.gonchaba.chat.sevice;

import com.gonchaba.chat.model.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Override
    public List<Message> getAllMessages() {
        return null;
    }

    @Override
    public Message getMessageById(Long id) {
        return null;
    }

    @Override
    public List<Message> getMessagesBetweenUsers(Long senderId, Long recipientId) {
        return null;
    }

    @Override
    public Message saveMessage(Message message) {
        return null;
    }
}
