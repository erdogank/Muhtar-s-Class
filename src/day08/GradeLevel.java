package day08;

public class GradeLevel {
    public static void main(String[] args) {
        byte grade = 12;
        String gradeName="";

        if(grade>=1 &&grade<=5) {

            gradeName = "Elementary School";
        }
        else if (grade>=6 && grade <=8)  {
            gradeName ="Middle School";
        }
        else if (grade >=9 && grade <=12){
            gradeName= "High School";
        }
        else if (grade >= 13 && grade <=16){
            gradeName = "College";
        }
        else if (grade== 17 || grade ==18){
            gradeName = "Grad School";
        }
        System.out.println(gradeName);





    }
}