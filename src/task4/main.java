package task4;

public class main {
    public static void main(final String[] args) {

        final List subjects = new List(new String[]{"Physics", "Math", "English"});

        final Student Orest = new Student("1", "Orest", 4, true, 22);
        final Student Roman = new Student("2","Roman", 2, true, 19);
        final Student Farid = new Student("3","Farid", 1, false, 18);

        subjects.addStudent(Orest);
        subjects.addStudent(Roman);
        subjects.addStudent(Farid);


        subjects.setMark( "1","English", 4);
        subjects.setMark( "1","Math", 4);
        subjects.setMark( "1","Physics", 2);

        subjects.setMark( "2","English", 3);
        subjects.setMark( "2","Math", 5);
        subjects.setMark( "2","Physics", 4);

        subjects.setMark( "3","English", 4);
        subjects.setMark( "3","Math", 2);
        subjects.setMark( "3","Physics", 5);

        subjects.infoAboutStudents();// display all info about students
        System.out.println();

        System.out.println("added new subject OOP ");
        System.out.println();

        subjects.addSubject("OOP");//add new subject

        subjects.setMark( "1","OOP", 5);//added mark to a new subject
        subjects.setMark( "2","OOP", 4);
        subjects.setMark( "3","OOP", 5);

        subjects.infoAboutStudents();
        System.out.println();

        System.out.println("highest average grades");
        subjects.getHighestAverageScore();  //the highest average score
        System.out.println();

        System.out.println("map");
        System.out.println(subjects.getGrades("English"));


    }
}


