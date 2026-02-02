package com.hugonavarro.tema4maven;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       String texto = "Hugo Navarro";
       String banner = FigletFont.convertOneLine(texto);
       System.out.println(banner);
    }
}