package Registros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import Enums.Vacinas;

public class EsquemaVacinal {

    Date data;
    ArrayList<Vacinas> vacina;
    String observacao;

    public EsquemaVacinal(ArrayList<Vacinas> vacina, Date data, String observacao) {
        this.vacina = vacina;
        this.data = data;
        this.observacao = observacao;
    }

    public EsquemaVacinal(Vacinas vacina, Date data, String observacao) {
        this.vacina = new ArrayList<>(Arrays.asList(vacina));
        this.data = data;
        this.observacao = observacao;
    }

    public Date getData() {
        return data;
    }

    public ArrayList<Vacinas> getVacina() {
        return vacina;
    }

    public String getObservacao() {
        return observacao;
    }

}
