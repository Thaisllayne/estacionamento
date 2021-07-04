package br.com.estacionamento.modelo;

import br.com.estacionamento.modelo.Endereco;
import br.com.estacionamento.modelo.Veiculo;

public class Estabelecimento {
    private String nome;
    private String CNPJ;
    private String telefone;
    private int qntVagasMotos;
    private int qntVagasCarros;
    private Endereco endereco;
    private Veiculo veiculo;

    public Estabelecimento(String nome, String CNPJ, String telefone, int qntVagasMotos, int qntVagasCarros, Endereco endereco, Veiculo veiculo) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.telefone = telefone;
        this.qntVagasMotos = qntVagasMotos;
        this.qntVagasCarros = qntVagasCarros;
        this.endereco = endereco;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getQntVagasMotos() {
        return qntVagasMotos;
    }

    public void setQntVagasMotos(int qntVagasMotos) {
        this.qntVagasMotos = qntVagasMotos;
    }

    public int getQntVagasCarros() {
        return qntVagasCarros;
    }

    public void setQntVagasCarros(int qntVagasCarros) {
        this.qntVagasCarros = qntVagasCarros;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "{Estabelecimento: " +
                "nome='" + nome +
                ", CNPJ='" + CNPJ +
                ", telefone='" + telefone +
                ", qntVagasMotos=" + qntVagasMotos +
                ", qntVagasCarros=" + qntVagasCarros +
                ", endereco=" + endereco +
                ", veiculo=" + veiculo +
                '}';
    }
}
