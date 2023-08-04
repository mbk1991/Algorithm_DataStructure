package Algorithm.sort;

import Algorithm.sort.arrgen.ArrGenerator;
import Algorithm.sort.arrgen.InputGen;
import Algorithm.sort.sortalgorithm.BubbleSort;
import Algorithm.sort.sortalgorithm.Sort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    Sort sort = new BubbleSort("버블");
    ArrGenerator arrGenerator = new InputGen("입력");
    Sorter sorter = new Sorter(sort,arrGenerator);

    @Test
    void measureSort확인() {
        Integer[] arr = {10,1,9,2,8,3,7,4,6,5};
        Integer[] rsltArr = {1,2,3,4,5,6,7,8,9,10};
        sorter.measureSort(arr);
        Assertions.assertArrayEquals(arr,rsltArr);
    }
}