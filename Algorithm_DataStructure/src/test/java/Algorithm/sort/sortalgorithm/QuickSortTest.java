package Algorithm.sort.sortalgorithm;

import Algorithm.sort.arrgen.RandomGen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class QuickSortTest {
    QuickSort qs  = new QuickSort("퀵소트");
    RandomGen ag = new RandomGen("랜덤생성");

//    @BeforeEach
//    void setUp() {
//    }
//
//    @AfterEach
//    void tearDown() {
//    }

    @Test
    void 이름체크() {
        assertEquals("퀵소트", qs.getName());
    }

    @Test
    <T> void 퀵정렬확인() {
//        Integer[] arr = {10,1,9,2,8,3,7,4,6,5};
//        Integer[] rsltArr = {1,2,3,4,5,6,7,8,9,10};
        T[] arr = ag.genArr();
        T[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        qs.sort(arr);
        Assertions.assertArrayEquals(arr,copy);
    }

    @Test
    void partition확인() {
        Integer[] arr = {3,2,1,5};  // {1,2,3,5} pivotIndex == 2
        int rslt = qs.partition(arr,0,arr.length-1);

        Assertions.assertEquals(2,rslt);
    }
}