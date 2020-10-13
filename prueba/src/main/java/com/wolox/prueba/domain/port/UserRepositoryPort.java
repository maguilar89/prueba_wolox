package com.wolox.prueba.domain.port;

import com.wolox.prueba.domain.model.User;

import java.util.List;

public interface UserRepositoryPort {

    User save(User user);

    User findById(Long id);

    List<User> listar();

}
