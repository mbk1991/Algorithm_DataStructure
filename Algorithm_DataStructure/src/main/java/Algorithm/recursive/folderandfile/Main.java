package Algorithm.recursive.folderandfile;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Folder root = new Folder("root");
        Folder A = new Folder("A");
        Folder B = new Folder("B");
        Folder C = new Folder("C");
        Folder A1 = new Folder("A1");
        Folder B1 = new Folder("B1");

        File file1 = new File(10,"file1");
        File file2 = new File(20,"file2");
        File file3 = new File(30,"file3");
        File file4 = new File(40,"file4");
        File file5 = new File(50,"file5");

        root.addList(A);
        root.addList(B);
        root.addList(C);
        A.addList(A1);
        B.addList(B1);
        A1.addList(file1);
        B1.addList(file2);
        B1.addList(file3);
        C.addList(file4);
        C.addList(file5);

        System.out.println("파일명을 입력하세요.");
        String input = sc.nextLine();

        root.fileSizeSearch(input);





    }
}
