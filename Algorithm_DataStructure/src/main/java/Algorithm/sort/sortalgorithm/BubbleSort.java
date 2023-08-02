package main.java.Algorithm.sort.sortalgorithm;

import static main.java.Algorithm.sort.sortalgorithm.SortTool.swap;

public class BubbleSort extends Sort{

    public BubbleSort(String name){
        super(name);
    }

    @Override
    public <T> void sort(T[] T) {
        for(int i=0; i<T.length; i++){
            for(int j=0; j<T.length-i-1; j++){
                swap(T,j,j+1);
            }
        }
    }

//    private<T> void swap(T[] T,int leftIndex, int rightIndex){
//
//        if(T[leftIndex] instanceof Integer & T[rightIndex] instanceof Integer){
//            Integer tmp;
//            Integer left = (Integer) T[leftIndex];
//            Integer right = (Integer) T[rightIndex];
//
//            if((Integer) T[rightIndex] < (Integer) T[leftIndex]){
//                tmp = left;
//                T[leftIndex] = (T)right;
//                T[rightIndex] = (T)tmp;
//                tmp = 0;
//            }
//        }else{
//            String tmp;
//            String left = (String) T[leftIndex];
//            String right = (String) T[rightIndex];
//
//            if(left.compareToIgnoreCase(right) > 0){
//                tmp = left;
//                T[leftIndex] = (T)right;
//                T[rightIndex] = (T)tmp;
//                tmp = "";
//            }
//
//        }
//    }
}
