import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Class implements Serializable {
    int unit;
    String className;
    String thaecherName;
    int limit;
    ArrayList<Student> classStudent;
    enum TIME{
        FIRST_TIME,
        SECOND_TIME,
        THIRD_TIME
    }
   TIME time;

     public Class(int unit,int limit,String className,String time,String thaecherName){
         this.thaecherName=thaecherName;
         this.limit=limit;
         this.unit=unit;
         this.className=className;
         this.time = this.time.valueOf(time);
         classStudent =  new ArrayList<>();
     }

    public void setUnit(int unit){
        this.unit=unit;
    }

    public void setName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public int getLimit() {
        return limit;
    }

    public String getThaecherName() {
        return thaecherName;
    }

    public ArrayList<Student> getStudentList() {
        return classStudent;
    }

    public int getUnit() {
        return unit;
    }

    public TIME getTime() {
        return time;
    }

    public Student getStudent(String Name) {
       int j;
        for ( j = 0; j < classStudent.size(); j++) {
            if (classStudent.get(j).getName() == Name) {
              break;
            }
        }
        return classStudent.get(j);
    }
   public int getNumbeOfStudent(){
         return classStudent.size();
   }
   public void addStudent(Student newStudent){
         classStudent.add(newStudent);
   }
}
