package ru.iteco.service;

import ru.iteco.model.Group;

public interface GroupService {

    void addGroup(Group group);

    Group deleteGroup(Group group);

    Group getGroupById(Long id);
}
