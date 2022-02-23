package dal;

import dal.BE.Course;
import dal.BE.Lesson;
import dal.BE.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class TeacherViewInfo {
    private ArrayList<Student> scoStudents;
    private ArrayList<Student> sdeStudents;
    private ArrayList<Student> scoStudentsAbsence;
    private ArrayList<Student> sdeStudentsAbsence;
    private ArrayList<Lesson> scoLessons;
    private ArrayList<Lesson> sdeLessons;
    private Course sco;
    private Course sde;

    /**
     * Creates the lists and objects needed for the teacher screens
     */
    public TeacherViewInfo() {
        scoStudents = new ArrayList<>();
        sdeStudents = new ArrayList<>();
        scoStudentsAbsence = new ArrayList<>();
        sdeStudentsAbsence = new ArrayList<>();
        scoLessons = new ArrayList<>();
        sdeLessons = new ArrayList<>();
        createStudents();
        createLessons();
        createCourses();
    }

    private void createCourses(){
        sco = new Course(scoStudents, scoStudentsAbsence);
        sde = new Course(sdeStudents, sdeStudentsAbsence);
    }

    private void createStudents() {
        Student s1 = new Student("Betina Jensen", "BeJe6589", "images/img1.png", "8");
        s1.setAbsencePerDay(new int[]{1, 8, 4, 2, 0});
        Student s2 = new Student("Mette Poulsen", "MePo8752", "images/img2.png", "13");
        s2.setAbsencePerDay(new int[]{7, 0, 0, 15, 20});
        Student s3 = new Student("Theo Kristiansen", "ThKr1802", "images/img3.jpg", "7");
        s3.setAbsencePerDay(new int[]{0, 10, 5, 8, 0});
        Student s4 = new Student("Victor Rasmussen", "ViRa1209", "images/img4.jpg", "0");
        s4.setAbsencePerDay(new int[]{0, 0, 0, 0, 0});
        Student s5 = new Student("Louisa Eriksen", "LoEr3265", "images/img5.jpg", "9");
        s5.setAbsencePerDay(new int[]{9, 5, 10, 6, 17});
        Student s6 = new Student("Tim Hansen", "TiHa7642", "images/img6.jpg", "23");
        s6.setAbsencePerDay(new int[]{25, 30, 17, 5, 20});
        Student s7 = new Student("Kasper Larsen", "KaLa3012", "images/img7.jpg", "18");
        s7.setAbsencePerDay(new int[]{15, 0, 2, 0, 74});

        scoStudents.addAll(Arrays.asList(s1, s5, s2, s6, s4));
        sdeStudents.addAll(Arrays.asList(s7, s5, s2, s3, s4));

        scoStudentsAbsence.addAll(Arrays.asList(s6, s2, s5, s1, s4));
        sdeStudentsAbsence.addAll(Arrays.asList(s7, s2, s5, s3, s4));
    }

    private void createLessons() {
        Lesson l1 = new Lesson("SCO", "31-01-2022");
        l1.setTime("09:00-11:30");
        l1.getAllStudents().addAll(scoStudents);
        l1.getPresentStudents().addAll(scoStudents);

        Lesson l2 = new Lesson("SCO", "21-01-2022");
        l2.setTime("09:00-11:30");
        l2.getAllStudents().addAll(scoStudents);
        l2.getPresentStudents().addAll(Arrays.asList(scoStudents.get(1),scoStudents.get(2),scoStudents.get(4)));

        Lesson l3 = new Lesson("SCO", "11-01-2022");
        l3.setTime("09:00-11:30");
        l3.getAllStudents().addAll(scoStudents);
        l3.getPresentStudents().addAll(Arrays.asList(scoStudents.get(0), scoStudents.get(2), scoStudents.get(3), scoStudents.get(4)));

        Lesson l4 = new Lesson("SCO", "01-01-2022");
        l4.setTime("09:00-11:30");
        l4.getAllStudents().addAll(scoStudents);
        l4.getPresentStudents().addAll(Arrays.asList(scoStudents.get(4)));

        Lesson l5 = new Lesson("SDE", "26-01-2022");
        l5.setTime("09:00-12:45");
        l5.getAllStudents().addAll(sdeStudents);
        l5.getPresentStudents().addAll(sdeStudents);

        Lesson l6 = new Lesson("SDE", "19-01-2022");
        l6.setTime("09:00-12:45");
        l6.getAllStudents().addAll(sdeStudents);
        l6.getPresentStudents().addAll(Arrays.asList(sdeStudents.get(0), sdeStudents.get(1), sdeStudents.get(4)));

        Lesson l7 = new Lesson("SDE", "12-01-2022");
        l7.setTime("09:00-12:45");
        l7.getAllStudents().addAll(sdeStudents);
        l7.getPresentStudents().addAll(Arrays.asList(sdeStudents.get(3), sdeStudents.get(4)));

        Lesson l8 = new Lesson("SDE", "05-01-2022");
        l8.setTime("09:00-12:45");
        l8.getAllStudents().addAll(sdeStudents);
        l8.getPresentStudents().addAll(Arrays.asList(sdeStudents.get(1), sdeStudents.get(2), sdeStudents.get(3), sdeStudents.get(4)));

        scoLessons.addAll(Arrays.asList(l1, l2, l3, l4));
        sdeLessons.addAll(Arrays.asList(l5, l6, l7, l8));
    }

    public ArrayList<Student> getScoStudents() {
        return scoStudents;
    }

    public ArrayList<Student> getSdeStudents() {
        return sdeStudents;
    }

    public ArrayList<Student> getScoStudentsAbsence() {
        return scoStudentsAbsence;
    }

    public ArrayList<Student> getSdeStudentsAbsence() {
        return sdeStudentsAbsence;
    }

    public ArrayList<Lesson> getScoLessons() {
        return scoLessons;
    }

    public ArrayList<Lesson> getSdeLessons() {
        return sdeLessons;
    }

    public Course getSco() {
        return sco;
    }

    public Course getSde() {
        return sde;
    }
}