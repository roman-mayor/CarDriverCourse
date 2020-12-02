package ru.iteco.service;

import ru.iteco.model.CourseType;
import ru.iteco.model.DriverCourse;

import java.util.Collection;

public interface DriverCourseService {

    void addDriverCourse(DriverCourse course);

    DriverCourse deleteCourse(DriverCourse course);

    Collection<DriverCourse> getCourseByType(CourseType type);

    DriverCourse getById(Long id);
}
