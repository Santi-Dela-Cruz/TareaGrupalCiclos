public class forMarcosLetraMC {
    public static void imprimirMCFor(char simbolo, int altura) {
        int anchuraM = 7;
        int anchuraC = 7;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchuraM; j++) {
                if ((j == 0) || (j == anchuraM - 1) || ((i == j) && (j <= anchuraM / 2)) || ((i + j == anchuraM - 1) && (j >= anchuraM / 2))) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            for (int j = 0; j < anchuraC; j++) {
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
forMarcosLetraMC imprimirMCCicloFor = new forMarcosLetraMC();
        imprimirMCCicloFor.imprimirMFor('*', 7);
*/