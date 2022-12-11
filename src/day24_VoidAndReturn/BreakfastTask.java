package day24_VoidAndReturn;

public class BreakfastTask {

    public static void main(String[] args) {


        initials("erdoğan","kalyoncu");

        emailDomain("e_kalyoncu@hotmail.com");

        nameOfTheMonths(12);










    }


    public static void initials(String firstName, String lastName){


        System.out.println(firstName.toUpperCase().charAt(0)+". "+lastName.toUpperCase().charAt(0)+".");






    }

    public static void emailDomain(String email){

        email =email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain: "+email);







    }

    //create a method that can display the name of the month based on given number to the method
    public static void nameOfTheMonths(int number){

        String name= "";

        if(number>=1 && number<=12){

            name= (number==1)?"Jan" : (number==2)?"Feb" : (number==3)?"March" : (number==4)?"Apr" : (number==5)?"May" :
                    (number==6)?"June" : (number==7)?"July" : (number==8)?"Aug" : (number==9)?"Sep" : (number==10)?"Oct" :
                            (number==11)?"Nov" : "Dec";
        }else{

            name= "Invalid";
        }
        System.out.println("name of the month: "+name);





    }






}
