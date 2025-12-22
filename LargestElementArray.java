
public class LargestElementArray {

    public static void main(String[] args) {
        //second largest element in an array
        int[] arr = {
            1, 2, 14, 5, 12, 0
        };
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                System.out.println("largest before" + largest);
                System.out.println("second largest before" + secondLargest);

                largest = arr[i];

                
                System.out.println("largest after" + largest);
                System.out.println("second largest after" + secondLargest);


            } else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];

                System.out.println("Second largest else" + secondLargest);

            }
        }
        System.out.println(secondLargest);
    }
}
