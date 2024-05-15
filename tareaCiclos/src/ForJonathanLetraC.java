public class ForJonathanLetraC {
    public void imprimirLetraCFor(int tam, char caracter) {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if ((i == 0) || (j == 0) || (i == tam - 1)) {
                    System.out.print(caracter + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}