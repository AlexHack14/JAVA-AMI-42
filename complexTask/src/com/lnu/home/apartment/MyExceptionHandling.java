package com.lnu.home.apartment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyExceptionHandling {
    public static InputStreamReader stream_Reader = new InputStreamReader(System.in);
    public static BufferedReader keyboard = new BufferedReader(stream_Reader);

    public static int handlingOFIncorrectExitFromMenuSupposeInt() throws IOException {
        int console;
        try {
            console = Integer.parseInt(keyboard.readLine());
        } catch (Exception NumberFormatException) {
            // special out from exception
            console = 42;

        }
        return console;
    }

    public static double handlingOFIncorrectExitFromMenuSupposeDouble() throws IOException {
        double console;
        try {
            console = Double.parseDouble(keyboard.readLine());
        } catch (Exception NumberFormatException) {
            // special out from exception
            console = 42;

        }
        return console;
    }

    public static String handlingOFIncorrectExitFromMenuSupposeString() throws IOException {
        String console;
        try {
            console = keyboard.readLine();
        } catch (Exception NumberFormatException) {
            // special out from exception
            console = "42";

        }
        return console;
    }

}