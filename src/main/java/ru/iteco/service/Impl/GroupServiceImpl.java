package ru.iteco.service.Impl;

import ru.iteco.dao.GroupDao;
import ru.iteco.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.iteco.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

    private final GroupDao groupDao;

    @Autowired
    public GroupServiceImpl(GroupDao groupDao){
        this.groupDao = groupDao;
    }

    @Override
    public void addGroup(Group group) {
        groupDao.create(group);
    }

    @Override
    public Group getGroupById(Long id) {
        return groupDao.getById(id);
    }

    @Override
    public Group deleteGroup(Group group) {
        return groupDao.delete(group);
    }
}
