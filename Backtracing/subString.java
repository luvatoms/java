package Backtracing;
import java.util.*;

//find the all subset of a string using backtracking
public class subString {
    public static void main(String args[]) {
        System.out.println("enter your String : ");
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
        SubString(s, "", 0);
    }

    public static void SubString(String s, String ans, int i) {
        // base case
        if (i == s.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }

            return;
        }
        // yes choice
        SubString(s, ans + s.charAt(i), i + 1);
        // no choice
        SubString(s, ans, i + 1);
    }
}
