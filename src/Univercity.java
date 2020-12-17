import java.util.ArrayList;

public class Univercity {
    ArrayList<Class> ClassList;
    ArrayList<Student> StudentList;
    ArrayList<Theacher> TheacheList;
    String [][] food;
    String userName;
    String passWord;


    public Univercity(){
        userName="sarakheirollahi";
        passWord="1234";
        ClassList = new ArrayList<>();
        StudentList = new ArrayList<>();
        TheacheList = new ArrayList<>();
        food = new String[7][2];
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setFood(String[][] food) {
        this.food = food;
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
    public void addStudent(String name ,String pass)
    {
        Student newStudent= new Student(name,pass);
        StudentList.add(newStudent);
    }

    public void addTheacher(String name ,String pass){
        Theacher newTheacher =new Theacher(name,pass);
        TheacheList.add(newTheacher);
    }

    public void removeClass(String ClassName){

        for ( int j=0  ; j< ClassList.size() ; j++) {
            if(ClassList.get(j).className==ClassName){
         ArrayList<Student> classStudent = ClassList.get(j).classStudent;
                for ( int i=0  ; i< classStudent.size() ; i++) {
                    classStudent.get(i).removeClase(ClassList.get(j));
                }
                ClassList.remove(j);
                break;}
            }
        }
    public void setPoint(int point,String studentName,String className){

        for ( int j=0  ; j< ClassList.size() ; j++) {
            if(   ClassList.get(j).getClassName()==className){
                ClassList.get(j).getStudent(studentName).setPoint(point,ClassList.get(j).getUnit());
                break;}
        }
    }
    public void setFood(int day,int food){

        }




    }

