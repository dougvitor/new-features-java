package br.com.home.java15.record;

import java.lang.reflect.Field;

record Produto (Integer codigo){}

public class RecordExample {
    public static void main(String[] args) {
        Produto recordProduto = new Produto(100);
        try {
            Field codigo = recordProduto.getClass().getDeclaredField("codigo");
            codigo.setAccessible(true);
            codigo.set(recordProduto, 200);
        } catch (IllegalAccessException e) {
            System.out.print("Não é possível acessar atributos de record através de reflection, causando o seguinte erro: " + e.getMessage());
        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }
    }
}
