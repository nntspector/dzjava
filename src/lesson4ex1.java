import java.util.LinkedList;
public class lesson4ex1 {
    /*
    Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    Постараться не обращаться к листу по индексам.
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Исходный список: " + list);
        LinkedList<Integer> reversedList = reverseLinkedList(list);
        System.out.println("Перевернутый список: " + reversedList);
    }
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
