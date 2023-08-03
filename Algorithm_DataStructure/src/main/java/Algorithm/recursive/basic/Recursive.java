package Algorithm.recursive.basic;


public class Recursive {

    public static void main(String[] args){
        recursive(10);
    }
    private static void recursive(int n){
        if(n>1){
            recursive(n-1);
        }
        System.out.println(n);
    }
}


