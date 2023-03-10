package one.digitalinovation.gof.singleton;

/**
 * Padrão de Projeto Singleton, "Preguiçoso"
 * @author Daniel Neves
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() { //private garante que ninguém vai instânciala
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
