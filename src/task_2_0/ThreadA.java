package task_2_0;

public class ThreadA implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from Thread A");
        Printer printer = new Printer();
        printer.fizz();
    }
}
