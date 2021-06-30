package br.com.estacionamento.modelo;

public class Veiculo {
    // tenho que armazenar os veiculos em uma lista?
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private String tipo;

    public Veiculo(String marca, String modelo, String cor, String placa, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        // preciso separar se é moto ou carro;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "{Veiculo da marca " + marca +
                ", modelo: " + modelo +
                ", cor: " + cor +
                ", placa: " + placa +
                ", tipo: " + tipo +
                '}';
    }
}
