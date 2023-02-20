import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Describe {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomInt = random.nextInt(100);
            list.add((Integer) randomInt);
        }
        int sum = 0;
        for (Integer num: list) {
            sum += num;
        }
        float mean = (float) sum/list.size();
        System.out.println(list);
        System.out.println("Максимальный элемент списка: " + Collections.max(list));
        System.out.println("Минимальный элемент списка: " + Collections.min(list));
        System.out.println("Среднее арифметическое списка: " + mean);
    }
}
