package basics;

public class Calculator {
    public static void main(String[] args) {
//        System.out.println(" First Value =" + args[0]);

//        int age = "30";

//        char isJavaClass = 'Yes';
        String isJavaClass = "Yes";

        String one = "3";
        String two = "2";

        int oneInt = Integer.parseInt(one);
        int twoInt = Integer.parseInt(two);
        System.out.println(one + two);
        System.out.println(oneInt + twoInt);

        String firstName = "Peter";
        String lastName = "Sam";

        // Concatenation
        String completeName = firstName + "    "+lastName;
        System.out.println(completeName);

//        System.out.println(firstName + lastName);
    }
}
