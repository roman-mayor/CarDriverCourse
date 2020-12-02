package ru.iteco.dao.Impl;

import org.springframework.stereotype.Repository;
import ru.iteco.dao.GroupDao;
import ru.iteco.model.Group;
import ru.iteco.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

@Repository
public class GroupDaoImpl extends AbstactDAO<Group, Long> implements GroupDao {

    public GroupDaoImpl() {
        super(new HashMap<>());
    }

    @Override
    public Collection<Group> getGroupsByUser(User user) {
        return elements.values().stream().filter(g -> g.getStudents().contains(user)).collect(Collectors.toList());
    }
}
