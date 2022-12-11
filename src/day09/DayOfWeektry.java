package day09;

public class DayOfWeektry {
    public static void main(String[] args) {



        String dayOfTheWeek = "tuesday";
        int number=9;

        if(dayOfTheWeek=="monday"){
            number = 1;
        }else if(dayOfTheWeek=="tuesday"){
            number = 2;
        }else if(dayOfTheWeek=="wednesday"){

            number = 3;
        }else if (dayOfTheWeek=="thursday"){
            number = 4;
        }else if(dayOfTheWeek=="friday"){
            number = 5;
        }else if(dayOfTheWeek=="saturday"){
            number = 6;
        }else if(dayOfTheWeek=="sunday"){
            number = 7;
        }else{
            System.out.println("invalid input");
        }
        System.out.println(dayOfTheWeek +" is the " + number+".day of the week");

    }
}