package com.queue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        int size = scan.nextInt();
        queueArray queue = new queueArray(size);
        queue.push(50);
        queue.push(40);
        queue.push(30);
        System.out.println(queue.pop());
        System.out.println(queue.size());
        System.out.println(queue.pop());
        System.out.println(queue.size());
        System.out.println(queue.pop());
        System.out.println(queue.size());
        System.out.println(queue.pop());
        System.out.println(queue.size());
    }
}
