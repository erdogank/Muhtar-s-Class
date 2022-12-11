package day10NestedIf;

public class AgeGroups {

    public static void main(String[] args) {

        int age=151;
        String ageGroup = "$½$½$";

        if(age>=0 && age<=150){

            if(age<20){
                ageGroup="Teenager";
            }
            else if(age>=21 && age<55){
                ageGroup="Adult";
            }
            else if(age>=55){
                ageGroup="Senior";
        }
            else{
            ageGroup="Invalid";
            }
        }
        System.out.println("ageGroup = " + ageGroup);
        }
    }


