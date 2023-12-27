package com.gonchaba.chat.sevice;

import com.gonchaba.chat.model.Chat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {
    @Override
    public List<Chat> getAllChats() {
        return null;
    }

    @Override
    public Chat getChatById(Long id) {
        return null;
    }

    @Override
    public Chat createChat(List<Long> participantIds) {
        return null;
    }
}
