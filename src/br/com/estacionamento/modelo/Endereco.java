package br.com.estacionamento.modelo;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(String rua, int numero, String bairro, String cidade, String estado, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "{Endereco: " +
                "rua='" + rua +
                ", numero=" + numero +
                ", bairro='" + bairro +
                ", cidade='" + cidade +
                ", estado='" + estado +
                ", pais='" + pais +
                '}';
    }
}
