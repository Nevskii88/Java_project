// 1 Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.printf("Треугольное число: %d\n", firstNumber(a));
        System.out.printf("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.printf("Факториал числа: %d\n", secondNumber(b));
        scanner.close();
    }

    public static int firstNumber(int a) {
        return (a * (a + 1)) / 2;
    }

    public static int secondNumber(int b) {
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res = res * i;
        }
        return res;
    }
}