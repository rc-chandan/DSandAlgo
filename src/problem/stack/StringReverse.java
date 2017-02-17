package problem.stack;

import ds.stack.Stack;

import java.util.Scanner;

/**
 * Created by rc_chandan on 18/02/17.
 */

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse it : ");
        String str = sc.nextLine();
        System.out.println("Reverse of the entered string is : "
                + new StringReverse().reverse(str));
    }

    public String reverse(String str) {

        String reverseStr = "";
        Stack<Character> stack = new Stack<>(Character.class, str.length());

        for (int i=0; i<str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while(!stack.isEmpty()) {
            char c = stack.pop();
            reverseStr += c;
        }
        return reverseStr;
    }
}
