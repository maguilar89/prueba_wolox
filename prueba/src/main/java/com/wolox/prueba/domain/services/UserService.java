package com.wolox.prueba.domain.services;

import com.wolox.prueba.domain.model.User;
import com.wolox.prueba.domain.port.UserRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepositoryPort userRepositoryPort;

    public UserService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    public User save(User user) {
        return userRepositoryPort.save(user);
    }

    public void save(List<User> users) {

        for (User user : users) {
            userRepositoryPort.save(user);
        }
    }


}
