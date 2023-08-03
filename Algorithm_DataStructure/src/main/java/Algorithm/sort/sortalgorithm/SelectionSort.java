package Algorithm.sort.sortalgorithm;

import static Algorithm.sort.sortalgorithm.SortTool.compareT;
import static Algorithm.sort.sortalgorithm.SortTool.swap;

public class SelectionSort extends Sort {

    public SelectionSort(String name){
        super(name);
    }

    @Override
    public <T> void sort(T[] T) {
        for(int i=0; i<T.length; i++){
            int minIndex = i;
            for(int j=i+1; j<T.length; j++){
                if(compareT(T[minIndex], T[j]) > 0){  // j번째 인덱스의 값이 minIndex의 값보다 작으면
                    minIndex = j;
                }
            }
            swap(T,i,minIndex);
        }
    }
}
