package one.digitalinovation.gof.singleton;

import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        //Testes do Design Pattern Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println("Intância 1 " + lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println("Intância 2 " + lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println("Intância 1 " + eager);
        eager = SingletonEager.getInstancia();
        System.out.println("Intância 2 " + eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Intância 1 " + lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Intância 2 " + lazyHolder);
        System.out.println("\n---------------------------------------------\n\n\n");

        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        System.out.println("\n---------------------------------------------\n\n\n");

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Daniel Neves","58068370");



    }
}
