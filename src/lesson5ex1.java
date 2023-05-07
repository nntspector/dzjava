import java.util.*;

/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class lesson5ex1 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();


        phoneBook.put("Иван Иванов", new ArrayList<>(Arrays.asList("(29)111-11-11", "(33)222-22-22")));
        phoneBook.put("Сергей Сергеев", new ArrayList<>(Collections.singletonList("(44)323-32-32")));


        System.out.println("Контакты:");
        for (String name : phoneBook.keySet()) {
            System.out.println(name + ": " + phoneBook.get(name));
        }


        System.out.println("Телефонные номера Ивана Иванова:");
        for (String number : phoneBook.get("Иван Иванов")) {
            System.out.println(number);
        }
    }
    }

