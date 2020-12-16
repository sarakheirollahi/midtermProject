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

    public void addClass(int limit,int unit,String className,String TheacherName,String Time) {
        Class newClass = new Class(unit,limit,className,Time,TheacherName);

        ClassList.add(newClass);
    }
    public void addStudent(Student newStudent){
        StudentList.add(newStudent);
    }
    public void addTheacher(Theacher newTheacher){
        TheacheList.add(newTheacher);
    }
    public void removeClass(String ClassName){

        for ( int j=0  ; j< ClassList.size() ; j++) {
            Class ex =ClassList.get(j);
            if(ex.className==ClassName){
               ClassList.remove(j);
                break;}
            }
        }

    }

