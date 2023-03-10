package one.digitalinovation.gof.facade;

import one.digitalinovation.gof.subsistema1.CrmService;
import one.digitalinovation.gof.subsistema2.CepAPI;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);

    }

}

