package Algorithm.sort.sortalgorithm;

public class SortTool {

    public static <T> void swap(T[] T, int leftIndex, int rightIndex){
        T tmp = T[leftIndex];
        T[leftIndex] = T[rightIndex];
        T[rightIndex] = tmp;
    }

    public static <T> void insert(T[] T, int targetIndex, int locationIndex){
        if(targetIndex < locationIndex){
            return;
        }
        T tmp = T[targetIndex];
        for(int i=targetIndex; i>locationIndex; i--){
            T[i] = T[i-1];
        }
        T[locationIndex] = tmp;
    }

    public static <T> int compareT(T t1, T t2){
        if(t1 instanceof Integer && t2 instanceof Integer){
            return (Integer) t1 - (Integer) t2;
        }else{
            String strT1 = (String) t1;
            String strT2 = (String) t2;
            return strT1.compareToIgnoreCase(strT2);
        }
    }
}
