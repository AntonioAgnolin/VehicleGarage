package br.com.app.garagem.service;

import br.com.app.garagem.domain.produto.*;
import br.com.app.garagem.domain.venda.Cliente;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NegociacaoTest {

    @Test
    public void clienteDeveSerCapazDeEscolherQualVeiculoComprar() {

        //Cria um modelo e um veículo
        Modelo polo = new Modelo(
                "Polo",
                BigDecimal.valueOf(89000.0),
                Marca.VOLKSWAGEN);

        Carro carroPolo = new Carro(
                "123SDA",
                "123A4BC",
                2022L,
                Cor.BRANCO, polo,
                5L);

        //Cria um cliente com um orçamento
        Cliente john = new Cliente("John", BigDecimal.valueOf(100000.0));

        OrcamentoService service = new OrcamentoService();

        //Seleciona um veículo para o cliente
        Veiculo veiculoSelecionado = service.selecionarVeiculoPorOrcamento(Arrays.asList(carroPolo), john);

        //Verifica se o veículo selecionado não é nulo e se corresponde ao modelo esperado
        assertNotNull(veiculoSelecionado);
        assertEquals("Polo", veiculoSelecionado.getModelo().getDescricao());
    }
}
