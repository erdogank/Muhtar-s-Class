package day10NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int score=110;

        if(score>=0&&score<=100){

            if(score>=90&&score<=100){
                System.out.println("Excellent");
            }
            if(score>=80&&score<=89){
                System.out.println("Great");
            }
            if(score>=70&&score<=79){
                System.out.println("Good");
            }
            if(score>=60&&score<=69){
                System.out.println("Passed");
            }
            if(score>=0&&score<=59){
                System.out.println("Excellent");
            }


        }else{
            System.out.println("invalid score");
        }








    }
}
