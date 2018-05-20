package com.webprog.lab5.service;

import com.webprog.lab5.model.User;
import com.webprog.lab5.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final UserRepository userRepository;

    public String auth(final String username, final String password) {
        val user = userRepository.findByUsername(username);

        return user == null || !user.getPassword().equals(password) ? null : user.getId();
    }

    public User get(final String id) {
        return userRepository.getOne(id);
    }

    public void create(final User user) {
        userRepository.save(user);
    }
}
