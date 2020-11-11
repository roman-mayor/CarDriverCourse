package model;

import java.util.Set;

public class Group implements Identifired<Long> {

    private Long id;
    private User instructor;
    private int numberOfPlaces;
    private Set<User> students;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getInstructor() {
        return instructor;
    }

    public void setInstructor(User instructor) {
        this.instructor = instructor;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public Set<User> getStudents() {
        return students;
    }

    public void setStudents(Set<User> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", instructor=" + instructor +
                ", numberOfPlaces=" + numberOfPlaces +
                ", students=" + students +
                '}';
    }
}
