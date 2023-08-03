package Algorithm.sort.sortalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortToolTest {

    @Test
    void swap테스트() {
        Integer[] arr = {9,1};
        Integer[] rsltArr = {1,9};

        String[] sArr = {"가","하"};
        String[] rsltSArr = {"하","가"};

        SortTool.swap(sArr,0,1);
        SortTool.swap(arr,0,1);

        Assertions.assertArrayEquals(arr,rsltArr);
        Assertions.assertArrayEquals(sArr,rsltSArr);
    }

    @Test
    void insert테스트() {
    }

    @Test
    void compareT테스트() {
    }
}