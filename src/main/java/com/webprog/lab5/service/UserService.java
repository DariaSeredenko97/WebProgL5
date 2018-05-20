package com.webprog.lab5.service;

import com.webprog.lab5.model.User;
import com.webprog.lab5.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final UserRepository userRepository;

    public User get(final String id) {
        return userRepository.getOne(id);
    }

    public void create(final User user) {
        userRepository.save(user);
    }
}
