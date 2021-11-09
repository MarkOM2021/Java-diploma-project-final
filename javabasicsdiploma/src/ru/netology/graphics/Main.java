package ru.netology.graphics;

import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;
import ru.netology.graphics.image.Converter;

import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new Converter ();
        GServer server = new GServer (converter); // Создаём объект сервера
        server.start (); // Запускаем

        // Или то же, но с сохранением в файл:
        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        String imgTxt = converter.convert (url);
        System.out.println (imgTxt);
    }
}