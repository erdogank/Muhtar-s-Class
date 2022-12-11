package day08;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 18;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA"; //True

        System.out.println("isEligible = " + isEligible);

        // Eligible
        if(isEligible){ // True
            System.out.println("Eligible");
        }

        //Not Eligible
        if(!isEligible){ // !True ==> not true==> false
            System.out.println("Not Eligible");
        }


    }

}