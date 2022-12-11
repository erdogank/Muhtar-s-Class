package day11_Switch_Scanner;

public class CharGrade {
    public static void main(String[] args) {

        char grade='A';
        String result="";

        switch (grade){

            case 65://char value of 'A'
                System.out.println("excellent");
                break;

            case('B'):
                System.out.println("great job");
                break;

            case 'C':
                System.out.println("good");
                break;

            case('D'):
                System.out.println("passed");
                break;

            case('E'):
                System.out.println("failed");
                break;

            default:
                System.out.println("invalid");

        }

        System.out.println("**********************************");

        switch (grade){
            case 'A':
                result="excellent";
                break;
            case 'B':
                result="great job";
                break;
            case 'C':
                result="good";
                break;
            case 'D':
                result="passed";
                break;
            case 'E':
                result="failed";
                break;
            default:
                result="invalid input";
                break;

        }

        System.out.println("result = " + result);

    }
}
