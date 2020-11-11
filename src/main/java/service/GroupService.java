package service;

import model.Group;

public interface GroupService {

    void addGroup(Group group);

    Group deleteGroup(Group group);

    Group getGroupById(Long id);
}
