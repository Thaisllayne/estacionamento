package br.com.estacionamento.teste;

import br.com.estacionamento.modelo.Endereco;
import br.com.estacionamento.modelo.Estabelecimento;
import br.com.estacionamento.modelo.Veiculo;

public class Teste {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo(
                "Fiat",
                "modeloX",
                "branco",
                "DEX-4354",
                "moto");

        Endereco endereco1 = new Endereco(
                "Avenida Paulista",
                2345,
                "Consolação",
                "São Paulo",
                "SP",
                "Brasil"
        );

        Estabelecimento estabelecimento1 = new Estabelecimento(
                "Estacionamento do João",
                "111.111.111-11",
                "90877788943",
                46,
                84,
                endereco1,
                veiculo1);

        System.out.println(veiculo1);
        System.out.println(endereco1);
        System.out.println(estabelecimento1);
    }
}
