package basics.classes;

public class SpecialHouse {
    public String name;
//    public SpecialKitchen specialKitchen;

    class SpecialKitchen {
        private String designType;
        public void printKitchDetails(){
            System.out.println(name + " "+ designType);
        }
    }

    class SpecialBalcony{
        public String splBalconySize;
        public String splBalconyHeight;
        public String splBalconyColor;
        public String splBalconyGrill;
    }
}



class HouseDriver {
    public static void main(String[] args) {
        System.out.println("HEllo");
        SpecialHouse house  = new SpecialHouse();
        SpecialHouse.SpecialKitchen specialKitchen = house.new SpecialKitchen();

    }
}