package Registros;

import Enums.EstadoAnimal;
import Enums.Porte;

import java.util.Date;

public class Gato extends Animal{

    public Gato(String nome, Date nascimento, String raca, Double peso, String observacoes, EsquemaVacinal vacinas, EstadoAnimal estado, Porte porte) {
        super(nome, nascimento, raca, peso, observacoes, vacinas, estado, porte);
    }

}
