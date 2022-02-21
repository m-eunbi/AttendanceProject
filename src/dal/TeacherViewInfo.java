package dal;

import dal.BE.Course;
import dal.BE.Lesson;
import dal.BE.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class TeacherViewInfo {
    public ArrayList<Student> scoStudents;
    public ArrayList<Student> sdeStudents;
    public ArrayList<Student> scoStudentsAbsence;
    public ArrayList<Student> sdeStudentsAbsence;
    public ArrayList<Lesson> scoLessons;
    public ArrayList<Lesson> sdeLessons;
    public Course sco;
    public Course sde;

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
        s1.absencePerDay = new int[]{1, 8, 4, 2, 0};
        Student s2 = new Student("Mette Poulsen", "MePo8752", "images/img2.png", "13");
        s2.absencePerDay = new int[]{7, 0, 0, 15, 20};
        Student s3 = new Student("Theo Kristiansen", "ThKr1802", "images/img3.jpg", "7");
        s3.absencePerDay = new int[]{0, 10, 5, 8, 0};
        Student s4 = new Student("Victor Rasmussen", "ViRa1209", "images/img4.jpg", "0");
        s4.absencePerDay = new int[]{0, 0, 0, 0, 0};
        Student s5 = new Student("Louisa Eriksen", "LoEr3265", "images/img5.jpg", "9");
        s5.absencePerDay = new int[]{9, 5, 10, 6, 17};
        Student s6 = new Student("Tim Hansen", "TiHa7642", "images/img6.jpg", "23");
        s6.absencePerDay = new int[]{25, 30, 17, 5, 20};
        Student s7 = new Student("Kasper Larsen", "KaLa3012", "images/img7.jpg", "18");
        s7.absencePerDay = new int[]{15, 0, 2, 0, 74};

        scoStudents.addAll(Arrays.asList(s1, s5, s2, s6, s4));
        sdeStudents.addAll(Arrays.asList(s7, s5, s2, s3, s4));

        scoStudentsAbsence.addAll(Arrays.asList(s6, s2, s5, s1, s4));
        sdeStudentsAbsence.addAll(Arrays.asList(s7, s2, s5, s3, s4));
    }

    private void createLessons() {
        Lesson l1 = new Lesson("SCO", "31-01-2022");
        l1.time = "09:00-11:30";
        l1.allStudents.addAll(scoStudents);
        l1.presentStudents.addAll(scoStudents);

        Lesson l2 = new Lesson("SCO", "21-01-2022");
        l2.time = "09:00-11:30";
        l2.allStudents.addAll(scoStudents);
        l2.presentStudents.addAll(Arrays.asList(scoStudents.get(1),scoStudents.get(2),scoStudents.get(4)));

        Lesson l3 = new Lesson("SCO", "11-01-2022");
        l3.time = "09:00-11:30";
        l3.allStudents.addAll(scoStudents);
        l3.presentStudents.addAll(Arrays.asList(scoStudents.get(0), scoStudents.get(2), scoStudents.get(3), scoStudents.get(4)));

        Lesson l4 = new Lesson("SCO", "01-01-2022");
        l4.time = "09:00-11:30";
        l4.allStudents.addAll(scoStudents);
        l4.presentStudents.addAll(Arrays.asList(scoStudents.get(4)));

        Lesson l5 = new Lesson("SDE", "26-01-2022");
        l5.time = "09:00-12:45";
        l5.allStudents.addAll(sdeStudents);
        l5.presentStudents.addAll(sdeStudents);

        Lesson l6 = new Lesson("SDE", "19-01-2022");
        l6.time = "09:00-12:45";
        l6.allStudents.addAll(sdeStudents);
        l6.presentStudents.addAll(Arrays.asList(sdeStudents.get(0), sdeStudents.get(1), sdeStudents.get(4)));

        Lesson l7 = new Lesson("SDE", "12-01-2022");
        l7.time = "09:00-12:45";
        l7.allStudents.addAll(sdeStudents);
        l7.presentStudents.addAll(Arrays.asList(sdeStudents.get(3), sdeStudents.get(4)));

        Lesson l8 = new Lesson("SDE", "05-01-2022");
        l8.time = "09:00-12:45";
        l8.allStudents.addAll(sdeStudents);
        l8.presentStudents.addAll(Arrays.asList(sdeStudents.get(1), sdeStudents.get(2), sdeStudents.get(3), sdeStudents.get(4)));

        scoLessons.addAll(Arrays.asList(l1, l2, l3, l4));
        sdeLessons.addAll(Arrays.asList(l5, l6, l7, l8));
    }

}