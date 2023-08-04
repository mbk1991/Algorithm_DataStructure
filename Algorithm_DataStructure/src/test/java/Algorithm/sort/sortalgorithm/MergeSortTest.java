package Algorithm.sort.sortalgorithm;

import Algorithm.sort.arrgen.RandomGen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    RandomGen ag = new RandomGen("랜덤생성");
    MergeSort ms = new MergeSort("병합정렬");

    @Test
    <T> void sort() {
//                Integer[] arr = {10,1,9,2,8,3,7,4,6,5};
//                Integer[] copy = {1,2,3,4,5,6,7,8,9,10};
        T[] arr = ag.genArr();
        T[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        ms.sort(arr);
        Assertions.assertArrayEquals(arr,copy);
    }
}