import java.util.*;
class pen{
    String color;
    String type;

    public void display(){
        System.out.println("pen");
    }
    public void did(){
        System.out.println(this.color);
    }
}


public class oops {
    public static void main(String args[]) {
        pen pen1 = new pen();
        pen pen2 = new pen();
        pen1.color = "red";
        pen1.type = "gel";
        pen2.color="blue";

        pen1.display();
        pen2.display();
        pen1.did();
        pen2.did();
    }
}
