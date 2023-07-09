package main.java.Algorithm.recursive.pibonacci;

public class Pibonacci {
    public static void main(String[] args){

        printPibonacci(10);

    }
    static int pibonacci(int n){
        if(n<0){
            System.out.println("1이상의 숫자를 입력하세요.");
        }
        int currentNum;
        if(n>=2){
            currentNum = pibonacci(n-1) + pibonacci(n-2);
        }else if(n==0){
            currentNum = 0;
        }else{
            currentNum = 1;
        }
        return currentNum;
    }

    static void printPibonacci(int n){
        int i=1;
        while(i<=n){
            System.out.print(pibonacci(i) + " ");
            i++;
        }
        System.out.println();
    }
}
