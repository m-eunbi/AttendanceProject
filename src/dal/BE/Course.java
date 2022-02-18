package dal.BE;

import java.util.ArrayList;

public class Course {
    public ArrayList<Student> studentsAlphabetical;
    public ArrayList<Student> studentsAbsence;

    public Course(ArrayList<Student> alphabetical, ArrayList<Student> absence){
        this.studentsAlphabetical = alphabetical;
        this.studentsAbsence = absence;
    }
}
