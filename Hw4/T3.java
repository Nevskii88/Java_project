// В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.LinkedList;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> results = new LinkedList<>();
        int first;
        int second;
        String zn;
        boolean firts_or_not = true;
        while (true) {
            if (firts_or_not == true) {
                System.out.print("Ввод числа:");
                first = sc.nextInt();
                sc.nextLine();
                firts_or_not = false;
            } else {
                first = results.getLast();
            }
            System.out.print("Ввод знака:");
            zn = sc.nextLine();
            if (zn.equals("Отмена")) {
                results.removeLast();
                System.out.println(results.getLast());
                if (results.size() == 0)
                    firts_or_not = true;
                continue;
            }
            if (zn.equals("Стоп"))
                break;
            System.out.print("Ввод числа:");
            second = sc.nextInt();
            sc.nextLine();
            if (zn.equals("+")) {
                System.out.println((first + second));
                results.add(first + second);
            } else if (zn.equals("-")) {
                System.out.println(first - second);
                results.add(first - second);
            } else if (zn.equals("*")) {
                System.out.println(first * second);
                results.add(first * second);
            } else if (zn.equals("/")) {
                System.out.println(first / second);
                results.add(first - second);
            }
        }
        sc.close();
    }
}