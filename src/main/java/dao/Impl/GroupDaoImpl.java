package dao.Impl;

import dao.GroupDao;
import model.Group;
import model.CourseType;
import model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupDaoImpl extends AbstactDAO<Group, Long> implements GroupDao {

    public GroupDaoImpl() {
        super(new HashMap<>());
    }

    @Override
    public Collection<Group> getGroupsByUser(User user) {
        List<Group> groups = elements.values().stream()
                .filter(g -> g.getStudents().contains(user))
                .collect(Collectors.toList());
        return groups;
    }
}
