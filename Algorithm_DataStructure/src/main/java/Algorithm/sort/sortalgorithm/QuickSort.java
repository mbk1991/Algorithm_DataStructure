package Algorithm.sort.sortalgorithm;

import static Algorithm.sort.sortalgorithm.SortTool.compareT;
import static Algorithm.sort.sortalgorithm.SortTool.swap;

/**
 * 퀵정렬(QuickSort)
 * 시간복잡도 O(nlogn)의 준수한 정렬
 * 피벗(pivot)이라는 기준점을 정하고
 * 피벗보다 작은 수는 피벗의 왼쪽, 피벗보다 큰 수는 피벗의 오른쪽으로 배치한다.
 * 자연스럽게 피벗으로 정해진 요소의 위치는 확정된다.
 * 피벗의 왼쪽부분과 오른쪽 부분에 대하여 재귀적으로 처리하여 정렬을 완성한다.
 *
 */
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