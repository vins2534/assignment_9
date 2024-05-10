package java_assignment_9;

// Class representing a simple synchronization example
public class Synch {
    public static void main(String[] args) {

        // Creating an instance of CallMe, which contains the method to be synchronized
        CallMe target = new CallMe();

        // Creating three Caller objects, each associated with the same target and with different messages
        Caller object1 = new Caller(target, "I");
        Caller object2 = new Caller(target, "am");
        Caller object3 = new Caller(target, "Vinit");

        // Start the threads associated with each Caller object
        object1.t.start();
        object2.t.start();
        object3.t.start();

        try {
            // Wait for each thread to finish executing
            object1.t.join();
            object2.t.join();
            object3.t.join();
        } catch (InterruptedException e) {
            // Handle the case where a thread is interrupted while waiting
            e.printStackTrace();
        }
    }
}
