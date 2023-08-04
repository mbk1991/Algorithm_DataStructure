package Algorithm.sort;

import Algorithm.sort.arrgen.ArrGenerator;
import Algorithm.sort.sortalgorithm.Sort;

public class Sorter {
    private Sort sort;
    private ArrGenerator aGen;

    public Sorter(Sort sort, ArrGenerator aGen){
        this.sort = sort;
        this.aGen = aGen;
    }
    public <T> Sorter doSort(T[] T){
        System.out.println(sort.getName() + " : 정렬을 수행합니다.");
        sort.sort(T);
        return this;
    }
    public <T> T[] getArr(){
        System.out.println(aGen.getName() + " : 정렬할 배열을 생성합니다.");
        return aGen.genArr();
    }
    public <T> void measureSort(T[] T){
        long start;
        long end;
        System.out.println("정렬전 시각 : " + (start = System.currentTimeMillis()));
        sort.sort(T);
        System.out.println("정렬후 시각 : " + (end = System.currentTimeMillis()));
        System.out.println("정렬소요시간 : " + (end -start));
    }
}
