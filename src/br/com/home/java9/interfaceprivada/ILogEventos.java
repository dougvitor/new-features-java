package br.com.home.java9.interfaceprivada;

public interface ILogEventos {

    default void logInfo(String mensagem){
        log(mensagem, "INFO");
    }

    default void logWarn(String mensagem){
        log(mensagem, "WARN");
    }

    default void logError(String mensagem){
        log(mensagem, "ERROR");
    }

    default void logFatal(String mensagem){
        log(mensagem, "FATAL");
    }

    //New Feature Java 9
    private void log(String mensagem, String tipo){
        System.out.println("Início da mensagem");

        System.out.println(tipo + ": " + mensagem);

        System.out.println("Término da mensagem");
    }

}
