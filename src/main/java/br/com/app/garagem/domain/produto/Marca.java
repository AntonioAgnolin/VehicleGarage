package br.com.app.garagem.domain.produto;

//Enumeração que representa as marcas disponíveis para os modelos de veículos
public enum Marca {

    FIAT("Fiat"),
    PEUGEOT("Peugeot"),
    RENAULT("Renault"),
    CITROEN("Citroën"),
    VOLKSWAGEN("VolksWagen"),
    AUDI("Audi"),
    BMW("BMW"),
    MINI("Mini"),
    HONDA("Honda"),
    TOYOTA("Toyota"),
    KIA("Kia"),
    HYUNDAI("Hyundai");

    private String nome;

    //Construtor da enumeração Marca
    Marca(String nome) {
        this.nome = nome;
    }

    //Método getter para obter o nome da marca
    public String getNome() {
        return nome;
    }
}
