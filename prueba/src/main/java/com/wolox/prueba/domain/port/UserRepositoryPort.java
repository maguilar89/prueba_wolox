package com.wolox.prueba.domain.port;

import com.wolox.prueba.domain.model.User;

public interface UserRepositoryPort {

    User save(User user);

    User findById(Long id);

}
