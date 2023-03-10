package one.digitalinovation.gof.subsistema2;

import one.digitalinovation.gof.singleton.SingletonEager;

public class CepAPI {

    private static CepAPI instancia = new CepAPI();

    private CepAPI() { //private garante que ninguém vai instânciala
        super();
    }

    public static CepAPI getInstancia() {

        return instancia;
    }

    public String recuperarCidade (String cep){
        return  "João Pessoa !!!";
    }

    public String recuperarEstado(String cep){
        return "PB...";
    }

}
