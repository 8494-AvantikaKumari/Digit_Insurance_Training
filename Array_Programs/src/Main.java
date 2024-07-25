//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=scn.nextInt();

        int array[]=new int[size];  //initiate a array.
        for (int i = 0; i < size; i++) {
            System.out.print("elements:"+ i +":");
            array[i]=scn.nextInt();
        }
        System.out.println("elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.println("array elements "+i+":"+array[i]);

        }
        }
    }
