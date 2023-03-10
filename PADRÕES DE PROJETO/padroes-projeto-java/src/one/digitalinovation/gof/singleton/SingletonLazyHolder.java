package one.digitalinovation.gof.singleton;

/**
 * Padrão de Projeto Singleton, "Lazy Holder"
 * @see <a href="https://stackoverflow.com/questions/15019306/regarding-static-holder-singleton-pattern/24018148#24018148">Referencia</a>
 * @author Daniel Neves
 */
public class SingletonLazyHolder {

    private static class IntanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() { //private garante que ninguém vai instânciala
        super();
    }

    public static SingletonLazyHolder getInstancia() {
     return IntanceHolder.instancia;
    }
}
