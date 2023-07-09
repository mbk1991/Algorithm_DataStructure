package main.java.Algorithm.recursive.folderandfile;

public class File implements FNF{
    private int size;
    private String name;

    public File (int size, String name){
        this.size = size;
        this.name = name;
    }
    public String  getName() {
        return name;
    }

    @Override
    public void fileSizeSearch(String name) {
        if(this.name.equals(name)){
            System.out.println(this.name + "파일의 크기는 : " + this.size);
        }
    }
}
