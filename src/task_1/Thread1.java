package task_1;

import java.util.Date;

public class Thread1 implements Runnable{
    private static long count;
    private static boolean isPrintMassage = false;

    static {
        count = 0;
    }
    @Override
    public void run() {
        while (true){
            Date start = new Date();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Date finish = new Date();

            count += Math.abs(start.getTime() - finish.getTime())/1000;

            System.out.println(count);
            if (count % 5 == 0){
                Thread2 thread2 = new Thread2();
                thread2.run();
            }
        }
    }
}
