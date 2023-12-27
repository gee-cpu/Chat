package com.gonchaba.chat.sevice;

import com.gonchaba.chat.model.MessageUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MessageUserServiceImpl implements MessageUserService {
    @Override
    public List<MessageUser> getAllUsers() {
        return null;
    }

    @Override
    public MessageUser getUserById(Long id) {
        return null;
    }

    @Override
    public MessageUser getUserByUsername(String username) {
        return null;
    }

    @Override
    public MessageUser saveUser(MessageUser user) {
        return null;
    }
}
