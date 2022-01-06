package prll;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.withoutStream();
    }

    public void withStream() {
        IntStream.of(1, 7, 4, 3, 6, 8).parallel().filter(el -> el > 10)

                .forEach(el -> System.out.println(el));

    }

    public void withoutStream() {
        ArrayList<Integer> nums = new ArrayLists<>():
        nums.add(1);
        nums.add(7);
        nums.add(4);
        nums.add(3);
        nums.add(6);
        nums.add(8);

        for (int num : nums) {
            System.out.println(num * num);

        }
    }
}
