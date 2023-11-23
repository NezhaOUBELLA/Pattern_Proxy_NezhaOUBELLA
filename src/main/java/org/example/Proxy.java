package org.example;

public class Proxy implements Abstraction {
    private AbstractionImpl implementation;
    @Override
    public void operation() {
        System.out.println("Vérification des conditions d'accès par le proxy");
        implementation=new AbstractionImpl();
        implementation.operation();
    }
}
