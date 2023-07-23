package task_2_0;

import java.util.ArrayList;
import java.util.List;

public class Printer {
    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    private static List<String> list = new ArrayList<>();


    public void fizz(){
        for (int i = 1; i <= list.size(); i++) {
            if (i % 3 == 0 && i % 5 != 0){
                list.set(i-1, "fizz");
            }
        }
    }
    public void buzz(){
        for (int i = 1; i <= list.size(); i++) {
            if (i % 5 == 0 && i % 3 != 0){
                list.set(i-1, "buzz");
            }
        }
    }
    public void fizzBuzz(){
        for (int i = 1; i <= list.size(); i++) {
            if(i % 5 == 0 && i % 3 == 0){
                list.set(i-1, "fizzbuzz");
            }
        }
    }
    public void number(){
        int number = 15;
        for (int i = 1; i <= number; i++) {
            list.add(String.valueOf(i));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread threadD = new Thread(new ThreadD());
        Thread threadA = new Thread(new ThreadA());
        Thread threadB = new Thread(new ThreadB());
        Thread threadC = new Thread(new ThreadC());
        threadD.start();
        threadD.join();
        threadA.start();
        threadA.join();
        threadB.start();
        threadB.join();
        threadC.start();
        threadC.join();
        System.out.println(list);
    }

}
