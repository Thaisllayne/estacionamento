package br.com.estacionamento.teste;

import br.com.estacionamento.modelo.Estabelecimento;

public class TesteEstabelecimento {
    public static void main(String[] args) {

        Estabelecimento estabelecimento1 = new Estabelecimento();

        estabelecimento1.setNome("Estacionamento do João");

        System.out.println(estabelecimento1.getNome());
    }
}
