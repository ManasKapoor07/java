
class Calculator {

    // Instance variable
    // Stored inside the Calculator object in HEAP memory
    int value = 4;

    // Method Overloading
    // Same method name, different parameter list
    public int add(int a, int b) {
        System.out.println(value);
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    private int age = 11; // Cannot be accessed directly 

    //can be accessed through methods inside same class
    public int getAge() {
        return age;
    }

}

public class Oops {

    public static void main(String[] args) {

        // Local variables → stored in STACK
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        // calc → reference stored in STACK
        // new Calculator() → object stored in HEAP
        Calculator calc = new Calculator();

        // Method call → stack frame created
        int result1 = calc.add(num1, num2, num3);
        int result2 = calc.add(num1, num2);

        System.out.println(calc.getAge());

        System.out.println(result1 + " " + result2);

    }
}


/*

Static Variable:- 
    They belongs to class not objects 
    Objects only access the single copy of the static variable
    Objects don’t share it — they all point to the same class-level variable

    Static variable is used with classes

    class Manas{
        int age;
        static String name;

        static{
            name = "Manas Kapoor"
            sout("This will get called when class loads, before constructor")
        }
    }

    public static void main(String[] args)
    {

    Manas obj1 = new Manas();

    //normal variable
    obj1.age = 22;

    //static variable
    Manas.name = "Kapoor"
    
    }


    Every time object is created 
        Class Loads and Object is instantiated

        Class will loads only once irrespective of number of objects created

        And then static block is called 
        then constructor calls happens 



        If object is not created Class will not load

        Nut what if we still want to load the class 
            There is a class in java called Class , which loads the class given to it 

            Class.forname("Manas"); 

        







            Why main method is static ? 
                So if its not static to call main we need to create object of the class 
                and main method is where excution starts , so it became kind of deadlock here 

                so to solve this we use static 


                Every constructor has a method called super();
                super means call the constructor of super class 


                Every class in java extends Object class
                
                Stack memory is thread-specific, Heap is shared

                        Heap Memory
                            Objects
                            Instance variables
                            Shared across threads


                        Stack Memory
                            Method call frames
                            Local variables
                            References to heap objects

 */
