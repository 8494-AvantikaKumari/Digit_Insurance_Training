import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();
        System.out.println(check(n));

    }

    public static boolean check(String n) {
        int a = n.length();
        for (int i = 0; i < a / 2; i++) {
            if (n.charAt(i) != n.charAt(a - i - 1)) {
                return false;
            }

        }
        return true;
    }
}

