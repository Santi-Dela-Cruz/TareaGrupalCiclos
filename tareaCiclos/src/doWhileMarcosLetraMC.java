public class DoWhileMarcosLetraMC {
    public void imprimirMCDoWhile(char simbolo, int altura) {
        int anchuraM = 7;
        int anchuraC = 7;
        int i = 0;

        do {
            int j = 0;
            int k = 0;
            do {
                if ((j == 0) || (j == anchuraM - 1) || ((i == j) && (j <= anchuraM / 2)) || (((i + j) == (anchuraM - 1)) && (j >= anchuraM / 2))) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < anchuraM);

            System.out.print("  ");

            do {
                if ((i == 0) || (i == altura - 1) || (k == 0)) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
                k++;
            } while (k < anchuraC);
            System.out.println();
            i++;
        } while (i < altura);
    }
}

/*En caso de querer usarla en la rama main
doWhileMarcosLetraMC imprimirMCCicloDoWhile = new doWhileMarcosLetraMC();
        imprimirMCCicloDoWhile.imprimirMCDoWhile('*', 7);
*/
