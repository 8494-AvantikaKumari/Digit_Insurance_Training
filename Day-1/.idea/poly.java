class Student{
    String name;
    int roll_no;
    public void info(String name){
        System.out.println(name);
    }
    public void info(int roll_no){
        System.out.println(roll_no);
    }


}
public class poly {
    public static void main(String[] args){
        Student student1=new Student();
        student1.name="aman";
        student1.roll_no=3;

        student1.info(student1.name);
        student1.info(student1.roll_no);
    }
}
