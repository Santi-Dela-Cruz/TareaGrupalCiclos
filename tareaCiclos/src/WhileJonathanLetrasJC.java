public class WhileJonathanLetrasJC {
    public void imprimirLetrasJCWhile(int tam, char caracter) {
        int i = 0;
        while (i < tam) {
            int j = 0;
            while (j < tam) {
                if ((i == 0) || (j == tam / 2)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                if ((i == tam - 1) && j < tam / 2) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.print("  ");
            j = 0;
            while (j < tam) {
                if ((i == 0) || (i == tam - 1) || (j == 0)) {
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