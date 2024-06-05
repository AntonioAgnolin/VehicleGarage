package br.com.app.garagem.domain.venda;

import br.com.app.garagem.domain.produto.Veiculo;

//Representa uma venda de veículo
public class Venda {

    private Cliente cliente;
    private Vendedor vendedor;
    private Veiculo veiculo;

    //Construtor da classe Venda
    public Venda(Cliente cliente, Vendedor vendedor, Veiculo veiculo) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.veiculo = veiculo;
    }
}
