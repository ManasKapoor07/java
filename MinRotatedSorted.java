
public class MinRotatedSorted {

    public static void main(String[] args) {
        int arr[] = {11,12,13,14,15};
        int start = 0 ; 
        int end = arr.length -1;
        while(start < end )
        {
            int mid = start + (end - start ) / 2;
            if(arr[mid] < arr[end])
            {
                end = mid -1;
            }
            else{
                start = mid + 1;
            }

        }
        System.out.println(arr[start]);
    }
}