package dal.BE;

import javafx.scene.image.Image;

import java.net.URL;

public class Student {
    public String name;
    public String iD;
    public String imagePath;

    public Student(String name, String iD, String imagePath){
        this.name = name;
        this.iD = iD;
        this.imagePath = imagePath;
    }
}
