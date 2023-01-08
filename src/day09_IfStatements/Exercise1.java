package day09_IfStatements;



public class Exercise1 {
    public static void main(String[] args) {


        int score = 95;
        double grade;
        double note;

        if (score >= 90 && score <= 100) {
            grade = 90;
            note=80;
        }else if(score>=80&& score<=90){
            grade=80;
            note=70;
        }else{
            grade=70;
            note=60;
        }


    }
}
