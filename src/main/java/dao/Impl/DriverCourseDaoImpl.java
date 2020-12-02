package dao.Impl;

import dao.DriverCourseDao;
import model.CourseType;
import model.DriverCourse;
import model.Role;
import model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

public class DriverCourseDaoImpl extends AbstactDAO<DriverCourse, Long> implements DriverCourseDao {


    public DriverCourseDaoImpl() {
        super(new HashMap<>());
    }

    @Override
    public DriverCourse getCourseById(Long id) {
        return elements.get(id);
    }

    @Override
    public Collection<DriverCourse> getByInstructor(User user) {
        return elements.values().stream().filter(dc -> dc.getUser().getRole() == Role.INSTRUCTOR)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<DriverCourse> getByCourseType(CourseType type) {
        return elements.values().stream().filter(dc -> dc.getCourseType() == type).collect(Collectors.toList());
    }
}
