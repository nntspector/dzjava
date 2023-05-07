import java.util.*;

public class lesson5ex2 {
    /*
    Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,
     Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова,
     Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет
      повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
     Для сортировки использовать TreeMap.
     */
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Иван Ежов", "Иван Ежов", "Иван Иванов", "Иван Ежов");

        Map<String, Integer> countMap = new TreeMap<>(Collections.reverseOrder());

        for (String name : employees) {
            if (countMap.containsKey(name)) {
                countMap.put(name, countMap.get(name) + 1);
            } else {
                countMap.put(name, 1);
            }
        }

        System.out.println("Повторяющиеся имена:");
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(countMap.entrySet());
        Collections.sort(sortedEntries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println("Отсортированные имена:");
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
