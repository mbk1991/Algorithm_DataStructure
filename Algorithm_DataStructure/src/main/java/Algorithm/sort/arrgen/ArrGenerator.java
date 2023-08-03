package Algorithm.sort.arrgen;

public abstract class ArrGenerator {
    private String name;

    public ArrGenerator(String name){
        this.name = name;
    }

    public abstract <T> T[] genArr();

    public String getName(){
        return this.name;
    }
}
