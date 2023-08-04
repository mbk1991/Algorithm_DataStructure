package Algorithm.sort.sortalgorithm;

import static Algorithm.sort.sortalgorithm.SortTool.compareT;
import static Algorithm.sort.sortalgorithm.SortTool.swap;

public class QuickSort extends Sort {

    public QuickSort(String name) {
        super(name);
    }

    @Override
    public <T> void sort(T[] T) {
        int start = 0;
        int end = T.length - 1;
        qckSort(T, start, end);
    }

    public <T> void qckSort(T[] T, int s, int e) {
        int pivotIndex = partition(T, s, e);
        if (pivotIndex - s > 1) {
            qckSort(T, s, pivotIndex - 1);
        }
        if (e - pivotIndex > 1) {
            qckSort(T, pivotIndex + 1, e);
        }
    }

    public <T> int partition(T[] T, int s, int e) {
        int pivotIndex = s;
        int i = s + 1;
        int j = e;

        while (i < j) {
            while (compareT(T[i], T[pivotIndex]) < 0 && i < j) {
                i++;
            }
            while (compareT(T[j], T[pivotIndex]) > 0 && i < j) {
                j--;
            }
            swap(T, i, j);
        }

        if (compareT(T[j], T[pivotIndex]) < 0) {
            swap(T, pivotIndex, j);
        } else {
            swap(T, pivotIndex, --j);
        }
        pivotIndex = j;
//        System.out.println(Arrays.toString(T));

        return pivotIndex;
    }
}



//    /**
//     * 퀵정렬(QuickSort)
//     * 시간복잡도 O(nlogn)의 준수한 정렬
//     * 피벗(pivot)이라는 기준점을 정하고
//     * 피벗보다 작은 수는 피벗의 왼쪽, 피벗보다 큰 수는 피벗의 오른쪽으로 배치한다.
//     * 자연스럽게 피벗으로 정해진 요소의 위치는 확정된다.
//     * 피벗의 왼쪽부분과 오른쪽 부분에 대하여 재귀적으로 처리하여 정렬을 완성한다.
//     *
//     */
//    public static void main(String[] args){
//        int[] A = {10,1,2,3,4,6,7,8,9,1,44,51,2,3,423,1,23};
//        quickSort(A,0,A.length-1);
//        printArr(A);
//    }
//
//    private static void quickSort(int[] A, int S, int E){
//        //피벗을 정한다. 퀵정렬의 정렬속도는 피벗으로 선정하는 값의 영향을 받는다. 정렬의 편의상 배열의 첫번째 요소를 피벗으로 삼는다.
//        //투포인터를 이용하여 피벗보다 작은값과 큰값을 찾아 위치를 바꾸는 식으로 재배치한다.
//        //피벗보다 작은무리(왼쪽)와 피벗보다 큰무리(오른쪽)의 사이에 피벗을 위치시킴으로써 피벗의 위치를 확정한다.
//        //피벗보다 작은 무리에 대하여 재귀적으로 퀵정렬을 수행한다.
//        //피벗보다 큰 무리에 대하여 재귀적으로 퀵정렬을 수행한다.
//        //A는 정렬대상 배열, S(start)와 E(end)는 배열 내 정렬 범위를 뜻한다.
//
//        int pivot = A[S]; //시작인덱스를 pivot으로 정한다.
//        int i = S+1; //앞에서 뒤로가는 포인터
//        int j = E; //뒤에서 앞으로 오는 포인터
//
//        //pivot보다 작은 값은 왼쪽, pivot보다 큰 값은 오른쪽으로 배치한다.
//        //i포인터는 뒤로 이동하면서 pivot보다 큰 값을 찾는다.
//        //j포인터는 앞으로 이동하면서 pivot보다 작은 값을 찾는다.
//
//        while(i < j){
//            while(A[i] < pivot & i < E){
//                i++;
//            }
//            while(A[j] > pivot & j >= S+1){
//                j--;
//            }
//            if(i <= j){
//                swapElement(A,i,j);
//                i++;
//                j--;
//            }
//        }
//        //pivot의 위치
//        if(A[--i] < pivot){
//            swapElement(A,S,i);
//        }
//        printArr(A);
//
//        //재귀적 처리
//        if(i > 1){
//            quickSort(A,0,i);
//        }
//        if((E-i) > 1){
//            quickSort(A,i+1,E);
//        }
//    }
//
//    private static void swapElement(int[]A, int i, int j){
//        int tmp = A[i];
//        A[i] = A[j];
//        A[j] = tmp;
//    }
//
//    private static void printArr(int[]A){
//        for(int n:A){
//            System.out.print(n + " ");
//        }
//        System.out.println();
//    }



