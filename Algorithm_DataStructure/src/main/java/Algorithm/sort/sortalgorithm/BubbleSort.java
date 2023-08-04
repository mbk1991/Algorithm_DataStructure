package Algorithm.sort.sortalgorithm;

import static Algorithm.sort.sortalgorithm.SortTool.compareT;
import static Algorithm.sort.sortalgorithm.SortTool.swap;

public class BubbleSort extends Sort{

    public BubbleSort(String name){
        super(name);
    }

    @Override
    public <T> void sort(T[] T) {
        boolean flag = true;
        for(int i=0; i<T.length; i++){
            for(int j=0; j<T.length-i-1; j++){
                if(compareT( T[j], T[j+1]) > 0){
                    swap(T,j,j+1);
                }
                flag = false;
            }
            if(flag){
                break;
            }
        }
    }
}
