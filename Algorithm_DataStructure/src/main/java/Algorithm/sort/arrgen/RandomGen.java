package Algorithm.sort.arrgen;

import java.util.Random;

public class RandomGen extends  ArrGenerator{

    public RandomGen(String name){
        super(name);
    }

    @Override
    public <T> T[] genArr() {
        Random rd = new Random();
        int lengthFrom = 1000;
        int lengthTo = 1000;
        int koreanUnicodeBound = 0XD7A3 - 0XAC00;
        int koreanUnicodeFrom = 0XAC00;
        int intBound = 1000;
        int length = rd.nextInt(lengthFrom)+ lengthTo;
        int rand = rd.nextInt(2);
        T[] T;

        if(rand == 0){
            String[] tmp =  new String[length];
            for(int i = 0; i < tmp.length; i++){
                tmp[i] = (char)(rd.nextInt(koreanUnicodeBound) + koreanUnicodeFrom) + "";
            }

            T = (T[])tmp;

        }else{
            Integer[] tmp =  new Integer[length];
            for(int i = 0; i < tmp.length; i++){
                tmp[i] = rd.nextInt(intBound);
            }

            T = (T[]) tmp;
        }

        System.out.println("길이 "+lengthFrom+"~"+(lengthFrom + lengthTo)+"의 String 또는 int 배열을 랜덤으로 생성하여 반환합니다.");

        return T;
    }
}
