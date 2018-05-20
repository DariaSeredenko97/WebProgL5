package com.webprog.lab5.repository;

import com.webprog.lab5.model.User;
import com.webprog.lab5.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User, String> {
}
