package task3;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int age;
    private Map<Subject, Rating> ratingMap;
    private int course;
    private long id;

    public Student(String name, long id, int age, int course, Map<Subject, Rating> hashMap) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.id = id;
        this.ratingMap = hashMap;
    }


    public Map<Subject, Rating> getRatingMap() {
        return ratingMap;
    }

    public void setRatingMap(Map<Subject, Rating> ratingMap) {
        this.ratingMap = ratingMap;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student " +
                "name = " + name +
                ", age = " + age
                + ", course = " + course +
                ", id = " + id +
                ". Mark of subject = " + ratingMap;
    }


}
