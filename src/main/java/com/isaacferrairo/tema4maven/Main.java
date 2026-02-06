package com.isaacferrairo.tema4maven;
import com.github.lalyos.jfiglet.FigletFont;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        //DEFINIMOS VARIABLES
        String texto = "Isaac Ferrairo";
        String banner = FigletFont.convertOneLine(texto);
        List<String> infoTotal=new ArrayList<>();



        for(String info : banner.split("\n")){
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

        }
    }

