package dal.BE;

import java.util.ArrayList;

public class Lesson {
    private String course;
    private String date;
    private String time;
    private String presenceOverview;
    private boolean present;
    private ArrayList<Student> allStudents;
    private ArrayList<Student> presentStudents;

    public Lesson(String course, String date){
        this.setCourse(course);
        this.setDate(date);
        setPresentStudents(new ArrayList<>());
        setAllStudents(new ArrayList<>());
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPresenceOverview() {
        return presenceOverview;
    }

    public void setPresenceOverview(String presenceOverview) {
        this.presenceOverview = presenceOverview;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public ArrayList<Student> getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(ArrayList<Student> allStudents) {
        this.allStudents = allStudents;
    }

    public ArrayList<Student> getPresentStudents() {
        return presentStudents;
    }

    public void setPresentStudents(ArrayList<Student> presentStudents) {
        this.presentStudents = presentStudents;
    }
}
