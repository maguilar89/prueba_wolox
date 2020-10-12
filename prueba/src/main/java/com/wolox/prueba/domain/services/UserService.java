package com.wolox.prueba.domain.services;

import com.wolox.prueba.domain.model.User;
import com.wolox.prueba.domain.port.UserRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepositoryPort userRepositoryPort;

    public UserService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    public User save(User user) {
        return userRepositoryPort.save(user);
    }


}
