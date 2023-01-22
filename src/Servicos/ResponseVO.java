package Servicos;

import Enums.Servicos;
import Registros.Clientes;

import java.math.BigDecimal;

public class ResponseVO {

    int id;
    Servicos servico;
    BigDecimal valor;
    Clientes cliente;

    public ResponseVO(){
    }

    public ResponseVO(int id, Servicos servico, BigDecimal valor, Clientes cliente) {
        this.id = id;
        this.servico = servico;
        this.valor = valor;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Servicos getServico() {
        return servico;
    }

    public void setServico(Servicos servico) {
        this.servico = servico;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ID do cliente: " + id +
                "\nServiço: " + servico +
                "\nCliente: " + cliente +
                "\nPets: " + cliente.getPets() +
                "\nTotal a pagar: " + valor;
    }

}
