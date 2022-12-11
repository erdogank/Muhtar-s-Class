package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Task6CatsAndDogs {
    public static void main(String[] args) {

        
        Scanner input=new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence= input.nextLine();
        int numberOfCat=0;
        int numberOfDog=0;

        for(int i=0; i<sentence.length()-2;i++){//or (int i=0; i<=sentence.length()-3;i++)
            String checkWord=sentence.substring(i,i+3);
            if(checkWord.equalsIgnoreCase("cat")){
                numberOfCat++;
            }if(checkWord.equalsIgnoreCase("dog")){
                numberOfDog++;
            }
        }
        System.out.println("numberOfCat = " + numberOfCat);
        System.out.println("numberOfDog = " + numberOfDog);

    }
}
