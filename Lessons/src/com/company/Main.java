package com.company;


import com.company.core.Stack;

public class Main {


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("ben");
        stack.push("atinga");
        stack.push("azumah");
        stack.push("authur");

        stack.pop();

        System.out.println(stack.peek());


    }
}
