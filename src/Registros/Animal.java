package Registros;

import Enums.EstadoAnimal;
import Enums.Porte;

import java.util.Date;

public abstract class Animal {

    String nome;
    Date nascimento;
    String raca;
    Double peso;
    String observacoes;
    EsquemaVacinal esquemaVacinal;
    EstadoAnimal estado;
    Porte porte;

    public Animal(String nome, Date nascimento, String raca, Double peso, String observacoes, EsquemaVacinal vacinas, EstadoAnimal estado, Porte porte) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.raca = raca;
        this.peso = peso;
        this.observacoes = observacoes;
        this.esquemaVacinal = vacinas;
        this.estado = estado;
        this.porte = porte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public EsquemaVacinal getEsquemaVacinal() {
        return esquemaVacinal;
    }

    public void setEsquemaVacinal(EsquemaVacinal esquemaVacinal) {
        this.esquemaVacinal = esquemaVacinal;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                ", Vacinas tomadas: " + esquemaVacinal.getVacina() +
                ", Obervação: " + observacoes;

    }

}
