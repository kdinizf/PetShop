package Enums;

public enum Servicos {

    HIGIENIZAR("Higienizar"),
    ATENDIMENTO_CLINICO("Atendimento Cl�nico"),
    VACINACAO("Vacina��o");

    String servicos;

    Servicos(String servicos){
        this.servicos = servicos;
    }

    public String getServicos(){
        return servicos;
    }

}
