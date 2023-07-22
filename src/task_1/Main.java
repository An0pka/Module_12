package task_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread thread = new Thread(new Thread(thread1));
        thread.start();
        }
}