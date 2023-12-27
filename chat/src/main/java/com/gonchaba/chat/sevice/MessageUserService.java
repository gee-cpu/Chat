package com.gonchaba.chat.sevice;

import com.gonchaba.chat.model.MessageUser;

import java.util.List;

public interface MessageUserService {

    List<MessageUser> getAllUsers();

    MessageUser getUserById(Long id);

    MessageUser getUserByUsername(String username);

    MessageUser saveUser(MessageUser user);
}
