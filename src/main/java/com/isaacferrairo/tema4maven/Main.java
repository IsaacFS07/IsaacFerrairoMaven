package com.isaacferrairo.tema4maven;

import com.github.lalyos.jfiglet.FigletFont;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        //DEFINIMOS VARIABLES
        String texto = "Isaac Ferrairo";
        String banner = FigletFont.convertOneLine(texto);
        List<String> infoTotal = new ArrayList<>();
        Screen screen = new DefaultTerminalFactory().createScreen();

        for (String info : banner.split("\n")) {
            infoTotal.add(info);
        }

        infoTotal.add("NOMBRE: Isaac Ferrairó Sanfélix");
        infoTotal.add("CORREO ELECTRONICO: isaacestudiante@mariaenriquez.com");
        infoTotal.add("TELEFONO: 658775848");
        infoTotal.add("VEHICULO: MOTOCICLETA PROPIA");
        infoTotal.add("DIRECCIÓN: Rausell 2, Gandia, Valencia");
        infoTotal.add("EXPERIENCIA LABORAL: 3 meses de practicas en la empresa SKLUM");
        infoTotal.add("IDIOMAS: Español C2, Ingles B2");
        infoTotal.add("LENGUAJES: JAVASCRIPT, HTML, CSS, JAVA");
        infoTotal.add("EDAD: 18 AÑOS");
        infoTotal.add("PERFIL PROFESIONAL: Estudiante de DAW");
        infoTotal.forEach(System.out::println);

        screen.startScreen();
        screen.setCursorPosition(null);


    }

    private static void drawFrame(Screen screen, List<String> lines, int yOffset)
            throws IOException {
        TerminalSize size = screen.getTerminalSize();
        int width = size.getColumns();
        int height = size.getRows();
        screen.clear();
        TextGraphics tg = screen.newTextGraphics();
        for (int i = 0; i < lines.size(); i++) {
            int y = yOffset + i;
            if (y < 0 || y >= height) continue;
            String line = lines.get(i);
            // Centrado horizontal (opcional, pero queda mejor)
            int x = Math.max(0, (width - line.length()) / 2);
            if (x >= width) continue;
            // Recorte simple si se sale por la derecha
            String visible = (line.length() > width) ? line.substring(0, width) :
                    line;
            tg.putString(x, y, visible);
        }
        screen.refresh();
    }


}

