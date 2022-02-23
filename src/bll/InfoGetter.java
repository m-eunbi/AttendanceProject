package bll;

import dal.BE.Course;
import dal.BE.Lesson;
import dal.BE.Student;
import dal.StudentViewInfo;
import dal.TeacherViewInfo;

import java.util.ArrayList;

public class InfoGetter {
    private StudentViewInfo studentViewInfo = new StudentViewInfo();
    private TeacherViewInfo teacherViewInfo = new TeacherViewInfo();

    public ArrayList<Lesson> studentLessons(){
        return studentViewInfo.getLessons();
    }

    public Student studentViewInfo(){
        return studentViewInfo.getStudent();
    }

    public ArrayList<Lesson> getCourseLessons(String course) {
        if (course.equals("SCO"))
            return teacherViewInfo.getScoLessons();
        else if (course.equals("SDE"))
            return teacherViewInfo.getSdeLessons();
        return new ArrayList<>();
    }

    public ArrayList<Student> getCourseStudents(String course) {
        if (course.equals("SCO"))
            return teacherViewInfo.getScoStudents();
        else if (course.equals("SDE"))
            return teacherViewInfo.getSdeStudents();
        return new ArrayList<>();
    }

    public Course getCourse(String course){
        if (course.equals("SCO"))
            return teacherViewInfo.getSco();
        else if (course.equals("SDE"))
            return teacherViewInfo.getSde();
        return null;
    }

}
