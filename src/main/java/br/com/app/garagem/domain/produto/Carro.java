package br.com.app.garagem.domain.produto;

import java.math.BigDecimal;

//Representa um carro
public class Carro extends Veiculo {

    private Long quantidadePassageiros;

    //Construtor da classe Carro
    public Carro(String chassi,
                 String placa,
                 Long ano,
                 Cor cor,
                 Modelo modelo,
                 Long quantidadePassageiros) {
        super(chassi, placa, ano, cor, modelo);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    //Método getter para obter a quantidade de passageiros
    public Long getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    //Implementação do método abstrato da classe pai para obter o valor Fipe do carro
    @Override
    public BigDecimal getValorFipe() {
        //Retorna o valor do modelo do carro
        return this.getModelo().getValor();
    }
}
