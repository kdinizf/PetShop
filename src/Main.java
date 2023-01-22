import Enums.EstadoAnimal;
import Enums.Higiene;
import Enums.Porte;
import Enums.Vacinas;
import Registros.*;
import Servicos.ResponseVO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;


public class Main {
    public static void main(String[] args) {

        PetShop petShop = new PetShop("15.187.461/0001-92", new Endereco("Rua das Orquídeas",
                "Parque Alexandre", "", 23, "06432-983", "São Paulo",
                "SP", ""));

        Calendar calendarioNascimento = Calendar.getInstance();
        Calendar calendarioVacina = Calendar.getInstance();

        // Gato 1
        calendarioNascimento.set(2012,10,23);
        calendarioVacina.set(2021,12,30);

        Gato pandora = new Gato("Pandora", calendarioNascimento.getTime(), "Siamês", 5.0,
                "Muito brava e obesa", new EsquemaVacinal(Vacinas.VACINA_1, calendarioVacina.getTime(),
                ""), EstadoAnimal.SUJO, Porte.MEDIO);

        // Gato 2
        calendarioNascimento.set(2021,06,30);
        calendarioVacina.set(2022,03,22);

        Gato juquinha = new Gato("Juquinha", calendarioNascimento.getTime(), "Frajola", 4.0,
                "Muito sapeca e caçador", new EsquemaVacinal(Vacinas.VACINA_3, calendarioVacina.getTime(),
                ""), EstadoAnimal.SUJO, Porte.PEQUENO);

        // Cachorro 1
        calendarioNascimento.set(2015,01,21);
        calendarioVacina.set(2020,11,10);

        Cachorro duck = new Cachorro("Duck", calendarioNascimento.getTime(), "Pastor Alemão", 15.0,
                "Manso e brincalhão", new EsquemaVacinal(new ArrayList<>(Arrays.asList(Vacinas.VACINA_3, Vacinas.VACINA_5)), calendarioVacina.getTime(),
                ""), EstadoAnimal.SUJO, Porte.GRANDE);

        //Clientes
        Clientes karina = new Clientes("Karina","402.436.428-19","kaka@hotmail.com",
                "(11)95346-8297",new Endereco("Avenida Faria Lima","Centro","Casa",
                23,"06277-779","São Paulo","SP","Próximo da pizzaria"),
                1,new ArrayList<>(Arrays.asList(juquinha, pandora)));

        Clientes guilherme = new Clientes("Guilherme","432.536.891-39","gui@hotmail.com",
                "(11)95232-8786",new Endereco("Avenida Rui Barbosa","Parque Cotia","Apartamento 2",
                23,"06599-119","Osasco","SP","Próximo do Hospital Geral"),
                2,new ArrayList<>(Arrays.asList(duck)));


        ResponseVO higienizar = petShop.higienizar(karina, Higiene.BANHO_E_TOSA);
        System.out.println(higienizar);
        System.out.println();

        ResponseVO atendimentoClinico = petShop.atendimentoClinico(karina, "");
        System.out.println(atendimentoClinico);
        System.out.println();

        ResponseVO vacinacao = petShop.vacinacao(karina, "");
        System.out.println(vacinacao);


    }

}