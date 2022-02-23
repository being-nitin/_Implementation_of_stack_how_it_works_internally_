package com.Recursion;
import java.util.*;

public class Customstack {
    private int[] data;
    private static final int default_size = 10;
    int top = -1;

    public Customstack(){
        this(default_size);

    }
    public Customstack(int size){
        this.data = new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        top++;
        data[top] = item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("can not pop element from an empty stack ");
        }
        return data[top--];
    }
    public boolean isFull(){
        return top == data.length-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
}
