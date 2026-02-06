package com.isaacferrairo.tema4maven;
import com.github.lalyos.jfiglet.FigletFont;

public class Main {
    public static void main(String[] args) throws Exception {

        String texto = "Isaac Ferrairo";
        String banner = FigletFont.convertOneLine(texto);
        System.out.println(banner);

        }
    }

