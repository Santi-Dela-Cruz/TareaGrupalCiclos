public class ForJonathanLetrasJC {
    public void imprimirLetrasJCFor(int tam, char caracter) {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if ((i == 0) || (j == tam / 2)) {
                    System.out.print(caracter);
                }
                else {
                    System.out.print(" ");
                }
                if ((i == tam - 1) && j < tam / 2){
                    System.out.print(caracter);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < tam; j++) {
                if ((i == 0) || (i == tam - 1) || (j == 0)) {
                    System.out.print(caracter + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}