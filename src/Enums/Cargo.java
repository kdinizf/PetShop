package Enums;

public enum Cargo {

    VETERINARIO("Veterin�rio"),
    ESTAGIARIO("Estagi�rio"),
    TOSADOR("Tosador"),
    BANHISTA("Banhista"),
    RECEPCIONISTA("Recepcionista"),
    AUXILIAR_GERAL("Auxiliar Geral");

    String cargo;
    Cargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo(){
        return cargo;
    }

}
