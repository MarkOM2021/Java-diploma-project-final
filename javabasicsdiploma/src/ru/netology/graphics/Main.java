package ru.netology.graphics;

import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;
import ru.netology.graphics.server.Converter;

import java.io.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new Converter ();
        converter.setMaxWidth(200);
        converter.setMaxHeight(300);
        // Создайте тут объект вашего класса конвертера
        // GServer server = new GServer(converter); // Создаём объект сервера
        // server.start(); // Запускаем
        // Или то же, но с сохранением в файл:
        PrintWriter fileWriter = new PrintWriter(new File("converted-image.txt"));
        fileWriter.write(converter.convert("https://i.ibb.co/6DYM05G/edu0.jpg"));
        fileWriter.close();
    }
}