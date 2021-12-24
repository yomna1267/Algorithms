package com.LinkedList;

public class linkedList {
    private class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
        }
    }
    Node head,  tail;
    public int size = 0;
    public void insertFirst(int x){
        Node newNode = new Node(x);
        if(tail == null){
            tail = head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void insertLast(int x){
        if(head == null){
           insertFirst(x);
           return;
        }
        Node newNode = new Node(x);
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        tail = newNode;
        size++;
    }
    public void insertPosition(int x, int pos){
        if(pos < 0 || pos > size){
            System.out.println("Out of boundaries");
            return;
        }
        if(pos == 0){
            insertFirst(x);
            return;
        }
        if(pos == size){
            insertLast(x);
            return;
        }
        Node newNode = new Node(x);
        Node current = head;
        for(int i = 0; i < pos-1; ++i){
            current= current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }
    public void deleteFirst(){
        if(head == null){
            return;
        }
        else if(head == tail){
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(tail == null){
            return;
        }
        else if(head == tail){
            head = tail = null;
            size--;
            return;
        }
        else if (head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        tail = current;
        size--;
    }
    public void deletePosition(int pos){
        if(pos < 0 || pos >= size){
            System.out.println("Out of boundaries");
            return;
        }
        if(pos == 0){
            deleteFirst();
            return;
        }
        if(pos == size){
            deleteLast();
            return;
        }
        Node current = head;
        for(int i = 0; i < pos-1; ++i){
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }
    public boolean find(int x){
        Node current = head;
        if(current.data == x){
            return true;
        }
        while (current.next != null){
            current = current.next;
            if(current.data == x){
                return true;
            }
        }
        return false;
    }
    public int search(int x){
        Node current = head;
        int i = 0;
        if(current.data == x){
            return i;
        }
        while (current.next != null){
            current = current.next;
            i++;
            if(current.data == x){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }
    public void display(){
        Node current =  head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}