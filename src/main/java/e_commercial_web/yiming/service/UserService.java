package e_commercial_web.yiming.service;

import e_commercial_web.yiming.entity.User;

import java.util.Optional;

public interface UserService {


    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
