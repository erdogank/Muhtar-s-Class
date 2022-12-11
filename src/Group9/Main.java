package Group9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static boolean hunt(ArrayList<String> result, int wayStones, int boast) {

        int numOfNanuk = Collections.frequency(result, "Nanuk");
        result.removeIf(p -> p.equals("Nanuk"));

        int numOfCatches = 0;

        for (String each : result) {
            numOfCatches += Integer.parseInt(each);
        }
        return wayStones >= numOfNanuk && numOfCatches >= boast;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }
        System.out.println(hunt(list, stones, boast));
    }
}