public class Desafio02 {

    public void divisores() {
        int y = 6;
        for (int i = y; i > 0; i--) {
            if (y % i == 0) {
                System.out.println(i);
            }
        }
    }
}

class MainDesafio02{
    public static void main(String[] args) {
    Desafio02 desafio02 = new Desafio02();
    desafio02.divisores();
    }
}
