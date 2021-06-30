package br.com.estacionamento.teste;

import br.com.estacionamento.modelo.Veiculo;

public class TesteVeiculo {

    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Fiat", "modeloX", "branco", "DEX-4354", "moto");

        System.out.println(veiculo1);

        System.out.println(veiculo1.getTipo());


    }


}

