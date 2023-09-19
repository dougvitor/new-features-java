package br.com.home.java16.defaultmethodsfromproxyinstances;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface IHelloWorld{
    String goodbye();

    default String hello(){
        return "Hello World";
    }
}

public class DefaultMethodsFromProxyInstancesExample {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object proxy = Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class<?>[]{IHelloWorld.class},
                (prox, method, arguments) -> {
                    if(method.isDefault()){
                        return InvocationHandler.invokeDefault(prox, method, arguments);
                    }
                    return "Interface não possui método default";
                }
        );

        Method method = proxy.getClass().getMethod("hello");
        System.out.println(method.invoke(proxy) == "Hello World");

        method = proxy.getClass().getMethod("goodbye");
        System.out.println(method.invoke(proxy) == "Interface não possui método default");
    }

}
