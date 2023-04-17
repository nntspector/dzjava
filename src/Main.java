import java.util.Scanner;

/*
Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите n для треугольного числа: ");
        int n = in.nextInt();
        int t = n*(n+1)/2;
        System.out.printf("Треугольное число от %d = %d",n,t);
        }
    }
