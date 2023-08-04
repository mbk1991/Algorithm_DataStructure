package Algorithm.sort.sortalgorithm;

import java.util.Arrays;

import static Algorithm.sort.sortalgorithm.SortTool.compareT;

public class MergeSort extends Sort {

    public MergeSort(String name){
        super(name);
    }

    @Override
    public <T> void sort(T[] T) {
        T[] copy = Arrays.copyOf(T, T.length);
        int start = 0;
        int end = T.length-1;

        mergeSort(T, copy, start, end);
    }

    public <T> void mergeSort(T[] T, T[] copy, int s, int e){
        if((e - s) < 1){
            return;
        }
        int m = s + (e - s) / 2;
        mergeSort(T, copy, s, m);
        mergeSort(T, copy, m+1, e);

        for(int j=s; j<=e; j++){
            copy[j] = T[j];
        }

        int i = s;
        int p1 = s;
        int p2 = m+1;

        while(p1 <= m && p2 <= e){
            if(compareT(T[p1], T[p2]) < 0){
                T[i] = copy[p1];
                p1++;
                i++;
            }else{
                T[i] = copy[p2];
                p2++;
                i++;
            }
        }

        while(p1 <= m){
            T[i] = copy[p1];
            p1++;
            i++;
        }
        while(p2 <= e){
            T[i] = copy[p2];
            p2++;
            i++;
        }

        System.out.println(Arrays.toString(T));
    }
}
