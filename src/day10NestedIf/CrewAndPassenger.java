package day10NestedIf;

public class CrewAndPassenger {

        public static void main(String[] args) {

            int numberOfPeople = 83;
            String result = "";

            if (numberOfPeople == 50 || numberOfPeople == 75 || numberOfPeople == 100) {
                if (numberOfPeople == 50) {
                    result = "20 crew, 30 passengers ";
                } else if (numberOfPeople == 75) {
                    result = "25 crew, 50 passengers ";
                } else if (numberOfPeople == 100) {
                    result = "30 crew, 70 passengers ";
                }
            } else {
                result = "Number of the peoeple in the ship is not valid";
            }
            System.out.println(result);
        }
    }

