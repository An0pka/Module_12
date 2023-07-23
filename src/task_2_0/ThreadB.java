package task_2_0;

public class ThreadB implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from Thread B");
        Printer printer = new Printer();
        printer.buzz();
    }
}
