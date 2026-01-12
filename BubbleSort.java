
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
/*
        Bubble sort :- 
            1. Look at adjacent element 
            2. Swap them until last elemenet gets at the last position
            3. repeat steps untill no swap can be done
*/

/*
                After each pass the order will get sorted from the end 

                i vala for loop is used for steps 
                means passes 

                j is the main fielder which used to swap 
*/
        for (int i = 0; i < arr.length - 1; i++) {
            //to optmize we need to optimize the j thing because after each pass end 
            //of the array is gettring sorted , so no need to check that part of array 
            boolean isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    //swap
                    isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            if(!isSwapped) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
