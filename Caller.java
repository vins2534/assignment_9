package java_assignment_9;

// Class representing a caller that invokes a synchronized method
public class Caller implements Runnable {
    Thread t; // Thread associated with this caller
    String msg; // Message to be passed to the synchronized method
    CallMe target; // Target object containing the synchronized method

    // Constructor to initialize the caller with a target object and a message
    public Caller(CallMe targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    // Method representing the execution logic of the caller
    @Override
    public void run() {
        // Synchronize on the target object to ensure thread safety
        synchronized (target) {
            // Call the synchronized method of the target object with the message
            target.call(msg);
        }
    }
}
