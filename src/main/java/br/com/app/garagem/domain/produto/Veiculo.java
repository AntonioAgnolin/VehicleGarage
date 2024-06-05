package br.com.app.garagem.domain.produto;

import java.math.BigDecimal;

//Representa um veículo
public abstract class Veiculo {

    private String chassi;
    private String placa;
    private Long ano;
    private Cor cor;
    private Modelo modelo;

    //Construtor da classe Veiculo
    public Veiculo(String chassi,
                   String placa,
                   Long ano,
                   Cor cor,
                   Modelo modelo) {
        this.chassi = chassi;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
    }

    //Métodos getters para obter os atributos do veículo
    public String getChassi() {
        return chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public Long getAno() {
        return ano;
    }

    public Cor getCor() {
        return cor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    //Método abstrato para obter o valor Fipe do veículo
    public abstract BigDecimal getValorFipe();
}
