package service.Impl;

import model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DriverCourseService;
import service.GroupService;
import service.UserService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainService {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService = (UserService) context.getBean("userService");
        GroupService groupService = (GroupService) context.getBean("groupService");
        DriverCourseService driverCourseService = (DriverCourseService) context.getBean("driverCourseService");

        User instructor = new User();
        instructor.setId(0L);
        instructor.setAge(40);
        instructor.setEmail("gena@gmail.com");
        instructor.setFirstName("Виктор");
        instructor.setLastName("Комаров");
        instructor.setRole(Role.INSTRUCTOR);
        System.out.println("До сохранения: " + instructor);
        userService.addUser(instructor);
        System.out.println("После сохранения: " + userService.getUserById(0L));
        userService.deleteUser(instructor);
        System.out.println("После удаления: " + userService.getUserById(0L));

        User student = new User();
        student.setId(0L);
        student.setAge(20);
        student.setEmail("misha@gmail.com");
        student.setFirstName("Михаил");
        student.setLastName("Светлов");
        student.setRole(Role.STUDENT);
        userService.addUser(student);

        User student2 = new User();
        student2.setId(1L);
        student2.setAge(25);
        student2.setEmail("gena@gmail.com");
        student2.setFirstName("Геннадий");
        student2.setLastName("Жданов");
        student2.setRole(Role.STUDENT);
        userService.addUser(student2);

        Set<User> users = new HashSet<>();
        users.add(student);
        users.add(student2);

        Group group = new Group();
        group.setId(11L);
        group.setInstructor(instructor);
        group.setStudents(users);
        groupService.addGroup(group);
        System.out.println(groupService.getGroupById(11L));

        DriverCourse course = new DriverCourse();
        course.setId(22L);
        course.setCourseType(CourseType.NORMAL);
        course.setStartTime(LocalDate.of(2020, 10, 07));
        course.setEndTime(LocalDate.of(2020, 12, 11));
        course.setGroupCount(1);
        course.setGroups(Arrays.asList(group));
        driverCourseService.addDriverCourse(course);
        System.out.println(driverCourseService.getById(22L));
    }
}
