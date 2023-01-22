package Enums;

public enum Porte {

    PEQUENO("Pequeno", 1),
    MEDIO("Medio", 1.5),
    GRANDE("Grande", 2);

    String porte;
    double multiplicador;

    Porte(String porte, double multiplicador){
        this.porte = porte;
        this.multiplicador = multiplicador;
    }

    public String getPorte(){
        return porte;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

}
