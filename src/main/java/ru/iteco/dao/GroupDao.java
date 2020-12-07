package ru.iteco.dao;

import ru.iteco.model.Group;
import ru.iteco.model.User;

import java.util.Collection;

public interface GroupDao extends GenericDAO<Group, Long> {

    Collection<Group> getGroupsByUser(User user);
}
