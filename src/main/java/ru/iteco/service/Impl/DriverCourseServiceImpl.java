package ru.iteco.service.Impl;

import org.springframework.stereotype.Service;
import ru.iteco.dao.DriverCourseDao;
import ru.iteco.model.CourseType;
import ru.iteco.model.DriverCourse;
import ru.iteco.service.DriverCourseService;

import java.util.Collection;

@Service
public class DriverCourseServiceImpl implements DriverCourseService {

    private final DriverCourseDao driverCourseDao;

    public DriverCourseServiceImpl(DriverCourseDao driverCourseDao){
        this.driverCourseDao = driverCourseDao;
    }

    @Override
    public void addDriverCourse(DriverCourse course) {
        driverCourseDao.create(course);
    }

    @Override
    public DriverCourse deleteCourse(DriverCourse course) {
        return driverCourseDao.delete(course);
    }

    @Override
    public Collection<DriverCourse> getCourseByType(CourseType type) {
        return driverCourseDao.getByCourseType(type);
    }

    @Override
    public DriverCourse getById(Long id) {
        return driverCourseDao.getById(id);
    }
}
