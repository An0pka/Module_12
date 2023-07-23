package task_2_0;

public class ThreadC implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from Thread C");
        Printer printer = new Printer();
        printer.fizzBuzz();
    }
}
