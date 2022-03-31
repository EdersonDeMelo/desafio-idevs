import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio03 {

    private List<Integer> numerosPrimos(int num) {
        List<Integer> listaDePrimos = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
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

    /**
     * 
     * @param num
     */
    public void somaDosPrimos(int num) {
        List<Integer> lista = numerosPrimos(num);
        int soma = 0;
        int novaSoma = 0;
        int quantidadeDeNumeros = 0;
        int sequenciaDePrimos= 0;

        for (int i = 0; i < lista.size(); i++) {
            soma += lista.get(i);

            for (Integer valorNaPosicao : lista) {
                if (soma == valorNaPosicao) {
                    novaSoma = soma;
                    break;
                }
            }

        }
        for (Integer valorNaPosicaoDaLista : lista) {
            if (sequenciaDePrimos != novaSoma) {
                System.out.print(valorNaPosicaoDaLista + ", ");
                sequenciaDePrimos += valorNaPosicaoDaLista;
                quantidadeDeNumeros++;

            }

        }

        System.out.println("Soma " + novaSoma + " quantidade de  numeros primos " + quantidadeDeNumeros);
    }
}

class MainDesafio03 {
    public static void main(String[] args) {
        Desafio03 desafio03 = new Desafio03();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o numero desejado: ");
        int numeroInformado = entrada.nextInt();
        desafio03.somaDosPrimos(numeroInformado);
    }
}