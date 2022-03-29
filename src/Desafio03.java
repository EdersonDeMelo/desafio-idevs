import java.util.ArrayList;
import java.util.List;

public class Desafio03 {

    private List<Integer> numerosPrimos() {
        List<Integer> listaDePrimos = new ArrayList<>();
        for (int i = 2; i <= 500; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                listaDePrimos.add(i);
            }
        }
        return listaDePrimos;
    }

    public void somaDosPrimos() {
        List<Integer> lista = numerosPrimos();
        int soma = 0;
        int novaSoma = 0;
        int quantidadeDeNumeros = 0;
        int sequenciaDePrimos= 0;

        for (int i = 0; i < lista.size(); i++) {
            soma += lista.get(i);

            for (Integer lista2 : lista) {
                if (soma == lista2) {
                    novaSoma = soma;
                    break;
                }
            }

        }
        for (int j = 0; j < lista.size(); j++) {
            if (sequenciaDePrimos !=novaSoma){
                System.out.print(lista.get(j)+", ");
                sequenciaDePrimos+= lista.get(j);
                quantidadeDeNumeros++;

            }

        }

        System.out.println("Soma " + novaSoma + " quantidade de  numeros primos " + quantidadeDeNumeros);
    }
}

class MainDesafio03 {
    public static void main(String[] args) {
        Desafio03 desafio03 = new Desafio03();
        desafio03.somaDosPrimos();
    }
}