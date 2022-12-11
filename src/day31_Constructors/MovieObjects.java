package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA", "Journey to SDET: Cydeo Batch 25","10/25/2021", "Kuzzat Altay",new ArrayList<>());

        movie1.addCast("muhtar");

        System.out.println(movie1);












    }
}
