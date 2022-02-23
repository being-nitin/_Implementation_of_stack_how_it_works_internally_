package com.Recursion;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Customstack stack = new Customstack();
        /*stack.push(89);
        stack.push(90);
        stack.push(91);
        stack.push(92);
        stack.push(93);
        stack.push(94);
        */

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
