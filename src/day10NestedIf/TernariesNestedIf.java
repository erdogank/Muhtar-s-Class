package day10NestedIf;

public class TernariesNestedIf {
    public static void main(String[] args) {

        int day = 8;


       String weekday=(day>=1&&day<=7)?   (day==1)? "monday":(day==2)? "tuesday":(day==3)?"wednesday":(day==4)?"thursday":(day==5)?"friday"
                :(day==6)?"saturday":"sunday"   :"check your input";

        System.out.println("weekday = " + weekday);















    }




}
