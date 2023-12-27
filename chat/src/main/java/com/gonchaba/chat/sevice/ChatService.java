package com.gonchaba.chat.sevice;

import com.gonchaba.chat.model.Chat;

import java.util.List;

public interface ChatService {

    List<Chat> getAllChats();

    Chat getChatById(Long id);

    Chat createChat(List<Long> participantIds);

}
