package one.digitalinovation.gof.singleton;

/**
 * Singleton "Apressado"
 * @author Daniel Neves
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() { //private garante que ninguém vai instânciala
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
