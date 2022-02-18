package dal.BE;

public class Student {
    public String name;
    public String iD;
    public String imagePath;
    public String email;

    public Student(String name, String iD, String imagePath){
        this.name = name;
        this.iD = iD;
        this.imagePath = imagePath;
        this.email = iD + "@school.com";
    }
}
