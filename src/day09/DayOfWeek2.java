package day09;

public class DayOfWeek2 {
    public static void main(String[] args) {


        int number=5;
        String dayOfTheWeek = null;

        if(number==1){
            dayOfTheWeek = "monday";
        }else if(number==2){
            dayOfTheWeek="tuesday";
        }else if(number==3){
            dayOfTheWeek="wednesday";
        }else if(number==4){
            dayOfTheWeek="thursday";
        }else if(number==5){
            dayOfTheWeek="friday";
        }else if(number==6){
            dayOfTheWeek="saturday";
        }else if(number==7){
            dayOfTheWeek="sunday";
        }else{
            System.out.println("invalid input");
        }
        System.out.println("dayOfTheWeek = " + dayOfTheWeek);

    }
}
