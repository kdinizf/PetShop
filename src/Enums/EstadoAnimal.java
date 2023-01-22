package Enums;

public enum EstadoAnimal {

    SUJO("Sujo"),
    NORMAL("Normal"),
    LIMPO("Limpo"),
    LIMPO_E_TOSADO("Limpo e Tosado"),
    TOSADO("Tosado");

    String estadoAnimal;

    EstadoAnimal(String estadoAnimal){
        this.estadoAnimal = estadoAnimal;
    }

    public String getEstadoAnimal(){
        return estadoAnimal;
    }

}
