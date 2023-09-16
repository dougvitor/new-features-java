package br.com.home.java12.switchexpression;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SwitchExpressionExample {

    public static void main(String[] args) {

        try (var scan = new Scanner(new File("dia-da-semana.txt"))) {
            var diaDaSemana = new StringBuilder();
            var resultado = "";

            while (scan.hasNextLine()) {
                diaDaSemana.append(scan.nextLine());
            }

            resultado = switch (diaDaSemana.toString()) {
                case "segunda", "terça", "quarta", "quinta", "sexta" -> "Dia útil";
                case "sabado", "domingo" -> "Final de semana";
                default -> "Dia inválido";
            };

            System.out.println(resultado);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
