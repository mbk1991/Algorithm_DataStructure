import java.util.*;

class Example {
    public int solution(int[][] relationships, int target, int limit) {
        int answer = 0;
        Member[] members = new Member[101];
        for(int i=1; i<=100; i++){
            members[i] = new Member(i);
        }

        for(int i=0; i<relationships.length; i++){
            members[relationships[i][0]].setFriend(members[relationships[i][1]]);
            members[relationships[i][1]].setFriend(members[relationships[i][0]]);
        }

        System.out.println(members[target].getMe());
        System.out.println(members[target].getFriendCnt());
        System.out.println(members[target].getNewFriendCnt(limit));



        return answer;
    }
}

class Member{
    private int me;  //나 자신의 이름
    private ArrayList<Member> fList = new ArrayList<>();

    Member(int me){ //생성자
        this.me = me;
    }
    int getMe(){ //본인의이름 반환
        return me;
    }
    int getFriendCnt(){ //본인의 친구 수 반환
        return fList.size();
    }
    int getNewFriendCnt(int limit){ //친구의 친구 수 반환
        int newFriendCnt = 0;
        while(limit > 0){
            for(Member m:fList){
                System.out.println("getNewFriendCnt");
                System.out.println(m.getMe());
                System.out.println(m.getFriendCnt());
                newFriendCnt += m.getFriendCnt();
                limit--;
            }
        }
        return newFriendCnt;
    }
    void setFriend(Member m){
        if(fList.indexOf(m) == -1){
            fList.add(m);
        }
    }
}