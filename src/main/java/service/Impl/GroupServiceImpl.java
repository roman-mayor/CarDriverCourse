package service.Impl;

import dao.GroupDao;
import model.Group;
import service.GroupService;

public class GroupServiceImpl implements GroupService {

    GroupDao groupDao;

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
