import Enums.EstadoAnimal;
import Enums.Higiene;
import Enums.Servicos;
import Enums.Vacinas;
import Registros.Animal;
import Registros.Clientes;
import Registros.Endereco;
import Servicos.ResponseVO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class PetShop {

    String cnpj;
    Endereco endereco;

    public PetShop(String cnpj, Endereco endereco) {
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public ResponseVO higienizar(Clientes cliente, Higiene higiene) {

        BigDecimal valorAPagar = BigDecimal.ZERO;

        for (int i = 0; cliente.getPets().size() > i; i++) {
            Animal animal = cliente.getPets().get(i);

            if (Higiene.BANHO.equals(higiene)) {
                valorAPagar = valorAPagar.add(higiene.getPreco().multiply(new BigDecimal(animal.getPorte().getMultiplicador())));
                animal.setEstado(EstadoAnimal.LIMPO);
            } else if (Higiene.TOSA.equals(higiene)) {
                valorAPagar = valorAPagar.add(higiene.getPreco().multiply(new BigDecimal(animal.getPorte().getMultiplicador())));
                animal.setEstado(EstadoAnimal.TOSADO);
            } else {
                valorAPagar = valorAPagar.add(higiene.getPreco().multiply(new BigDecimal(animal.getPorte().getMultiplicador())));
                animal.setEstado(EstadoAnimal.LIMPO_E_TOSADO);
            }

        }

        return new ResponseVO(cliente.getId(), Servicos.HIGIENIZAR, valorAPagar, cliente);

    }

    public ResponseVO atendimentoClinico(Clientes cliente, String observacoes) {

        BigDecimal valorAPagar = new BigDecimal(200);
        ArrayList<String> vacinasATomar = new ArrayList<>();

        for (int i = 0; cliente.getPets().size() > i; i++) {

            ArrayList<Vacinas> vacinasDisponiveis = Vacinas.carregarAtributos();
            Animal animal = cliente.getPets().get(i);

            ArrayList<Vacinas> vacinasTomadas = cliente.getPets().get(i).getEsquemaVacinal().getVacina();

            for (int j = 0; vacinasTomadas.size() > j; j++) {
                while (vacinasDisponiveis.contains(vacinasTomadas.get(j))) {
                    vacinasDisponiveis.remove(vacinasTomadas.get(j));
                }
            }

            animal.setObservacoes(vacinasDisponiveis.toString());

        }

        return new ResponseVO(cliente.getId(), Servicos.ATENDIMENTO_CLINICO, valorAPagar, cliente);

    }


    public ResponseVO vacinacao(Clientes cliente, String observacoes) {

        BigDecimal valorAPagar = BigDecimal.ZERO;

        for (int i = 0; cliente.getPets().size() > i; i++) {
            Animal animal = cliente.getPets().get(i);

            ArrayList<String> vacinasATomar = new ArrayList<>(Arrays.asList(animal.getObservacoes().replaceAll("(\\[)|(])", "").split("\\s*,\\s*")));

            for (int j = 0; vacinasATomar.size() > j; j++) {
                Vacinas vacinaValor = Vacinas.getVacinaValor(vacinasATomar.get(j));

                animal.getEsquemaVacinal().getVacina().add(vacinaValor);
                valorAPagar = valorAPagar.add(vacinaValor.getPreco());
            }

            animal.setObservacoes("Todas as vacinas prescritas foram tomadas!");

        }

        return new ResponseVO(cliente.getId(), Servicos.VACINACAO, valorAPagar, cliente);

    }

//    public void verAlimentos() {
//
//    }
//
//    public void verRemedios() {
//
//    }
//
//    public void pagamento(ArrayList<Integer> itens) {
//
//    }

}
