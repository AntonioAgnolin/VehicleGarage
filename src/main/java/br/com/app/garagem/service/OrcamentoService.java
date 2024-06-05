package br.com.app.garagem.service;

import br.com.app.garagem.domain.produto.Veiculo;
import br.com.app.garagem.domain.venda.Orcamento;

import java.util.List;

//Classe que fornece serviços relacionados ao orçamento
public class OrcamentoService {

    //Seleciona um veículo com base no orçamento disponível
    public <T extends Veiculo> T selecionarVeiculoPorOrcamento(List<T> veiculos, Orcamento orcamento) {
        return veiculos.stream()
                .filter(v -> v.getValorFipe().compareTo(orcamento.getOrcamento()) <= 0)
                .findFirst()
                .orElse(null);
    }
}
