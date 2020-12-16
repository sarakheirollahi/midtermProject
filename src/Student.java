import java.util.ArrayList;

public class Student {
    String name;
    int point;
    int currentUnit;
    ArrayList<Class> StudentClass;
    public Student(String name){
        StudentClass =new ArrayList<>();
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setPoint(int point,int unit){

        this.point = point*unit;
    }


    public void removeClase(Class removeClass){
        StudentClass.remove(removeClass);
        return ;
    }

}
