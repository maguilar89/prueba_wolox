package com.wolox.prueba.domain.services;

import com.wolox.prueba.domain.model.User;
import com.wolox.prueba.domain.port.UserRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepositoryPort userRepositoryPort;

    public User save(User user) {
        return userRepositoryPort.save(user);
    }


}
