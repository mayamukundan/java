package basics.classes.pojo;

public class Pen {
    private int length;
    private String name;
    private String brand;
    public static int count;  // Class Level Variable
    public String instanceVariable;

    public Pen(){
        this.count++;
    }

    public Pen(String name){
        this();
        System.out.println(name +" Got created..");
        this.name = name;
    }

    public void setLength(int length){
        if(length <= 3){
            this.length = 3;
        }else{
            this.length = length;
        }
    }

    public int getLength(){
        return length;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    /*public String printDetails() {
        return "Name : "+ this.name +" Brand : "+ this.getBrand() + " Length : "+ length;
    }*/

    public String toString() {
        return "Name : "+ this.name +" Brand : "+ this.getBrand() + " Length : "+ length;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name +" Is getting Destroyed************************");
    }
}
