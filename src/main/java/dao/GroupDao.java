package dao;

import model.Group;
import model.CourseType;
import model.User;

import java.util.Collection;

public interface GroupDao extends GenericDAO<Group, Long> {

    Collection<Group> getGroupsByUser(User user);
}
