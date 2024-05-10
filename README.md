# Java_Assignment_9

**Caller Class:**
- Implements the `Runnable` interface to represent a caller.
- Contains instance variables `t` (thread), `msg` (message), and `target` (reference to the `CallMe` object).
- Constructor `Caller(CallMe targ, String s)`: Initializes the `target` and `msg`, and creates a new thread.
- `run()`: Overrides the `run()` method of the `Runnable` interface. Calls the `call()` method of the `target` object in a synchronized block using the `target` object as the monitor.

- **CallMe Class:**
- Provides a method `call(String msg)` that prints a message enclosed in square brackets.
- The method is synchronized using the `synchronized` keyword, ensuring only one thread can execute it at a time to avoid concurrent access issues.
- Inside the method:
  - The message is printed with a starting bracket "[".
  - It then pauses execution for 1 second using `Thread.sleep(1000)` to simulate some processing.
  - Finally, it prints the ending bracket "]" and a new line.

**Synch Class:**
- Contains the `main()` method to demonstrate synchronization using multiple threads.
- Creates an instance of the `CallMe` class named `target`.
- Creates three instances of the `Caller` class named `ob1`, `ob2`, and `ob3`, passing the `target` object and respective messages.
- Starts the threads associated with each caller (`ob1`, `ob2`, `ob3`) using the `start()` method.
- Uses `join()` method to ensure that the main thread waits for all three threads (`ob1`, `ob2`, `ob3`) to complete their execution before proceeding.
- Catches any exceptions that may occur during thread execution and prints the stack trace.
