package task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    int number = 15;

    public List<String> fizz(List<String> list) {
        for (int i = 1; i <= number ; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                list.add(i-1, "fizz");
            } else {
                list.add(i-1, String.valueOf(i));
            }
        }return list;
    }
    public List<String> buzz(List<String>list) {
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                list.remove(i-1);
                list.add(i-1, "buzz");
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Main main = new Main();
        List<String>list = new ArrayList<>();
        main.fizz(list);
        main.buzz(main.fizz(list));
        System.out.println(list);
//        System.out.println(main.buzz(15));


    }
}