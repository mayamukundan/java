package basics.classes.pojo;

public class Employee {
    public int id; // 0
    public String name; //
    public String department;

    public Address address;

//    public Employee(){
//
//    }

    public Employee(int id){
        this.id = id;
    }

    public Employee(int idX, String nameX){
        id = idX;
        name = nameX;
    }

    public Employee(int id, String name, String department){
        this(id,name);
        this.department = department;
    }

    public int add(int a , int b){return 0;}
    public int add(int a , int b, int c){return 0;}


}
