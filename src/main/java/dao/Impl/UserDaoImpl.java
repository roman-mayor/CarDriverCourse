package dao.Impl;

import dao.UserDao;
import model.Role;
import model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UserDaoImpl extends AbstactDAO<User, Long> implements UserDao {

    public UserDaoImpl() {
        super(new HashMap<>());
    }

    @Override
    public Collection<User> getAllByRole(Role role) {
        List<User> users = elements.values().stream().filter(p -> p.getRole() == role).collect(Collectors.toList());
        return users;
    }
}
