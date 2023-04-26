import java.util.ArrayList;
import java.util.Collections;
/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое
из этого списка. Collections.max()
 */
public class lesson3ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(4);

        int max = Collections.max(list);
        int min = Collections.min(list);

        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double average = sum / list.size();

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее арифметическое: " + average);
    }
}
