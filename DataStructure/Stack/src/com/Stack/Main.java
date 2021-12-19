package com.Stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of your stack");
        int size = scan.nextInt(); //4
        stackArray stack = new stackArray(size);
        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        System.out.println(stack.size());
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.size());
    }
}
