package br.com.home.java9.interfaceprivada;

public class LogEventosExample {

    public static void main(String[] args) {
        ILogEventos log = new ILogEventos() {
            @Override
            public void logFatal(String mensagem) {
                ILogEventos.super.logFatal(mensagem);
            }
        };

        log.logError("Conexão falhou!");
    }

}
