import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio03 {

    /**
     * Metodo responsavel por verificar quais são os numeros primos dentro de um numero inteiro escolhido.
     * @param num Recebe um inteiro como parametro.
     * @return Retorna uma lista com os numeros primos gerados.
     */
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
     * Metodo responsavel por fazer a soma dos numeros primos gerados, verificar se a soma gera o numero primo
     * maior dentro do numero escolhido, e exibir a sequencia de numeros primos, o numero primo gerado
     * e quantidade de primos utilizado.
     * @param num Recebe um inteiro como parametro.
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
        for (Integer valorNaPosicaoNaLista : lista) {
            if (sequenciaDePrimos != novaSoma) {
                System.out.print(valorNaPosicaoNaLista + ", ");
                sequenciaDePrimos += valorNaPosicaoNaLista;
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