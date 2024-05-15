public class forMarcosLetraM {

    public static void imprimirMFor(char simbolo, int altura) {
        int anchura = 7;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if ((j == 0) || (j == anchura - 1) || ((i == j) && (j <= anchura / 2)) || (((i + j) == (anchura - 1)) && (j >= anchura / 2))) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*En caso de querer usarla en la rama main
forMarcosLetraM imprimirMCicloFor = new forMarcosLetraM();
        imprimirMCicloFor.imprimirMFor('*', 7);
*/