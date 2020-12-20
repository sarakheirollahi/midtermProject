import java.util.ArrayList;

public class Student {
    String name;
    String pass;
    int account;
    int point;
    int currentUnit;
    boolean[] food;
    int cardNumber;
    int passCard;
   // ArrayList<Class> StudentClass;


    public Student(String name , String pass){
        food = new boolean[]{false,false,false,false,false,false,false};
        account=0;
        point=0;
        currentUnit=0;
        cardNumber=0;
        passCard=0;
      //  StudentClass =new ArrayList<>();
        this.name=name;
        this.pass=pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getPoint() {
        return point;
    }

    public String getPass() {
        return pass;
    }

    public int getCurrentUnit() {
        return currentUnit;
    }

    public int getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setPoint(int point,int unit){

        this.point = (point*unit)/currentUnit;
    }


    public void increasAccount(int money){
        account =account+money;
    }

    public void removeClase(Class className){
   //  StudentClass.remove(className);
        currentUnit =currentUnit-className.getUnit();
        return ;
    }
    public void addUnit(int unit)
    {
        currentUnit=currentUnit+unit;
    }
    public void reserveFood(int date){

        food[date]=true;
        account=account-2000;
    }

}
