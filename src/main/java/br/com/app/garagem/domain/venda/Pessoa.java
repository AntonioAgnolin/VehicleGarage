package br.com.app.garagem.domain.venda;

//Classe abstrata que representa uma pessoa
public abstract class Pessoa {

    //Atributo para armazenar o nome da pessoa
    private String nome;

    //Construtor da classe Pessoa
    public Pessoa(String nome) {
        this.nome = nome;
    }

    //Método getter para obter o nome da pessoa
    public String getNome() {
        return nome;
    }
}
