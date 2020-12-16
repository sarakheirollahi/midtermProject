import java.util.ArrayList;

public class Theacher {
    String userName;
    String passWord;
    ArrayList<Class> thaechersClasses;

    public Theacher(String userName, String passWord) {
        this.passWord = passWord;
        this.userName = userName;
        thaechersClasses = new ArrayList<>();
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void theacheAddClass(int limit, int unit, String className, String TheacherName, String Time) {
        Univercity uni = new Univercity();
        uni.addClass(unit, limit, className, Time, TheacherName);
    }

    public ArrayList<Student> StudentClass(String ClassName) {
        for (Class ex : thaechersClasses){
            if(ex.getClassName()==ClassName){
                return ex.getStudentList();
            }
            else
                return null;
        }
        return null;
    }
    public void setPoint(int point,String studentName,String className){

        for ( int j=0  ; j< thaechersClasses.size() ; j++) {
            if(   thaechersClasses.get(j).getClassName()==className){
               thaechersClasses.get(j).getStudent(studentName).setPoint(point,thaechersClasses.get(j).getUnit());
                break;}
        }
        return;

    }

}
