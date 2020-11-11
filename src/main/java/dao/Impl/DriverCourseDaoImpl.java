package dao.Impl;

import dao.DriverCourseDao;
import model.CourseType;
import model.DriverCourse;
import model.Group;
import model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DriverCourseDaoImpl extends AbstactDAO<DriverCourse, Long> implements DriverCourseDao {

    public DriverCourseDaoImpl() {
        super(new HashMap<>());
    }

    @Override
    public DriverCourse getCourseByGroup(Group group) {
        return null;
    }

    @Override
    public Collection<DriverCourse> getByInstructor(User user) {
        return null;
    }

    @Override
    public Collection<DriverCourse> getByCourseType(CourseType type) {
            List<DriverCourse> courses = elements.values().stream().filter(g -> g.getCourseType() == type).collect(Collectors.toList());
            return courses;
    }
}
