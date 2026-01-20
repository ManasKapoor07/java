
class MyTask implements Runnable {
    public void beforeRun(){
        System.out.println("Before Running.....");
    }

    public void run() {
        beforeRun();
        System.out.println("Task running");

    }
}

public class Test {

    public static void main(String[] args) {
        Thread t = new Thread(new MyTask());
        t.start();
    }
}

// Runnable represents a task, not a thread. 
// Only Thread has the ability to create and start a new thread.
