package br.com.home.java8.nashhorn;

import javax.script.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NashhornExample {

    public static void main(String[] args) throws FileNotFoundException, ScriptException {
        //DEPRECATED (não funciona após o Java 11)
        ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");
        Bindings bind = se.getBindings(ScriptContext.ENGINE_SCOPE);

        bind.put("username", "DouG");

        se.eval(new FileReader("C:\\Ambiente_Java\\workspace\\cursos\\udemy\\java-avancado-do-8-ao-15\\src\\br\\com\\home\\java8\\nashhorn\\saudacao.js"));
    }
}
