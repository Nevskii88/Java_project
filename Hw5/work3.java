package Hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class work3 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> board = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 8; j++) {
                temp.add(j, 1);
            }
            board.add(temp);
        }
        print(board);
        System.out.println();
        print(find(board));
    }

    public static void print(ArrayList<ArrayList<Integer>> board) {
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.get(i).size(); j++) {
                System.out.print(board.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> find(ArrayList<ArrayList<Integer>> board) {
        int count = 1;
        ArrayList<Integer> choice = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
        ArrayList<Integer> choic = (ArrayList<Integer>) choice.clone();
        ArrayList<ArrayList<Integer>> board0 = new ArrayList<>();
        for (int i = 0; i < board.size(); i++) {
            ArrayList<Integer> temp = (ArrayList<Integer>) board.get(i).clone();
            board0.add(temp);
        }
        Random rnd = new Random();
        int i = 0;
        int n = rnd.nextInt(0, choice.size());
        int j = choice.get(n);
        choic.remove(n);

        ArrayList<Integer> temp = (ArrayList<Integer>) board.get(i).clone();
        temp.set(j, 0);
        board.set(i, temp);
        while (count != 8) {
            i++;
            if (i > 7) {
                for (int k = 0; k < board.size(); k++) {
                    temp = (ArrayList<Integer>) board0.get(k).clone();
                    board.set(k, temp);
                }
                i = 0;
                choic = (ArrayList<Integer>) choice.clone();
                n = rnd.nextInt(0, choic.size());
                j = choic.get(n);
                choic.remove(n);
                temp = (ArrayList<Integer>) board.get(i).clone();
                temp.set(j, 0);
                board.set(i, temp);
                count = 1;
                continue;
            }
            n = rnd.nextInt(0, choic.size());
            j = choic.get(n);
            choic.remove(n);
            if (ifCan(board, i, j)) {
                temp = (ArrayList<Integer>) board.get(i).clone();
                temp.set(j, 0);
                board.set(i, temp);
                count++;
            } else {
                for (int k = 0; k < board.size(); k++) {
                    temp = (ArrayList<Integer>) board0.get(k).clone();
                    board.set(k, temp);
                }
                i = 0;
                choic = (ArrayList<Integer>) choice.clone();
                n = rnd.nextInt(0, choic.size());
                j = choic.get(n);
                choic.remove(n);
                temp = (ArrayList<Integer>) board.get(i).clone();
                temp.set(j, 0);
                board.set(i, temp);
                count = 1;
                continue;
            }
        }

        return board;

    }

    public static Boolean ifCan(ArrayList<ArrayList<Integer>> board, int i, int j) {

        int row = i - 1;
        int column = j;
        while (row < 8 && column < 8 && row >= 0 && column >= 0) {
            if (board.get(row--).get(column) == 0) {
                return false;
            }
        }
        row = i - 1;
        column = j + 1;
        while (row < 8 && column < 8 && row >= 0 && column >= 0) {
            if (board.get(row--).get(column++) == 0) {
                return false;
            }
        }
        row = i - 1;
        column = j - 1;
        while (row < 8 && column < 8 && row >= 0 && column >= 0) {
            if (board.get(row--).get(column--) == 0) {
                return false;
            }
        }
        return true;

    }
}
