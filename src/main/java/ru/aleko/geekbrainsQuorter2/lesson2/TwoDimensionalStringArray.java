package ru.aleko.geekbrainsQuorter2.lesson2;

public class TwoDimensionalStringArray {

    public TwoDimensionalStringArray() {}

    void twoDimensionalStringArrayBuilder(String [][] ar, int size1, int size2) throws MyApplicationException {
        /**Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4 (size1 x size2).
         При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
         Заметка: Если Java не сможет преобразовать входную строку (в строке число криво написано),
         то будет сгенерировано исключение NumberFormatException.
         */

        checkEnteredArraySize(ar, size1, size2);

        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                iteratingCharactersOfString(ar[i][j], i, j);
                try {                                     // на случай NumberFormatException.
                    sum += Integer.parseInt(ar[i][j]);
                } catch (NumberFormatException n) {
                    System.out.println("Произошла неустранимая ошибка: " + n.getMessage() +
                            "Программа будет остановлена");
                    System.exit(-1);
                }
            }
        }
        System.out.println("Total amount is " + sum);
    }

     void checkEnteredArraySize(String [][] ar, int size1, int size2) throws MyApplicationException {
        /** проверка соответствия размера массива  size1 x size2 (в нашем случае 4х4) */
        if (ar.length != size1) { // проверка на кол-во столбцов в массиве
            throw new MyArraySizeException(ar.length, size1);
        }
        for (int i = 0; i < ar.length; i++) {  // проверка на кол-во элементов в столбце
            if (ar[i].length != size2) {
                throw new MyArraySizeException(i, ar[i].length, size2);
            }
        }
    }

    void iteratingCharactersOfString(String item, int i, int j) throws MyArrayDataException {
        /** метод перебирает символы строки в ячейке */
        char[] chars = item.toCharArray();
        for (char symbol : chars) {
            if (!numberDetection(symbol)) {
                throw new MyArrayDataException(i, j);
            }
        }
    }

    boolean numberDetection(char symbol) {
        /** метод проверяет является ли символ числом  */
        return Character.isDigit(symbol);
    }
}
