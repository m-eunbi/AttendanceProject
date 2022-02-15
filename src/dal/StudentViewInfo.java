package dal;

import dal.BE.Lesson;
import dal.BE.Student;
import gui.MainApp;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentViewInfo {
    public ArrayList<Lesson> lessons;
    public Student student;

    public StudentViewInfo(){
        lessons = new ArrayList<>();
        student = new Student("Tim Hansen", "TiHa7642", MainApp.class.getResource("images/img6.jpg"));
        fillLessons(lessons);
    }

    private void fillLessons(ArrayList<Lesson> lessons) {
        Lesson l1 = new Lesson("SCO", "10-02-2022");
        l1.present = true;
        Lesson l2 = new Lesson("SCO", "07-02-2022");
        l2.present = true;
        Lesson l3 = new Lesson("ITO", "04-02-2022");
        l3.present = true;
        Lesson l4 = new Lesson("SDE", "03-02-2022");
        l4.present = false;
        Lesson l5 = new Lesson("SCO", "03-02-2022");
        l5.present = false;
        Lesson l6 = new Lesson("ITO", "02-02-2022");
        l6.present = true;
        lessons.addAll(Arrays.asList(l1, l2, l3, l4, l5, l6));
    }

}
