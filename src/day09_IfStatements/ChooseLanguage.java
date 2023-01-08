package day09_IfStatements;

public class ChooseLanguage {

    public static void main(String[] args) {

        int age = 5;
        String result1 = null;



        if (age >= 1 && age <= 2) {
            result1 = "infant";
        } else if (age >= 3 && age <= 5) {
            result1 = "toddler";
        } else if (age >= 6 && age <= 9) {
            result1 = "kid";
        } else if (age >= 10 && age <= 12) {
            result1 = "pre teen";
        } else if (age >= 13 && age <= 17) {
            result1 = " teenager";
        } else if (age >= 18 && age <= 20) {
            result1 = " young adult";
        } else if (age >= 21 && age <= 39) {
            result1 = " adult";
        } else if (age >= 40 && age <= 49) {
            result1 = "Young Middle-Aged Adult";
        } else if (age >= 50 && age <= 54) {
            result1 = "Middle-Aged Adult";
        } else if (age >= 55 && age <= 64) {
            result1 = "Very Young Senior Citizen";
        } else if (age >= 65 && age <= 74)
            result1 = "Young Senior Citizen";
        System.out.println(result1);
    }
}