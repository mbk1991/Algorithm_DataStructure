package Algorithm.sort.sortalgorithm;

import static Algorithm.sort.sortalgorithm.SortTool.compareT;
import static Algorithm.sort.sortalgorithm.SortTool.insert;

public class InsertSort extends Sort{

    public InsertSort(String name){
        super(name);
    }

    @Override
    public <T> void sort(T[] T) {
        for(int i=1; i<T.length; i++){
            for(int j=0; j<=i-1; j++){
                if(compareT(T[i], T[j]) < 0){
                    insert(T, i, j);  // i번째 인덱스의 값을 j번째 인덱스의 위치에 삽입
                }
            }
        }
    }
}
