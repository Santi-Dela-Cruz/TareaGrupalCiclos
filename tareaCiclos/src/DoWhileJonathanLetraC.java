public class DoWhileJonathanLetraC {
    public void imprimirLetraCDoWhile(int tam, char caracter) {
        int i = 0;
        do {
            int j = 0;
            do {
                if ((i == 0) || (j == 0) || (i == tam - 1)) {
                    System.out.print(caracter + " ");
                }
                j++;
            } while (j < tam);
            System.out.println();
            i++;
        } while (i < tam);
        System.out.println();
    }
}