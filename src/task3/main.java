package task3;

import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(final String[] args) {
        final List<Student> studentList = new ArrayList<>();
        final Map<Subject, Rating> hashMap1 = new HashMap<>();
        final Map<Subject, Rating> hashMap2 = new HashMap<>();
        final Map<Subject, Rating> hashMap3 = new HashMap<>();

        final Subject biology = new Subject("Biology ");
        final Subject chemistry = new Subject("Chemistry ");
        final Subject french = new Subject("French ");

        final Rating rating1 = new Rating(84,4);
        final Rating rating2 = new Rating(57,3);
        final Rating rating3 = new Rating(17,1);

        hashMap1.put(biology, rating1);
        hashMap1.put(chemistry, rating2);
        hashMap1.put(french, rating3);

        hashMap2.put(biology, rating1);
        hashMap2.put(chemistry, rating2);
        hashMap2.put(french, rating3);

        hashMap3.put(biology, rating1);
        hashMap3.put(chemistry, rating2);
        hashMap3.put(french, rating3);


        final Student student1 = new Student("Orest", 12, 18, 2, hashMap1);
        final Student student2 = new Student("Roman", 54, 18, 2, hashMap2);
        final Student student3 = new Student("Farid", 8, 18, 2, hashMap3);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);


        final Subject applicationProgramming = new Subject("Application programming");

        display(studentList);
        addSubject(studentList, applicationProgramming);
        display(studentList);

        System.out.println();
        System.out.println("The highest average score = " + average(student1));

        System.out.println();
        System.out.println(displayMapByKey(studentList,biology));
    }

    public static List<Student> addSubject(List<Student> list, Subject subject) {
        for (Student student : list) {
            student.getRatingMap().put(subject, new Rating());
        }

        return list;
    }

    public static void display(List<Student> list) {
        for (Student student : list) {
            System.out.println();
            System.out.println(student);
        }
    }

    public static double average(Student student) {
        return student.getRatingMap().values().stream()
                .mapToInt(value -> value.getHundredPointSystem())
                .average()
                .getAsDouble();
    }

    public static Map<Long, Rating> displayMapByKey(List<Student> list, Subject subject){
        return list.stream()
                .distinct()
                .collect(Collectors.toMap(student -> student.getId(),student -> student.getRatingMap().get(subject)));
    }

}
