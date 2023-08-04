package Algorithm.sort.arrgen;

import java.util.Random;

public class RandomGen extends  ArrGenerator{
    private final int KOREAN_UNIKODE_START = 0XAC00;
    private final int KOREAN_UNICODE_BOUND = 0XD7A3 - 0XAC00;

    public RandomGen(String name){
        super(name);
    }

    @Override
    public <T> T[] genArr() {
        Random rd = new Random();
        boolean randomLength = false; // true: 범위내에서 배열의 길이 랜덤 생성, false: 고정길이
        int lengthFrom = 0;
        int lengthTo = 100;
        int intBound = 1000;
        int length = randomLength? (rd.nextInt(lengthFrom + 1)+ lengthTo) : lengthTo;
//        int rand = rd.nextInt(2);
        int rand = 1;
        T[] T;

        if(rand == 0){
            String[] tmp =  new String[length];
            for(int i = 0; i < tmp.length; i++){
                tmp[i] = (char)(rd.nextInt(KOREAN_UNICODE_BOUND) + KOREAN_UNIKODE_START) + "";
            }

            T = (T[])tmp;

        }else{
            Integer[] tmp =  new Integer[length];
            for(int i = 0; i < tmp.length; i++){
                tmp[i] = rd.nextInt(intBound);
            }

            T = (T[]) tmp;
        }

        if(randomLength){
            System.out.println("길이 "+lengthFrom+"~"+(lengthFrom + lengthTo)+"의 String 또는 int 배열을 랜덤으로 생성하여 반환합니다.");
        }else{
            System.out.println("길이" + lengthTo + "의 String 또는 int 배열을 랜덤으로 생성하여 반환합니다.");
        }
        return T;
    }
}
