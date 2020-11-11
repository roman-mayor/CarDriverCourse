package service.Impl;

import dao.DriverCourseDao;
import model.CourseType;
import model.DriverCourse;
import service.DriverCourseService;

import java.util.Collection;

public class DriverCourseServiceImpl implements DriverCourseService {

    DriverCourseDao driverCourseDao;

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
