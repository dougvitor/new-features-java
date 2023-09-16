package br.com.home.java8.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.UUID;

public class Base64EncodeAndDecode {

    public static void main(String[] args) {
        String uuidRandomico = UUID.randomUUID().toString();
        String uuidRandomicoEncoderPadrao = Base64.getEncoder().encodeToString(uuidRandomico.getBytes(StandardCharsets.UTF_8));
        String uuidRandomicoURLEncoder = Base64.getUrlEncoder().encodeToString(uuidRandomico.getBytes(StandardCharsets.UTF_8));
        String uuidRandomicoMIMEEncoder = Base64.getMimeEncoder().encodeToString(uuidRandomico.getBytes(StandardCharsets.UTF_8));

        String uuidRandomicoURLDecoderWithMIMEDecoder = new String(Base64.getMimeDecoder().decode(uuidRandomicoURLEncoder.getBytes(StandardCharsets.UTF_8)));

        List<String> textosProcessados = List.of(uuidRandomico, uuidRandomicoEncoderPadrao, uuidRandomicoURLEncoder, uuidRandomicoMIMEEncoder, uuidRandomicoURLDecoderWithMIMEDecoder);
        textosProcessados.forEach(System.out::println);
    }
}
