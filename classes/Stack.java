package classes;

import java.util.Scanner;

public class Stack {
    static  int [] arr;
    static  int top =-1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        create(5);
        insert(1);
        insert(2);
        insert(3);
        print();
        delete();
        print();
    }
    public static void create (int i){
       arr =new int[i];

    }
    public static void insert(int num){
        if(top== arr.length-1) {System.out.println("Stack overflow");return;}

        if(top==-1){
            arr[0] = num;
            top=0;
        }else{
        arr[top+1] = num;
        top +=1;}
    }
    public static void print(){
        System.out.print("[");
        for (int i = 0; i <=top; i++) {
            System.out.print(","+arr[i]+"");
        }
        System.out.print("]");
        System.out.println();
    }
    public static void delete(){
        if(top==-1){
            System.out.println("stack underflow");
        }
        System.out.println("element is : "+ arr[top]);
        top -=1;
    }
}
