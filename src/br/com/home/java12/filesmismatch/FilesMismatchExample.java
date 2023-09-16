package br.com.home.java12.filesmismatch;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FilesMismatchExample {

    public static void main(String[] args) throws IOException {
        final long mismatch = Files.mismatch(new File("mismatch-file1.txt").toPath(), new File("mismatch-file2.txt").toPath());
        var resultLabel = "";

        if (mismatch == -1) {
            resultLabel = "Os arquivos são iguais pois o retorno foi %d";
        } else {
            resultLabel = "Os arquivos são diferentes pois o retorno foi %d";
        }

        System.out.printf(resultLabel, mismatch);
    }
}

