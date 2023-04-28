import java.util.ArrayList;
import java.util.Arrays;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class t1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 6, 2, 8, 9, 4, 5));

        for (int i = arr.size() - 1; i >= 0; i--) {
            int even = arr.get(i) % 2;
            if (even == 0) {
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}
