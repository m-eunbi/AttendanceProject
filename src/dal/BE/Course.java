package dal.BE;

import java.util.ArrayList;

public class Course {
    private ArrayList<Student> studentsAlphabetical;
    private ArrayList<Student> studentsAbsence;

    public Course(ArrayList<Student> alphabetical, ArrayList<Student> absence){
        this.studentsAlphabetical = alphabetical;
        this.studentsAbsence = absence;
    }

    public ArrayList<Student> getStudentsAlphabetical() {
        return studentsAlphabetical;
    }

    public ArrayList<Student> getStudentsAbsence() {
        return studentsAbsence;
    }
}
