package task_2_0;

public class ThreadD implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from Thread D");
        Printer printer = new Printer();
        printer.number();
    }
}
