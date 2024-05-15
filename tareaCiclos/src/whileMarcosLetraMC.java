public class whileMarcosLetraMC {
    public static void imprimirMCWhile(char simbolo, int altura) {
        int anchuraM = 7;
        int anchuraC = 7;
        int i = 0;

        while (i < altura) {
            int j = 0;
            int k = 0;
            while (j < anchuraM) {
                if ((j == 0) || (j == anchuraM - 1) || ((i == j) && (j <= anchuraM / 2)) || (((i + j) == (anchuraM - 1)) && (j >= anchuraM / 2))) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
                j++;
            }

            System.out.print("  ");

            while (k < anchuraC) {
                if ((i == 0) || (i == altura - 1) || (k == 0)) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
                k++;
            }
            System.out.println();
            i++;
        }
    }
}

/*En caso de querer usarla en la rama main
whileMarcosLetraMC imprimirMCCicloWhile = new whileMarcosLetraMC();
        imprimirMCCicloWhile.imprimirMCWhile('*', 7);
*/