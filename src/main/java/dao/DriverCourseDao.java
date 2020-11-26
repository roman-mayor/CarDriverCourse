package dao;

import model.CourseType;
import model.DriverCourse;
import model.Group;
import model.User;

import java.util.Collection;

public interface DriverCourseDao extends GenericDAO<DriverCourse, Long>{

    DriverCourse getCourseById(Long id);

    Collection<DriverCourse> getByInstructor(User user);

    Collection<DriverCourse> getByCourseType(CourseType type);
}
