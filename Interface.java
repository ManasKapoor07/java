
interface Payement {

    //only declaration 
    void pay();
}

//  Java supports multiple inheritance through interfaces because interfaces do not provide 
//  implementation, avoiding ambiguity. If default methods cause conflict,
//  the implementing class must resolve it explicitly.”

//  We use interfaces to achieve loose coupling so that
//  implementations can change without affecting the calling code.

//🔴 2. Java 8 default methods — WHY introduced?

//  To add new methods to existing interfaces without breaking implementing classes.

// Interface = contract

// Main purpose = loose coupling

// Multiple inheritance works because no implementation

// Default methods = backward compatibility

// JDBC uses interfaces to hide vendor implementations

class A implements Payement {

    public void pay() {
        System.out.println("Paying..... A");
    }

}

class B implements Payement {

    public void pay() {
        System.out.println("Paying..... B");
    }

}

public class Interface {
//     Interface  = contract

//     👉 Ye batata hai WHAT to do,
//     ❌ HOW to do nahi batata
//     Interface is used to achieve abstraction, loose coupling, and multiple inheritance, 
//     and it forms the backbone of JDBC, Hibernate, and Spring frameworks.
    public static void main(String[] args) {
        Payement pb = new B();
        Payement pbA = new A();

        pb.pay();
        pbA.pay();
    }

}
