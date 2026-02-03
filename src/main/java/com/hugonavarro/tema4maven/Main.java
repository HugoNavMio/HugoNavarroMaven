package com.hugonavarro.tema4maven;

import com.github.lalyos.jfiglet.FigletFont;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void dibujo(Screen pantalla, List<String> lineas, int yOffset) throws IOException {
        TerminalSize medida = pantalla.getTerminalSize();
        int ancho = medida.getColumns();
        int alto = medida.getRows();

        pantalla.clear();
        TextGraphics tg = pantalla.newTextGraphics();

        for (int i = 0; i < lineas.size(); i++) {
            int y = yOffset + i;
            if (y < 0 || y >= alto) continue;

            String linea = lineas.get(i);
            int x = Math.max(0, (ancho - linea.length()) / 2);
            if (x >= ancho) continue;

            String visible = linea.length() > ancho ? linea.substring(0, ancho) : linea;

            tg.putString(x, y, visible);
        }

        pantalla.refresh();
    }

    public static void main(String[] args) throws IOException {
        List<String> lineas = new ArrayList<>();
        String texto = "Hugo Navarro";
        String banner = FigletFont.convertOneLine(texto);
        Screen pantalla = new DefaultTerminalFactory().createScreen();
        pantalla.startScreen();
        pantalla.setCursorPosition(null);

        for (String linea : banner.split("\n")) {
            lineas.add(linea);
        }

        lineas.add("");
        lineas.add("Nombre: Hugo");
        lineas.add("Apellidos: Navarro Miota");
        lineas.add("Fecha de Nacimiento: 20/07/2007");
        lineas.add("Edad: 18 Años");
        lineas.add("País: España");
        lineas.add("Estudios: DAM (Desarrollo de Aplicaciones Multiplataforma)");
        lineas.add("Centro Educativo: IES María Enríquez");
        lineas.add("Habilidades: Programar y utilizar sistemas operativos");
        lineas.add("Idiomas: Español e Inglés");
        lineas.add("Teléfono: +34 123 45 67 89");
    }
}