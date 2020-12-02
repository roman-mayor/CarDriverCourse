package ru.iteco.dao;

import ru.iteco.model.CourseType;
import ru.iteco.model.DriverCourse;
import ru.iteco.model.User;

import java.util.Collection;

public interface DriverCourseDao extends GenericDAO<DriverCourse, Long>{

    DriverCourse getCourseById(Long id);

    Collection<DriverCourse> getByInstructor(User user);

    Collection<DriverCourse> getByCourseType(CourseType type);
}
