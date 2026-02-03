package com.hugonavarro.tema4maven;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lineas = new ArrayList<>();
        String texto = "Hugo Navarro";
        String banner = FigletFont.convertOneLine(texto);

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