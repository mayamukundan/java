package basics.classes.pojo.employee;

public class TaxEmployee extends H2kEmployee {

    private String taxType;

    public TaxEmployee(int id){
        super(id);
    }

    public TaxEmployee(String name, String taxType, int id){
        super(id,name);
        this.taxType = taxType;
    }

    public TaxEmployee(int idX, String nameX){
        super(idX, nameX);
    }

    public TaxEmployee(int id, String name, String department){
        this(id,name);
        this.setDepartment(department);
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    /*@Override
    public void watchColor(){
        System.out.println("Watch Color should be BLACK & WHITE For Tax Employee");
    }*/

    @Override
    public void watchColor(){
        System.out.println("Watch Color should be BLACK & WHITE For Tax Employee");
    }
}
