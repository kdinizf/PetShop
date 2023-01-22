package Registros;

import java.util.ArrayList;

public class Clientes extends Pessoa{

    int id;
    ArrayList<Animal> pets;

    public Clientes(String nome, String cpf, String email, String telefone, Endereco endereco, int id, ArrayList<Animal> pets) {
        super(nome, cpf, email, telefone, endereco);
        this.id = id;
        this.pets = pets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Animal> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Animal> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return nome;
    }

}
