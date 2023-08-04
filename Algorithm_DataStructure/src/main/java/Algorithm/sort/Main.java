package Algorithm.sort;

import java.util.*;

public class Main {
    public static <T> void main(String[] args){
        String sort;
        String gen;
        Scanner sc = new Scanner(System.in);
        System.out.println("정렬 알고리즘의 종류를 입력하세요. (버블,삽입,선택,퀵,머지)");
        sort = sc.nextLine().replace(" ","").toLowerCase();
        System.out.println("정렬 대상 배열 생성 방법을 입력하세요. (랜덤, 입력)");
        gen = sc.nextLine().replace(" ","").toLowerCase();

        try{
            Sorter sorter = SorterFactory.getSorter(sort,gen);
            T[] T = sorter.getArr();

            System.out.println("정렬 전--- ");
            if(T.length <= 100){
                System.out.println(Arrays.toString(T));
            }
            sorter.measureSort(T);
            System.out.println("정렬 후--- ");
            if(T.length <= 100){
                System.out.println(Arrays.toString(T));
            }

        }catch(Exception e){
            System.out.println("입력값을 확인 후 다시 이용해주세요.");
        }
    }
}
