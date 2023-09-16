package br.com.home.java9.trycatchwithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchWithResources {

    public static void main(String[] args) {
        try {
            readFileWithTryWithResource("file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileWithTryWithResource(String path) throws IOException {
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader(path));

        try(br){
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
    }
}
