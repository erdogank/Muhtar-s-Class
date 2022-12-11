package day12_Scanner;

import java.util.Scanner;
//java.util.* is wild import. imports everything in util package.
public class ScannerIntro {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); //declare
        System.out.println("type number of the day");

        byte num= (byte)keyboard.nextInt(); //just to remember casting. it is educational purpose. normally int.

        String result="";

        if(num>=1&&num<=7){

            result = (num==1)? "Monday":(num==2)? "Tuesday":(num==3)? "Wednesday":(num==4)? "Thursday":
                    (num==5)? "Friday":(num==6)? "Saturday": "Sunday";

            System.out.println("result = " + result);



        }else{
            System.out.println("ınvalid number");
        }







    }

}
