public class forMarcosLetraC {
    public static void imprimirCFor(char simbolo, int altura) {
        int anchura = 7;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if ((i == 0) || (i == altura - 1) || (j == 0)) {
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
forMarcosLetraC imprimirCCicloFor = new forMarcosLetraC();
        imprimirCCicloFor.imprimirMFor('*', 7);
*/