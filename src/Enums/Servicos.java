package Enums;

public enum Servicos {

    HIGIENIZAR("Higienizar"),
    ATENDIMENTO_CLINICO("Atendimento Clínico"),
    VACINACAO("Vacinação");

    String servicos;

    Servicos(String servicos){
        this.servicos = servicos;
    }

    public String getServicos(){
        return servicos;
    }

}
