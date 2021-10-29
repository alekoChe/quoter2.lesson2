package ru.aleko.geekbrainsQuorter2.lesson2;
/** Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 */
public class MyArrayDataException extends MyApplicationException{

    public static final String MADE = "Введены нечисловые символы." +
        " В ячейке: (столбец - %d, элемент - %d) находятся нечисловые символы!";

    public MyArrayDataException(int i, int j) {
        super(String.format(MADE, i, j));
    }
}
