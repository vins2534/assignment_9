package java_assignment_9;

// Class representing a method that prints a message with synchronization
public class CallMe {

    // Method for printing a message with synchronization
    synchronized public void call(String msg) {
        // Print the message
        System.out.print(msg);
        try {
            // Simulate some work being done by sleeping for 1 second
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Handle the case where the thread is interrupted while sleeping
            e.printStackTrace();
        }
        // Add a space after printing the message
        System.out.print(" ");
    }
}
