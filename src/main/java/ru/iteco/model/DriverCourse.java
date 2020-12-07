package ru.iteco.model;

import java.time.LocalDate;
import java.util.List;

public class DriverCourse implements Identifired<Long>{

    private Long id;
    private CourseType courseType;
    private LocalDate startTime;
    private LocalDate endTime;
    private int groupCount;
    private List<Group> groups;
    private User user;


    @Override
    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(int groupCount) {
        this.groupCount = groupCount;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "DriverCourse{" +
                "id=" + id +
                ", courseType=" + courseType +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", groupCount=" + groupCount +
                ", groups=" + groups +
                '}';
    }
}
