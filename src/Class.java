import java.awt.*;
import java.util.ArrayList;

public class Class {
    int unit;
    String name;
    String thaecherName;
    int limit;
    ArrayList<Student> classStudent;
    enum TIME{
        First,
        Second,
        Third
    }
   TIME time;

     public Class(int unit,int limit,String name,String time,String thaecherName){
         this.thaecherName=thaecherName;
         this.limit=limit;
         this.unit=unit;
         this.name=name;
         this.time = this.time.valueOf(time);
     }

    public void setUnit(int unit){
        this.unit=unit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUnit() {
        return unit;
    }

    public TIME getTime() {
        return time;
    }
}
