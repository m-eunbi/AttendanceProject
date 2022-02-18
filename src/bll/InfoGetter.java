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
        return studentViewInfo.lessons;
    }

    public Student studentViewInfo(){
        return studentViewInfo.student;
    }

    public ArrayList<Lesson> getCourseLessons(String course) {
        if (course.equals("SCO"))
            return teacherViewInfo.scoLessons;
        else if (course.equals("SDE"))
            return teacherViewInfo.sdeLessons;
        return new ArrayList<>();
    }

    public ArrayList<Student> getCourseStudents(String course) {
        if (course.equals("SCO"))
            return teacherViewInfo.scoStudents;
        else if (course.equals("SDE"))
            return teacherViewInfo.sdeStudents;
        return new ArrayList<>();
    }

    public Course getCourse(String course){
        if (course.equals("SCO"))
            return teacherViewInfo.sco;
        else if (course.equals("SDE"))
            return teacherViewInfo.sde;
        return null;
    }

}
