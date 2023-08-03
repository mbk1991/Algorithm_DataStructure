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

}
