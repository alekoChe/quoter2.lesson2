package ru.aleko.geekbrainsQuorter2.lesson2;

public class AppLesson2 {
    public static void main(String[] args) {
//
        String [] a = {"1", "2", "3","4"};
        String [] b = {"5","6","7", "8"};
        String [] g = {"5","6","7"};
        String [] c = {"9", "10", "11", "12"};
        String [] d = {"13", "14", "15", "16"};
        String [] f = {"13", "14", "15", "16"};
        String [] h = {"13", "14", "15", "16", "17"}; // в столбце 5 элементов
        String [] e = {"1a3", "14", "1b5", "16"}; // в столбце есть нечисловые символы
        String [][] st = {a, b, c, d};
        String [][] st2 = {a, b, c, d, f};  // в массиве 5 столбцов
        String [][] st3 = {a, b, c, h};  // в массиве столбец с 5 элементами
        String [][] st5 = {a, b, c, g};  // в массиве столбец с 3 элементами
        String [][] st4 = {a, b, c, e};  // в столбце есть нечисловые символы

        TwoDimensionalStringArray twoDim = new TwoDimensionalStringArray();

        //twoDim.twoDimensionalStringArrayBuilder(st2, 4, 4);
        //twoDim.twoDimensionalStringArrayBuilder(st3, 4, 4);
        //twoDim.twoDimensionalStringArrayBuilder(st4, 4, 4);
        //twoDim.twoDimensionalStringArrayBuilder(st5, 4, 4);

        System.out.println("Вводим правильный массив ...............................................................");
        try {
            twoDim.twoDimensionalStringArrayBuilder(st, 4, 4);
        } catch (MyApplicationException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass().getName());
        }

        System.out.println();
        System.out.println("Массив в котором больше столбцов ........................................................");
        try {
            twoDim.twoDimensionalStringArrayBuilder(st2, 4, 4);
        } catch (MyApplicationException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass().getName());
        }

        System.out.println();
        System.out.println("Массив в одном из столбцов которого больше 4-х элементов ................................");
        try {
            twoDim.twoDimensionalStringArrayBuilder(st3, 4, 4);
        } catch (MyApplicationException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass().getName());
        }

        System.out.println();
        System.out.println("Массив в одном из столбцов которого меньше 4-х элементов ................................");
        try {
            twoDim.twoDimensionalStringArrayBuilder(st5, 4, 4);
        } catch (MyApplicationException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass().getName());
        }

        System.out.println();
        System.out.println("Массив с нечисловыми символами ..........................................................");
        try {
            twoDim.twoDimensionalStringArrayBuilder(st4, 4, 4);
        } catch (MyApplicationException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass().getName());
        }
    }
}
