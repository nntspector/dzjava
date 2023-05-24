import java.util.*;
/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому
критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */
class Laptop {
    private String model;
    private int ram;
    private int storage;
    private String os;
    private String color;

    public Laptop(String model, int ram, int storage, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
public class finalwork {
    public static void main(String[] args) {
        Set<Laptop> laptops = createLaptops();

        Map<Integer, String> filters = new HashMap<>();
        filters.put(1, "RAM");
        filters.put(2, "Storage");
        filters.put(3, "OS");
        filters.put(4, "Color");

        Map<String, Object> criteria = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (Map.Entry<Integer, String> entry : filters.entrySet()) {
            System.out.print("Введите минимальное значение для " + entry.getValue() + ": ");
            Object value;
            if (entry.getKey() == 1 || entry.getKey() == 2) {
                value = scanner.nextInt();
                scanner.nextLine(); // Чтение символа новой строки после ввода числа
            } else {
                value = scanner.nextLine();
            }
            criteria.put(entry.getValue(), value);
        }

        List<Laptop> filteredLaptops = filterLaptops(laptops, criteria);

        System.out.println("Результаты фильтрации:");
        if (filteredLaptops.isEmpty()) {
            System.out.println("Ноутбуки по заданным критериям не найдены.");
        } else {
            for (Laptop laptop : filteredLaptops) {
                System.out.println(laptop);
            }
        }
    }

    public static Set<Laptop> createLaptops() {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Dell XPS 13", 16, 512, "Windows", "Silver"));
        laptops.add(new Laptop("MacBook Pro", 8, 256, "macOS", "Space Gray"));
        laptops.add(new Laptop("HP Spectre x360", 16, 1000, "Windows", "Rose Gold"));
        laptops.add(new Laptop("Lenovo ThinkPad X1 Carbon", 16, 512, "Windows", "Black"));
        laptops.add(new Laptop("Asus ZenBook 14", 8, 512, "Windows", "Royal Blue"));
        return laptops;
    }

    public static List<Laptop> filterLaptops(Set<Laptop> laptops, Map<String, Object> criteria) {
        List<Laptop> filteredLaptops = new ArrayList<>();

        for (Laptop laptop : laptops) {
            boolean satisfiesCriteria = true;

            for (Map.Entry<String, Object> entry : criteria.entrySet()) {
                String filter = entry.getKey();
                Object value = entry.getValue();

                if (filter.equals("RAM")) {
                    int minRam = (int) value;
                    if (laptop.getRam() < minRam) {
                        satisfiesCriteria = false;
                        break;
                    }
                } else if (filter.equals("Storage")) {
                    int minStorage = (int) value;
                    if (laptop.getStorage() < minStorage) {
                        satisfiesCriteria = false;
                        break;
                    }
                } else if (filter.equals("OS")) {
                    String os = (String) value;
                    if (!laptop.getOs().equalsIgnoreCase(os)) {
                        satisfiesCriteria = false;
                        break;
                    }
                } else if (filter.equals("Color")) {
                    String color = (String) value;
                    if (!laptop.getColor().equalsIgnoreCase(color)) {
                        satisfiesCriteria = false;
                        break;
                    }
                }
            }

            if (satisfiesCriteria) {
                filteredLaptops.add(laptop);
            }
        }

        return filteredLaptops;
    }
    }

