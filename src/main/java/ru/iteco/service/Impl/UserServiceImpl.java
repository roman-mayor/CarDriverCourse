package ru.iteco.service.Impl;

import ru.iteco.dao.UserDao;
import ru.iteco.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.iteco.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.create(user);
    }

    @Override
    public User deleteUser(User user) {
        return userDao.delete(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getById(id);
    }
}
