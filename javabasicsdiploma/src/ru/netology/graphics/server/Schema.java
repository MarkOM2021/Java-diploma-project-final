package ru.netology.graphics.server;

import ru.netology.graphics.image.TextColorSchema;

public class Schema implements TextColorSchema {

    public Schema () {}

    @Override
    public char convert(int color) {
        char[] symbols = {'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};
        int i = color / 28;
        /* массив символов состоит из 9 элементов, массив значений яркости - из 256 (0 включительно).
        Поэтому разделил 256 на 9 и получил длину отрезка при разбиении массива интенсивностей на 9 равных частей в
        28 целочисленных единиц, которые использую в формуле для определения принадлежности данного значения
        переменной color к "участку" символа в массиве символов */
        return symbols[i];
    }
}
