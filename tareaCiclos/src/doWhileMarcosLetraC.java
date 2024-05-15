public class doWhileMarcosLetraC {
    public static void imprimirCDoWhile(char simbolo, int altura) {
        int anchura = 7;
        int i = 0;

        do {
            int j = 0;
            do {
                if ((i == 0) || (i == altura - 1) || (j == 0)) {
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
doWhileMarcosLetraC imprimirCCicloDoWhile = new doWhileMarcosLetraC();
        imprimirCCicloDoWhile.imprimirCDoWhile('*', 7);
*/