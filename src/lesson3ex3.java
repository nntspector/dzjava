import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
 */
public class lesson3ex3 {
    public static void main(String[] args) {
        List <String> planets = new ArrayList<>();
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Меркурий");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Венера");
        planets.add("Юпитер");
        planets.add("Марс");
        planets.add("Нептун");
        planets.add("Земля");

        Map<String, Integer> planetCount = new HashMap<>();

        for (String planet : planets) {
            planetCount.put(planet, planetCount.getOrDefault(planet, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : planetCount.entrySet()) {
            String planet = entry.getKey();
            int count = entry.getValue();
            System.out.println(planet + ": " + count);
        }
    }
}
