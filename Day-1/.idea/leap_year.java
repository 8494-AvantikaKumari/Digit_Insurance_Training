import java.util.*;
class leap_year {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a 4 digit year: ");
        String year=scn.nextLine();

        if(year.matches("\\d{4}")) {
            int year_int = Integer.parseInt(year);
            boolean isLeap = (year_int % 4 == 0 && year_int % 100 != 0 || year_int % 400 == 0);
            if (isLeap) {
                System.out.println("year is leap");
            } else {
                System.out.println("year is not leap");
            }

        } else{
            System.out.println("enter a valid year");
            }

        }
    }

