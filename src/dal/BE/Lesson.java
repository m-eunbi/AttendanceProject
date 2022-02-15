package dal.BE;

import java.util.ArrayList;

public class Lesson {
    public String course;
    public String date;
    public boolean present;
    public ArrayList<Student> presentStudents;

    public Lesson(String course, String date){
        this.course = course;
        this.date = date;
    }
}
