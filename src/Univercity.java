import java.util.ArrayList;

public class Univercity {
    ArrayList<Class> ClassList;
    ArrayList<Student> StudentList;
    ArrayList<Theacher> TheacheList;
    public Univercity(){
        ClassList = new ArrayList<>();
        StudentList = new ArrayList<>();
        TheacheList = new ArrayList<>();
    }

    public ArrayList<Class> getClassList() {
        return ClassList;
    }

    public ArrayList<Student> getStudentList() {
        return StudentList;
    }

    public ArrayList<Theacher> getTheacheList() {
        return TheacheList;
    }

    public void addClass(Class newClass) {
        ClassList.add(newClass);
    }
    public void addStudent(Student newStudent){
        StudentList.add(newStudent);
    }
    public void 
}
