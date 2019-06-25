package basics.classes.pojo.employee;

import basics.classes.pojo.Address;

public class Employee extends Object {
    private int id; // 0
    private String name; //
    private String department;
    public Address address;
//    private String companyName;

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


}
