package day10NestedIf;

public class CrewAndPassengers {

    public static void main(String[] args) {


        int number = 101;
        String crewPassenger = "";

        if (number == 50 || number == 75 || number == 100) {
            if (number == 50) {
                crewPassenger = "20 crew, 30 passengers";
            } else if (number == 75) {
                crewPassenger = "25 crew, 50 passengers";
            } else if (number == 100) {
                crewPassenger = "30 crew, 70 passengers";
            }
            } else {
                crewPassenger = "ınvalid ınput";

            }
            System.out.println("crewPassenger = " + crewPassenger);

        }


    }


