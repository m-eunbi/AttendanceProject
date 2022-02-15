package dal.BE;

import javafx.scene.image.Image;

import java.net.URL;

public class Student {
    public String name;
    public String iD;
    public URL imagePath;

    public Student(String name, String iD, URL imagePath){
        this.name = name;
        this.iD = iD;
        this.imagePath = imagePath;
    }
}
