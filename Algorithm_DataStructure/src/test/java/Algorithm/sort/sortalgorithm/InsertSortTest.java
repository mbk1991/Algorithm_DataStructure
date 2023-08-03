package Algorithm.sort.sortalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest {
    InsertSort is = new InsertSort("삽입정렬");

    @Test
    void 삽입정렬확인() {
        Integer[] arr = {10,1,9,2,8,3,7,4,6,5};
        Integer[] rsltArr = {1,2,3,4,5,6,7,8,9,10};
        is.sort(arr);
        Assertions.assertArrayEquals(arr,rsltArr);
    }
}