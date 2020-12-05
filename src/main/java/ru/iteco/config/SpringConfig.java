package ru.iteco.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.iteco.dao.DriverCourseDao;
import ru.iteco.dao.GroupDao;
import ru.iteco.dao.UserDao;
import ru.iteco.service.DriverCourseService;
import ru.iteco.service.GroupService;
import ru.iteco.service.Impl.DriverCourseServiceImpl;
import ru.iteco.service.Impl.GroupServiceImpl;
import ru.iteco.service.Impl.UserServiceImpl;
import ru.iteco.service.UserService;

@Configuration
@ComponentScan("ru.iteco")
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Bean
    public UserService userServiceImpl(UserDao userDao){
        return new UserServiceImpl(userDao);
    }

    @Bean
    public GroupService groupServiceImpl(GroupDao groupDao){
        return new GroupServiceImpl(groupDao);
    }

    @Bean
    public DriverCourseService driverCourseServiceImpl(DriverCourseDao driverCourseDao){
        return new DriverCourseServiceImpl(driverCourseDao);
    }
}
