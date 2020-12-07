package ru.iteco.dao;

import ru.iteco.model.Role;
import ru.iteco.model.User;

import java.util.Collection;


public interface UserDao extends GenericDAO<User, Long>{

    Collection<User> getAllByRole(Role role);
}
