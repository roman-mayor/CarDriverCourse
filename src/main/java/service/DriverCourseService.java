package service;

import model.CourseType;
import model.DriverCourse;

import java.util.Collection;

public interface DriverCourseService {

    void addDriverCourse(DriverCourse course);

    DriverCourse deleteCourse(DriverCourse course);

    Collection<DriverCourse> getCourseByType(CourseType type);

    DriverCourse getById(Long id);
}
