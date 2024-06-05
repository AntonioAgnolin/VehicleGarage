package br.com.app.garagem.domain.venda;

import br.com.app.garagem.domain.produto.Veiculo;
import br.com.app.garagem.service.OrcamentoService;

import java.math.BigDecimal;
import java.util.List;

//Representa um cliente
public class Cliente extends Pessoa implements Orcamento {

    //Atributo para armazenar o orçamento disponível do cliente
    private BigDecimal orcamento;

    //Construtor da classe Cliente
    public Cliente(String nome, BigDecimal orcamento) {
        super(nome);
        this.orcamento = orcamento;
    }

    @Override
    //Método getter para obter o orçamento disponível do cliente
    public BigDecimal getOrcamento() {
        return orcamento;
    }

    //Método para selecionar um veículo com base no orçamento disponível do cliente
    public void selecionarVeiculo(List<? extends Veiculo> veiculos) {
        OrcamentoService orcamentoService = new OrcamentoService();
        Veiculo veiculoSelecionado = orcamentoService.selecionarVeiculoPorOrcamento(veiculos, this);
    }
}
