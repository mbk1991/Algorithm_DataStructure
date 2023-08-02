package main.java.Algorithm.sort;

import main.java.Algorithm.sort.arrgen.ArrGenerator;
import main.java.Algorithm.sort.arrgen.InputGen;
import main.java.Algorithm.sort.arrgen.RandomGen;
import main.java.Algorithm.sort.sortalgorithm.*;

public class SorterFactory {
    private final static String[]  CHK_SORT = {"버블,bubble","삽입,인서트,insert","선택,셀렉트,셀렉션,select","퀵,quick","병합,머지,merge"};
    private final static String[] CHK_GEN = {"랜덤,random","입력,input"};

    private SorterFactory(){}

    public static Sorter getSorter(String sort, String gen) throws Exception {
        Sort s = null;
        ArrGenerator a = null;

        sort = sort.replace(" ","");
        gen = gen.replace(" ","");

        for(int i=0; i<CHK_SORT.length; i++){
            if(CHK_SORT[i].contains(sort)){
                switch(i){
                    case 0: s = getBubbleSort(); break;
                    case 1: s = getInsertSort(); break;
                    case 2: s = getSelectionSort(); break;
                    case 3: s = getQuickSort(); break;
                    case 4: s = getMergeSort(); break;
                }
            }
        }

        for(int i=0; i<CHK_GEN.length; i++){
            if(CHK_GEN[i].contains(gen)){
                switch(i){
                    case 0: a = getRandomGen(); break;
                    case 1: a = getInputGen(); break;
                }
            }
        }
        if(s == null && a == null){
            throw new Exception();
        }

        return new Sorter(s,a);
    }

    private static BubbleSort getBubbleSort(){
        return new BubbleSort("Bubble Sort!");
    }
    private static InsertSort getInsertSort(){
        return new InsertSort("Insert Sort!");
    }
    private static SelectionSort getSelectionSort(){
        return new SelectionSort("Selection Sort!");
    }
    private static QuickSort getQuickSort(){
        return new QuickSort("Quick Sort!");
    }
    private static MergeSort getMergeSort(){
        return new MergeSort("Merge Sort!");
    }
    private static RandomGen getRandomGen(){
        return new RandomGen("Random Generator!!");
    }
    private static InputGen getInputGen(){
        return new InputGen("Input Generator!!");
    }
}
