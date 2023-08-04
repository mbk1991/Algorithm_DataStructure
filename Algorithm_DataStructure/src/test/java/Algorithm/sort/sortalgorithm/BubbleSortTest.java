package Algorithm.sort.sortalgorithm;

import Algorithm.sort.arrgen.RandomGen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    BubbleSort bs = new BubbleSort("버블소트");
    RandomGen ag = new RandomGen("랜덤생성");
    @Test
    <T> void 버블정렬확인() {
//        Integer[] arr = {10,1,9,2,8,3,7,4,6,5};
//        Integer[] rsltArr = {1,2,3,4,5,6,7,8,9,10};
        T[] arr = ag.genArr();
        T[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        bs.sort(arr);
        Assertions.assertArrayEquals(arr,copy);

    }
}