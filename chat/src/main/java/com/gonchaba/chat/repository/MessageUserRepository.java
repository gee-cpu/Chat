package com.gonchaba.chat.repository;

import com.gonchaba.chat.model.MessageUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageUserRepository extends JpaRepository<MessageUser, Long>{
    MessageUser findByUsername(String username);

}

