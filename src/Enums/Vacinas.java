package Enums;

import Interface.VacinasInterface;

import java.math.BigDecimal;
import java.util.*;

public enum Vacinas implements VacinasInterface {

    VACINA_1("V8", new BigDecimal(20)),
    VACINA_2("V10", new BigDecimal(50)),
    VACINA_3("Raiva", new BigDecimal(15)),
    VACINA_4("Gripe", new BigDecimal(70)),
    VACINA_5("Leishmaniose", new BigDecimal(80));

    String vacina;
    BigDecimal preco;
    private static Map<String, Vacinas> tipoVacina = new HashMap<>();

    static{
        for (Vacinas vacinas : Vacinas.values()){
            tipoVacina.put(vacinas.getVacina(), vacinas);
        }
    }

    public static Vacinas getVacinaValor(String vacina){
        return tipoVacina.get(vacina);
    }

    Vacinas(String vacina, BigDecimal preco) {
        this.vacina = vacina;
        this.preco = preco;
    }

    public String getVacina() {
        return vacina;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public static ArrayList<Vacinas> carregarAtributos(){

        List<Vacinas> lista = Arrays.asList(Vacinas.values());
        List<Vacinas> retorno = new ArrayList<>();

        for (int i=0; i<lista.size(); i++){
            retorno.add(lista.get(i));
        }

        return new ArrayList<>(retorno);

    }

    @Override
    public String toString() {
        return vacina;
    }

}
