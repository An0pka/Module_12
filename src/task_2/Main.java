package task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int number = 15;
        List<Integer> list = new ArrayList<>(number);
        for (int i = 1; i <= number; i++) {
            list.add(i);
        }
        System.out.println(list);

    }
}
