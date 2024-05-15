public class whileMarcosLetraM {
    public static void imprimirMWhile(char simbolo, int altura) {
        int anchura = 7;
        int i = 0;

        while (i < altura) {
            int j = 0;
            while (j < anchura) {
                if ((j == 0) || (j == anchura - 1) || ((i == j) && (j <= anchura / 2)) || (((i + j) == (anchura - 1)) && (j >= anchura / 2))) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;

        }
    }
}

/*En caso de querer usarla en la rama main
whileMarcosLetraM imprimirMCicloWhile = new whileMarcosLetraM();
        imprimirMCicloWhile.imprimirMWhile('*', 7);
*/