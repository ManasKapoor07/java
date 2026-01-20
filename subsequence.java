
import java.util.ArrayList;

public class subsequence {
    //Subset problem intution

    public static void main(String[] args) {

        // Taking some elements and removing some 
        // (Some choices , acceptiong something , rejecting something)
        // This is wrong because subsequence question needs to store choices
        // they are not iterative problems , they need to store choices , they are decision problems
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        //     for (int j = i + 1; j < arr.length; j++) {
        //         for (int k = 0; k < j; k++) {
        //             System.out.println(arr[i] + " " + arr[k] + " " + arr[j]);
        //         }
        //     }
        // }


        
        //Either take the character or ignore it 
        String str = "abc";
        // subSeq("", str);

        System.out.println(subSeqList("", str));

    }

    public static void subSeq(String processed, String unprocessed) {

        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        //either accept the character 
        char ch = unprocessed.charAt(0);
        subSeq(processed + ch, unprocessed.substring(1));

        //ignore it
        subSeq(processed, unprocessed.substring(1));

    }

    public static ArrayList< String> subSeqList(String processed, String unprocessed) {

        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;

        }

        //either accept the character 
        char ch = unprocessed.charAt(0);
        ArrayList<String> left = subSeqList(processed + ch, unprocessed.substring(1));

        //ignore it
        ArrayList<String> right = subSeqList(processed, unprocessed.substring(1));


        //combining and returning it 

        left.addAll(right);

        return left;

    }
}
