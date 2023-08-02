package main.java.Algorithm.Exam;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
//        recursive(5);
        System.out.println(recursive2(5));
    }

    public static int recursive(int n){
        System.out.println(n);
        if(n>0){
            return recursive(--n);
        }else{
            return n;
        }
    }

    public static int recursive2(int n){
        if(n-2 >= 0){
            return recursive2(n-2) + recursive2(n-1);
        }else{
            return 1;
        }
    }
}
