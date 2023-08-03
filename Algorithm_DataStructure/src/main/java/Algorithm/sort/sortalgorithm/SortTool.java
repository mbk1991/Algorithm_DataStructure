package Algorithm.sort.sortalgorithm;

public class SortTool {

    public static <T> void swap(T[] T, int leftIndex, int rightIndex){
            T tmp;
            T left = T[leftIndex];
            T right = T[rightIndex];

            tmp = left;
            T[leftIndex] = right;
            T[rightIndex] = tmp;
    }

    public static <T> void insert(T[] T, int targetIndex, int locationIndex){
        T tmp = T[targetIndex];
        int i = 0;
        while(locationIndex < targetIndex - i & targetIndex - i - 1 >= 0){
            T[targetIndex - i] = T[targetIndex- i - 1];
            i++;
        }
        T[locationIndex] = tmp;
    }

    public static <T> int compareT(T t1, T t2){
        if(t1 instanceof Integer & t2 instanceof Integer){
            return (Integer) t1 - (Integer) t2;
        }else{
            String strT1 = (String) t1;
            String strT2 = (String) t2;
            return strT1.compareToIgnoreCase(strT2);
        }
    }
}
