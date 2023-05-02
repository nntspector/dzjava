import java.util.Iterator;
import java.util.LinkedList;
/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
 */
public class lesson4ex3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);

        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            sum += num;
        }

        System.out.println("Сумма всех элементов списка: " + sum);
    }
}

