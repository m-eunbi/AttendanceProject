package dal;

import dal.BE.Lesson;
import dal.BE.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentViewInfo {
    private ArrayList<Lesson> lessons;
    private Student student;

    public StudentViewInfo(){
        lessons = new ArrayList<>();
        student = new Student("Tim Hansen", "TiHa7642", "images/img6.jpg", "23");
        fillLessons(lessons);
    }

    private void fillLessons(ArrayList<Lesson> lessons) {
        Lesson l1 = new Lesson("SCO", "10-02-2022");
        l1.setPresent(true);
        Lesson l2 = new Lesson("SCO", "07-02-2022");
        l2.setPresent(true);
        Lesson l3 = new Lesson("ITO", "04-02-2022");
        l3.setPresent(true);
        Lesson l4 = new Lesson("SDE", "03-02-2022");
        l4.setPresent(false);
        Lesson l5 = new Lesson("SCO", "03-02-2022");
        l5.setPresent(false);
        Lesson l6 = new Lesson("ITO", "02-02-2022");
        l6.setPresent(true);
        lessons.addAll(Arrays.asList(l1, l2, l3, l4, l5, l6));
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
