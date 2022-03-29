public class Desafio02 {

    public void divisores(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i + ">>>>>>>");
            for (int j = i; j > 0; j--) {
                if (i % j == 0) {
                    System.out.print(j + ", ");
                }
            }
            System.out.println();
        }
    }
    public void quantidadeDeDivisores(){
        int numeros = 15;
        for (int i = 0; i < numeros; i++) {

        }
    }
}

class MainDesafio02 {
    public static void main(String[] args) {
        Desafio02 desafio02 = new Desafio02();
        desafio02.divisores(1);
    }
}
