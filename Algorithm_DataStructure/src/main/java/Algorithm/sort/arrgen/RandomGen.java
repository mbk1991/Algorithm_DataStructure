package main.java.Algorithm.sort.arrgen;

import java.util.Random;

public class RandomGen extends  ArrGenerator{

    public RandomGen(String name){
        super(name);
    }

    @Override
    public <T> T[] genArr() {
        Random rd = new Random();
        int length = rd.nextInt(10)+ 10;

        int rand = (int) Math.random()*2 + 1;

        T[] T;
        if(rand == 0){
            String[] tmp =  new String[length];
            for(int i = 0; i < tmp.length; i++){
                tmp[i] = (char)(rd.nextInt(10151) + 44032) + "";
            }

            T = (T[])tmp;

        }else{
            Integer[] tmp =  new Integer[length];
            for(int i = 0; i < tmp.length; i++){
                tmp[i] = rd.nextInt(100);
            }

            T = (T[]) tmp;
        }

        System.out.println("길이 10~20의 String 또는 int 배열을 랜덤으로 생성하여 반환합니다.");

        return T;
    }
}
