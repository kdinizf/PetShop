package Registros;

import Enums.Cargo;

import java.math.BigDecimal;
import java.util.Date;

public class Funcionario extends Pessoa {

    int id;
    BigDecimal salario;
    Date admissao;
    Date desligamento;
    Cargo cargo;

    public Funcionario(String nome, String cpf, String email, String telefone, Endereco endereco, int id, BigDecimal salario, Date admissao, Date desligamento, Cargo cargo) {
        super(nome, cpf, email, telefone, endereco);
        this.id = id;
        this.salario = salario;
        this.admissao = admissao;
        this.desligamento = desligamento;
        this.cargo = cargo;
    }



}
