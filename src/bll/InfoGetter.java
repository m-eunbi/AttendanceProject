package bll;

import dal.BE.Lesson;
import dal.BE.Student;
import dal.StudentViewInfo;

import java.util.ArrayList;

public class InfoGetter {
    private StudentViewInfo studentViewInfo = new StudentViewInfo();

    public ArrayList<Lesson> studentLessons(){
        return studentViewInfo.lessons;
    }

    public Student studentViewInfo(){
        return studentViewInfo.student;
    }
}
