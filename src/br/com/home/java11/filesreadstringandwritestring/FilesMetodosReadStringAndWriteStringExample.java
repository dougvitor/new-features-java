package br.com.home.java11.filesreadstringandwritestring;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FilesMetodosReadStringAndWriteStringExample {

    public static void main(String[] args) {

        try {
            Files.writeString(new File("arquivo-texto.txt").toPath(),
                    "Escrevendo e lendo conteúdos de arquivos texto através de novos métodos da classe File");

            var conteudo = Files.readString(new File("arquivo-texto.txt").toPath());
            System.out.println(conteudo);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
