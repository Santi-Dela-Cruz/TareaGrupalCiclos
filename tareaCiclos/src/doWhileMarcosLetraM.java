public class DoWhileMarcosLetraM {
    public void imprimirMDoWhile(char simbolo, int altura) {
        int anchura = 7;
        int i = 0;

        do {
            int j = 0;
            do {
                if ((j == 0) || (j == anchura - 1) || ((i == j) && (j <= anchura / 2)) || (((i + j) == (anchura - 1)) && (j >= anchura / 2))) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < anchura);
            System.out.println();
            i++;
        } while (i < altura);
    }
}

/*En caso de querer usarla en la rama main
doWhileMarcosLetraM imprimirMCicloDoWhile = new doWhileMarcosLetraM();
        imprimirMCicloDoWhile.imprimirMDoWhile('*', 7);
*/