package dal.BE;

import java.util.ArrayList;

public class Lesson {
    public String course;
    public String date;
    public String time;
    public String presenceOverview;
    public boolean present;
    public ArrayList<Student> allStudents;
    public ArrayList<Student> presentStudents;

    public Lesson(String course, String date){
        this.course = course;
        this.date = date;
        presentStudents = new ArrayList<>();
        allStudents = new ArrayList<>();
    }
}
