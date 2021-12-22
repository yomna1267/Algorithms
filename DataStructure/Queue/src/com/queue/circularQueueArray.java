package com.queue;

public class circularQueueArray {
    public int[] array;
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    circularQueueArray(int sz){

        array = new int[sz];
    }
    public boolean isEmpty(){

        return(size == 0);
    }
    public boolean isFull(){

        return (size == array.length);
    }
    public void push(int x){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            size++;
            array[(rear+1)%array.length] = x;
            rear++;
        }
    }
    public void pop(){
        if(isEmpty()){
           return;
        }
        else{
            size--;
            front = (front+1)%array.length;
        }
    }
    public int peek(){
        if(isEmpty()){
            return (Integer.MIN_VALUE);
        }
        else{
            return(array[front]);
        }
    }
    public int size(){

        return(size);
    }
    public void clear(){
        front = 0;
        rear = -1;
        size = 0;
    }
}
