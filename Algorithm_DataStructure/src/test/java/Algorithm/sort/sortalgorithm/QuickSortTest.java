package Algorithm.sort.sortalgorithm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class QuickSortTest {
    QuickSort qckSort  = new QuickSort("퀵소트");

//    @BeforeEach
//    void setUp() {
//    }
//
//    @AfterEach
//    void tearDown() {
//    }

    @Test
    void 이름체크() {
        assertEquals("퀵소트", qckSort.getName());
    }

    @Test
    void sort() {
        Integer[] arr = {10,100,1,200,2,300,3,400,4,500,5};
        Integer[] rsltArr = {1,2,3,4,5,100,200,300,400,500};
        qckSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        Assertions.assertArrayEquals(arr,rsltArr);
    }
}