public class normal {
    public static void main(String[] args) {
        String s = "manas";
        s.toUpperCase();
        System.out.println(s);
    }

    /*
    
            == → reference
            equals() 
            → content String literals → String Pool


            String is immutable to support thread safety, safe usage in String Constant Pool,
            security of sensitive data, and reliable hashing when used as keys in collections


            StringBuilder is preferred in single-threaded scenarios for better performance,
            whereas StringBuffer is used in multi-threaded environments due to thread safety.

            Even in a multi-threaded application like Spring Boot, local variables inside a request thread are not shared, 
            so StringBuilder is preferred over StringBuffer for better performance
    */
}
