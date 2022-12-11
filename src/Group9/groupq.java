package Group9;

public class groupq {

    public static void main(String[] args) {

        int[] arr = {4, 9, 1,3, 6, 4,3,1};

        int sum = 0;
        int sum2 = 0;


        for (int i : arr) { // sum of the all elements
            sum += i;
        }

        for (int i = 0; i < arr.length; i++) { // index

            sum2 += arr[i];  // sum of the elements up to the element the avarage element

            // sum - arr[i+1]  the sum of all elements remaining after exctracting the average element
            if ((sum - arr[i+1]) / 2 == sum2 ){
                System.out.println(arr[i+1]);
                break;
            }
        }
    }
}
