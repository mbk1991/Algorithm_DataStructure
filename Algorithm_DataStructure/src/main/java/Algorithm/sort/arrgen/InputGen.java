package Algorithm.sort.arrgen;

import java.util.Scanner;

public class InputGen extends ArrGenerator {

    public InputGen(String name){
        super(name);
    }

    @Override
    public <T> T[] genArr() {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 및 문자를 공백으로 구분하여 입력하세요.\n(문자가 없을 경우 int 배열, 문자가 있을 경우 String 배열 반환) >>");
        String strInput = sc.nextLine();
        strInput.trim();
        T[] T;

        String[] strArr = strInput.split(" +");
        Integer[] intArr = new Integer[strArr.length];

        for(int i=0; i<strArr.length; i++){
            try{
                intArr[i] = Integer.parseInt(strArr[i]);
            }catch(NumberFormatException e){
                T = (T[]) strArr;
                return T;
            }
        }
        T = (T[]) intArr;
        return T;
    }
}
