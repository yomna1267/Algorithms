package com.queue;

public class circularPriorityQueue {
    public int[] array;
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    circularPriorityQueue(int sz){

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
            int temp = rear;
            int i, cnt;
            if(temp == -1){
                array[0] = x;
                size++;
                rear = (rear+1)%array.length;
                return;
            }
            if(size == 1 && array[temp] > x){
                array[(temp+1)%array.length] = array[temp];
                array[temp] = x;
                size++;
                rear = (rear+1)%array.length;
                return;
            }
            else if(size == 1 && array[temp] <= x){
                array[(temp+1)%array.length] = x;
                size++;
                rear = (rear+1)%array.length;
                return;
            }
            for( i = temp, cnt = 0; cnt < size; ++cnt){
                if(array[i] > x){
                    array[(i+1)%array.length] = array[i];
                    array[i] = x;
                    i--;
                    i = ((i%array.length)+array.length)%array.length;
                }
                else
                    break;
            }
            size++;
            rear = (rear+1)%array.length;
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
