package Algorithm.sort.sortalgorithm;

import java.util.Arrays;

import static Algorithm.sort.sortalgorithm.SortTool.compareT;

public class MergeSort extends Sort {

    public MergeSort(String name){
        super(name);
    }

    @Override
    public <T> void sort(T[] T) {
        T[] src = Arrays.copyOf(T, T.length);
        int start = 0;
        int end = T.length-1;

        mergeSort(T, src, start, end);
    }

    public <T> void mergeSort(T[] dest, T[] src, int s, int e){

        int length = e - s;

        if(length < 1){
            return;
        }
        int m = (s + e) >>> 1;
        mergeSort(dest, src, s, m);
        mergeSort(dest, src, m+1, e);

        for(int j=s; j<=e; j++){
            src[j] = dest[j];
        }

        for(int k=s, p1=s, p2=m+1; k<=e; k++){
            if(p2 > e || p1 <= m && compareT(src[p1], src[p2]) < 0){
                dest[k] = src[p1++];
            }else{
                dest[k] = src[p2++];
            }
        }
//        System.out.println(Arrays.toString(T));
    }
}
