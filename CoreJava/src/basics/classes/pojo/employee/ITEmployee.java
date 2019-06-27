package basics.classes.pojo.employee;
// This is a IS-A Relationship with H2kEmployee

public class ITEmployee extends H2kEmployee {

    private String programmingExperience;

    public ITEmployee(int id){
        super(id);
    }

    public ITEmployee(String name, String experience,int id){
        super(id,name);
        this.programmingExperience = experience;
    }

    public ITEmployee(int idX, String nameX){
        super(idX, nameX);
    }

    public ITEmployee(int id, String name, String department){
        this(id,name);
        super.setDepartment(department);
    }


    public String getProgrammingExperience() {
        return this.programmingExperience;
    }

    public void setProgrammingExperience(String programmingExperience) {
        this.programmingExperience = programmingExperience;
    }

    @Override
    public void tieColor() {
        System.out.println("The Tie color for IT Employee should be Magenta");
    }

}
