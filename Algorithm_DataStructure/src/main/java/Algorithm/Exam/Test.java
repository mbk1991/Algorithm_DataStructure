package main.java.Algorithm.Exam;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        /**
         * (1,2), (1,3),(1,7),(2,3),(5,6),(10,2),(5,4),(4,7),(5,1),(2,9)
         *
         *
         */
        int[][] input = {{1,2},{1,3},{1,7},{2,3},{5,6},{10,2},{5,4},{4,7},{5,1},{2,9}};



    }
}

class Member{
    private int me;
    private ArrayList<Member> myFriends = new ArrayList<>();

    Member(int me){
        this.me = me;
    }

    int getMe(){
        return me;
    }

    int getFriends(){
        return this.myFriends.size();
    }

    int getNewFriends(){
        int newFriends = 0;

        return newFriends;
    }
}
