package com.queue;

public class queueArray {
    public int[] array;
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    queueArray(int sz){

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
    public int pop(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return (Integer.MAX_VALUE);
        }
        else{
            size--;
            int element = array[front];
            front = (front+1)%array.length;
            return(element);
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
