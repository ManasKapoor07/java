public class Shaddowing {
    static int a = 10;

    public static void main(String[] args) {
        System.out.println(a);

        int a = 90; // this is shadowing the global variable
        System.out.println(a);

        // int a;
        // System.out.println(a); // local variable 'a' declared but not initialized


        {
            a = 50; // this is local to this block
            int c = 70;
            System.out.println(a);
        }
        // System.out.println(c); :- error because c is not accessible here
    }
}
