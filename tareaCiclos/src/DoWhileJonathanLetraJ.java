public class DoWhileJonathanLetraJ {
    public void imprimirLetraJDoWhile(int tam, char caracter) {
        int i = 0;
        do {
            int j = 0;
            do {
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
            } while (j < tam);
            System.out.println();
            i++;
        } while (i < tam);
        System.out.println();
    }
}