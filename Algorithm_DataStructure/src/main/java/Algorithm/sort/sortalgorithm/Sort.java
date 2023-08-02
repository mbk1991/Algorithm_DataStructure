package main.java.Algorithm.sort.sortalgorithm;

public abstract class Sort {
    private String name;

    public Sort(String name){
        this.name = name;
    }

    public abstract <T> void sort(T[] T);

    public String getName(){
        return this.name;
    }
}
