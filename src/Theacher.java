import java.util.ArrayList;

public class Theacher {
    String userName;
    String passWord;
    ArrayList<Class> thaechersClasses;
    public Theacher(String userName,String passWord){
        this.passWord = passWord;
        this.userName=userName;
        thaechersClasses = new ArrayList<>();
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setThecherClass(ArrayList<Class> thecherClass) {
      thaechersClasses = thecherClass;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void AddTheacherClass(Class theacherClass){
        thaechersClasses.add(theacherClass);
    }
}
