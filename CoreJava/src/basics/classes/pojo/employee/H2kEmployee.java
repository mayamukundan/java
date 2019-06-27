package basics.classes.pojo.employee;

import basics.classes.pojo.Address;

public abstract class H2kEmployee extends Object {
    private int id; // 0
    private String name; //
    private String department;
    public Address address;
//    private String companyName;

    public H2kEmployee(int id){
        this.id = id;
    }

    public H2kEmployee(int idX, String nameX){
        id = idX;
        name = nameX;
    }

    public H2kEmployee(int id, String name, String department){
        this(id,name);
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void watchColor(){
        System.out.println("Watch Color should be BLACK");
    }

    public abstract void tieColor();//must do, but not how it does it
}