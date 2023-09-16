package br.com.home.java13.switchexpressionyield;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SwitchExpressionYield {

    public static void main(String[] args) {

        try (var scan = new Scanner(new File("dia-da-semana.txt"))) {
            var diaDaSemana = new StringBuilder();
            var resultado = "";

            while (scan.hasNextLine()) {
                diaDaSemana.append(scan.nextLine());
            }

            resultado = switch (diaDaSemana.toString()) {
                case "segunda":
                case "terça":
                case "quarta":
                case "quinta":
                case "sexta":
                    yield "Dia útil";
                case "sabado":
                case "domingo":
                    yield "Final de semana";
                default:
                    yield "Dia inválido";
            };

            System.out.println(resultado);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
