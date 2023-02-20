import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomInt = random.nextInt(100);
            numbers.add((Integer) randomInt);
        }
        System.out.println(numbers);
        numbers.removeIf(e -> (e % 2) == 0);
        System.out.println(numbers);
    }
}