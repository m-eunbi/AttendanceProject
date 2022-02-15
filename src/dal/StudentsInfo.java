package dal;

import dal.BE.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsInfo {
    public ArrayList<Student> scoStudents;
    public ArrayList<Student> sdeStudents;

    public StudentsInfo() {
        scoStudents = new ArrayList<>();
        sdeStudents = new ArrayList<>();
        createStudents();
    }

    private void createStudents() {
        Student s1 = new Student("Betina Jensen", "BeJe6589", "images/img1.png");
        Student s2 = new Student("Mette Poulsen", "MePo8752", "images/img2.png");
        Student s3 = new Student("Theo Kristiansen", "ThKr1802", "images/img3.jpg");
        Student s4 = new Student("Victor Rasmussen", "ViRa1209", "images/img4.jpg");
        Student s5 = new Student("Louisa Eriksen", "LoEr3265", "images/img5.jpg");
        Student s6 = new Student("Tim Hansen", "TiHa7642", "images/img6.jpg");
        Student s7 = new Student("Kasper Larsen", "KaLa3012", "images/img7.jpg");
        scoStudents.addAll(Arrays.asList(s1, s5, s2, s6, s4));
        sdeStudents.addAll(Arrays.asList(s7, s5, s2, s3, s4));
    }


}
