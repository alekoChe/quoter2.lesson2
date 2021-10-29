package ru.aleko.geekbrainsQuorter2.lesson2;

/** При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 */
public class MyArraySizeException extends MyApplicationException {

    private static final String MSE1 = "Введен массив неправильного размера." +
            " В массиве %d столбцов! Столбцов должно быть %d";
    private static final String MSE2 = "Введен массив неправильного размера. В %d-м столбце %d элементов!" +
            " Элементов должно быть %d";

    public MyArraySizeException(int arlength, int size1) {
        super(String.format(MSE1, arlength, size1));
    }
    public MyArraySizeException(int i, int arlength, int size2) {
        super(String.format(MSE2, i, arlength, size2));
    }
}
