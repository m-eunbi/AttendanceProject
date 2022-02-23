package dal.BE;

public class Student {
    private String name;
    private String iD;
    private String imagePath;
    private String email;
    private String absencePercent;
    private int[] absencePerDay;

    public Student(String name, String iD, String imagePath, String  absencePercent){
        this.name = name;
        this.iD = iD;
        this.imagePath = imagePath;
        this.absencePercent = absencePercent;
        this.email = iD + "@school.com";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAbsencePercent() {
        return absencePercent;
    }

    public void setAbsencePercent(String absencePercent) {
        this.absencePercent = absencePercent;
    }

    public int[] getAbsencePerDay() {
        return absencePerDay;
    }

    public void setAbsencePerDay(int[] absencePerDay) {
        this.absencePerDay = absencePerDay;
    }
}
