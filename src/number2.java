import java.util.Scanner;

public class number2 {
    /*
    Вычислить n! (произведение чисел от 1 до n
     */
    static int factorial (int x){
        if (x==0){
            return 1;
        }
        return x * factorial (x-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для факториала: ");
        int n = in.nextInt();
        System.out.printf("Факториал равен %d",factorial(n));

}}



