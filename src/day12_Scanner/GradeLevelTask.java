package day12_Scanner;

public class GradeLevelTask {

    public static void main(String[] args) {

        byte gradeLevel=18;
        String schoolGrade="";

        if(gradeLevel>=1&&gradeLevel<=18){

            switch (gradeLevel){
                case 1: case 2: case 3: case 4: case 5:
                    schoolGrade="Elementary School";
                    break;
                case 6: case 7: case 8:
                    schoolGrade="Middle School";
                    break;
                case 9: case 10: case 11: case 12:
                    schoolGrade="High School";
                    break;
                case 13: case 14: case 15: case 16:
                    schoolGrade="College";
                    break;
                default:
                    schoolGrade="Grad School";
                    break;
            }
            System.out.println("schoolGrade = " + schoolGrade);

        }else {
            System.out.println("Invalid Input");
        }








    }
}
