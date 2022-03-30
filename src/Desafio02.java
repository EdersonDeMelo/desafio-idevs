import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio02 {
    /**
     * Metodo responsavel por gerar lista com divisores
     * @param num recebe numero inteiro
     * @return retorna uma lista com os divisores
     */
    private List<Integer> divisores(int num) {
        List<Integer> listaDeDivisores = new ArrayList<>();
        for (int j = num; j > 0; j--) {
            if (num % j == 0) {
                listaDeDivisores.add(num);
            }
        }
        return listaDeDivisores;
    }

    public void quantidadeDeDivisores(int numeros) {
        List<Integer> valor;
        List<Integer> valorMaisUm;

        for (int i = 1; numeros > i; i++) {
            valor = divisores(i);
            valorMaisUm = divisores(i + 1);

            if (valor.size() == valorMaisUm.size()) {
                System.out.println("O numero " + i + " e o numero posterior a ele possuem a mesma quantidade de divisores.");
            }
        }
    }
}

class MainDesafio02 {
    public static void main(String[] args) {
        Desafio02 desafio02 = new Desafio02();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o numero desejado: ");
        int numeroInformado = entrada.nextInt();
        desafio02.quantidadeDeDivisores(numeroInformado);

    }
}
