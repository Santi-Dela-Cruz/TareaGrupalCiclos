public class WhileJonathanLetraC {
    public void imprimirLetraCWhile(int tam, char caracter) {
        int i = 0;
        while (i < tam) {
            int j = 0;
            while (j < tam) {
                if ((i == 0) || (j == 0) || (i == tam - 1)) {
                    System.out.print(caracter + " ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }
}