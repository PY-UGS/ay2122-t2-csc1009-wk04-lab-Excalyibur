import java.util.Arrays;
import java.io.*;
import java.util.*;

public class Stack {
    private int[] elements;
    private int size;

    //my variables
    private boolean empty;
    private int temp;
    private int peekval;
    private int popval;


    public Stack(){
        elements = new int[16];
    }

    public Stack(int capacity){
        elements = new int[capacity];
        size =0;
    }


    public int[] printstack(){
        return elements;
    }

    public boolean Empty(){

        if(size==0) {
            empty = true;

        }else{
            empty = false;
            }

        return empty;
    }

    public int peek(){
        temp=elements.length;
        peekval=elements[temp];
        return peekval;
    }

    public void push(int value){
            size += 1;
            elements[size-1]=value;
        }


    public int pop(){
        popval=elements[size-1];
        size -=1;
        return popval;
    }

    //public int getSize(){

   // }
}
