package dao;

import model.Role;
import model.User;

import java.util.Collection;


public interface UserDao extends GenericDAO<User, Long>{

    Collection<User> getAllByRole(Role role);
}
