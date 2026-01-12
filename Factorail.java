
public class Factorail {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
    //using recursion 
    public static int factorial(int i) {
       if(i == 1)
       {
        return 1;
       }
       if(i == 2)
       {
        return 2;
       }
       //recursion
       return i * factorial(i - 1);
    }
}
