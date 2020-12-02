package ru.iteco.dao.Impl;

import org.springframework.stereotype.Repository;
import ru.iteco.dao.UserDao;
import ru.iteco.model.Role;
import ru.iteco.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

@Repository
public class UserDaoImpl extends AbstactDAO<User, Long> implements UserDao {

    public UserDaoImpl() {
        super(new HashMap<>());
    }

    @Override
    public Collection<User> getAllByRole(Role role) {
        return elements.values().stream().filter(usr -> usr.getRole() == role).collect(Collectors.toList());
    }
}
