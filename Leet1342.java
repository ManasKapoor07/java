
public class Leet1342 {

    public static void main(String[] args) {
        int num = 14;
        System.out.println(stepToZero(num));

    }

    public static int stepToZero(int num) {
        if (num == 0) {
            return 0;
        }

        if (num % 2 == 0) {
            return 1 + stepToZero(num / 2);
        } else {
            num--;
            return 1 + stepToZero(num);
        }
    }
}
