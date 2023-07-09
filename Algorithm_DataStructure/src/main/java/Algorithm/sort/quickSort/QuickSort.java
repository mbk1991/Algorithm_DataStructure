package main.java.Algorithm.sort.quickSort;

public class QuickSort {
    /**
     * 퀵정렬(QuickSort)
     * 시간복잡도 O(nlogn)의 준수한 정렬
     * 피벗(pivot)이라는 기준점을 정하고
     * 피벗보다 작은 수는 피벗의 왼쪽, 피벗보다 큰 수는 피벗의 오른쪽으로 배치한다.
     * 자연스럽게 피벗으로 정해진 요소의 위치는 확정된다.
     * 피벗의 왼쪽부분과 오른쪽 부분에 대하여 재귀적으로 처리하여 정렬을 완성한다.
     *
     */
    public static void main(String[] args){
        int[] A = {10,23,4,523,1,8,99,12,32,44,1,16,8,88,7,42};
        quickSort(A,0,A.length-1);
    }

    private static void quickSort(int[] A, int S, int E){
        //피벗을 정한다. 퀵정렬의 정렬속도는 피벗으로 선정하는 값의 영향을 받는다. 정렬의 편의상 배열의 첫번째 요소를 피벗으로 삼는다.
        //투포인터를 이용하여 피벗보다 작은값과 큰값을 찾아 위치를 바꾸는 식으로 재배치한다.
        //피벗보다 작은무리(왼쪽)와 피벗보다 큰무리(오른쪽)의 사이에 피벗을 위치시킴으로써 피벗의 위치를 확정한다.
        //피벗보다 작은 무리에 대하여 재귀적으로 퀵정렬을 수행한다.
        //피벗보다 큰 무리에 대하여 재귀적으로 퀵정렬을 수행한다.
        //A는 정렬대상 배열, S(start)와 E(end)는 배열 내 정렬 범위를 뜻한다.

        int pivot = A[0];
        System.out.println("피벗" + A[0]);
        int largeSearch = S+1;
        int smallSearch = E;

        while(largeSearch<smallSearch){
            while(A[largeSearch] <= pivot & largeSearch < A.length){
                largeSearch++;
            }
            while(A[smallSearch] > pivot & smallSearch >= 1){
                smallSearch--;
            }
            if(largeSearch < smallSearch){
                swapElement(A,smallSearch,largeSearch);
            }
            printArr(A);
        }
        int pivotLocateIndex = A[smallSearch] < A[largeSearch] ? smallSearch : largeSearch;
        swapElement(A,0,pivotLocateIndex);
        printArr(A);

        if(pivotLocateIndex - S > 1){
            quickSort(A,0,pivotLocateIndex-1);
        }
        if(E - pivotLocateIndex > 1){
            quickSort(A,pivotLocateIndex,A.length-1);
        }
    }

    private static void swapElement(int[]A, int i, int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    private static void printArr(int[]A){
        for(int n:A){
        }
    }
}
