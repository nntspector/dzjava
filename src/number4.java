import java.util.Scanner;

public class number4 {
    /*
    Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)
     */
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = n.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = n.nextDouble();

        System.out.println("Введите требуемую операцию (+, -, *, /):");
        char operator = n.next().charAt(0);

        double result = 0;

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0)
                {
                    System.out.println("на ноль делить нельзя");
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Неправильный оператор");
                return;
        }

        System.out.println("Ответ " + result);
    }
}
