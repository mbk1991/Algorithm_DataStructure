package main.java.Algorithm.recursive.folderandfile;

import java.util.ArrayList;

public class Folder implements FNF{
    private String name;
    private ArrayList<FNF> fList = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }
    @Override
    public void fileSizeSearch(String name) {
        for(FNF f:fList){
            f.fileSizeSearch(name);
        }
    }
    public void addList(FNF f){
        if(!fList.contains(f)){
            fList.add(f);
        }
    }
}
