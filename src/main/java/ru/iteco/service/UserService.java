package ru.iteco.service;

import ru.iteco.model.User;

public interface UserService {

    void addUser(User user);

    User deleteUser(User user);

    User getUserById(Long id);
}
