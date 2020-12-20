import java.io.Serializable;
import java.util.ArrayList;

public class Univercity implements Serializable {
   private   ArrayList<Class> ClassList;
   private   ArrayList<Student> StudentList;
   private   ArrayList<Theacher> TheacheList;
   private String [] food;
   private String userName;
   private String passWord;


    public Univercity(){
        userName="sarakheirollahi";
        passWord="1234";
        ClassList = new ArrayList<>();
        StudentList = new ArrayList<>();
        TheacheList = new ArrayList<>();
        food = new String[7];
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

  //  public void setFood(String[] food) {
      //  this.food = food;
   // }

    public String[] getFood() {
        return food;
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

    public String getPassWord() {
        return passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void addClass(int limit, int unit, String className, String TheacherName, String Time) {
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
    public void setFood(int day,String foodName){

        food[day] =foodName;
     /*   switch (foodName) {
            case 1:
                food[day] = "PIZZA";
                break;
            case 2:
                food[day] = "PASTA";
                break;
            case 3:
                food[day] = "SALMON";
                break;
            case 4:
                food[day] = "VPALTE";
                break;
            default:
                break;
        }*/

    }
    public boolean chekClass(String user){

        for ( int j=0  ; j< ClassList.size() ; j++) {

            if( ClassList.get(j).getClassName().equals(user)){
                return true;
            }
        }
        return false;
    }


    public Class findClass(String className){

        for ( int j=0  ; j< ClassList.size() ; j++) {

            if( ClassList.get(j).getClassName().equals(className) ){
                return ClassList.get(j);
            }
        }
        return null;
    }
    public boolean chekThecher(String user){

        for ( int j=0  ; j< TheacheList.size() ; j++) {

            if( TheacheList.get(j).getUserName().equals(user)){
                return true;
            }
        }
        return false;
    }

     public Theacher findThecher(String user){

         for ( int j=0  ; j< TheacheList.size() ; j++) {

             if( TheacheList.get(j).getUserName().equals(user) ){
              return TheacheList.get(j);
             }
         }
         return null;
     }
    public boolean chekStudent(String user){

        for ( int j=0  ; j< StudentList.size() ; j++) {

            if( StudentList.get(j).getName().equals(user) ){
                return true;
            }
        }
        return false;
    }



    public Student findStudent(String user){

        for ( int j=0  ; j< StudentList.size() ; j++) {

            if(StudentList.get(j).getName().equals(user)){
                return StudentList.get(j);
            }
        }
        return null;
    }
    public void getClass(String user,String addingClass){
        findStudent(user).addUnit(findClass(addingClass).getUnit());
        findClass(addingClass).addStudent(findStudent(user));
    }




}

