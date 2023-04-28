import java.util.ArrayList;
import java.util.Arrays;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

public class t2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrlst = new ArrayList<Integer>(Arrays.asList(1, 3, 6, 2, 8, 9, 4, 5));
        int max = arrlst.get(0);
        int min = arrlst.get(0);
        int sum = 0;
        for (int i = 0; i < arrlst.size(); i++) {
            if (arrlst.get(i) > max)
                max = arrlst.get(i);
            if (arrlst.get(i) < min)
                min = arrlst.get(i);
            sum = sum + arrlst.get(i);
        }
        System.out.printf("Максимальный элемент: %d\n", max);
        System.out.printf("Минимальный элемент: %d\n", min);
        System.out.printf("Среднее: %.1f\n", ((float) sum / arrlst.size()));

    }
}
