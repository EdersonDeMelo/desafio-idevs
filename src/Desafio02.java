import java.util.ArrayList;
import java.util.List;

public class Desafio02 {

    private List<Integer> divisores(int num) {
        List<Integer> listaDeDivisores = new ArrayList<>();
        for (int j = num; j > 0; j--) {
            if (num % j == 0) {
                listaDeDivisores.add(num);
            }
        }
        return listaDeDivisores;
    }

    public void quantidadeDeDivisores() {
        int numeros = 15;
        List<Integer> valor;
        List<Integer> valorMaisUm;

        for (int i = 1; numeros > i; i++) {
            valor = divisores(i);
            valorMaisUm = divisores(i + 1);

            if (valor.size() == valorMaisUm.size()) {
                System.out.println(i);
            }
        }
    }
}

class MainDesafio02 {
    public static void main(String[] args) {
        Desafio02 desafio02 = new Desafio02();
        desafio02.quantidadeDeDivisores();
    }
}
