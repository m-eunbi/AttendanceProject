package dal.BE;

public class Student {
    public String name;
    public String iD;
    public String imagePath;
    public String email;
    public String absencePercent;
    public int[] absencePerDay;

    public Student(String name, String iD, String imagePath, String  absencePercent){
        this.name = name;
        this.iD = iD;
        this.imagePath = imagePath;
        this.absencePercent = absencePercent;
        this.email = iD + "@school.com";
    }

}
