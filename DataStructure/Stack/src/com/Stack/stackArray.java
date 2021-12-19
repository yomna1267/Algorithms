package com.Stack;

public class stackArray {
    public int [] array;
    private int size = -1;
    stackArray(int sz){

        array = new int[sz];
    }
    public boolean isEmpty(){

        return(size == -1);
    }
    public boolean isFull(){

        return(size == array.length-1);
    }
    public void push(int x){
      if(isFull()){
          System.out.println("Stack is full");
      }
      else{
          array[++size] = x;
      }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            --size;
        }
    }
    public int top(){
        if(isEmpty()){
            return (Integer.MAX_VALUE);
        }
        else {
            return (array[size]);
        }
    }
    public int size(){

        return(size+1);
    }
    public void clear(){
        size = -1;
    }
}
