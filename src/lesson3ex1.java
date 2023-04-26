import java.util.ArrayList;
import java.util.List;
/*
Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class lesson3ex1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }

        System.out.println(numbers);
    }
}
