public class whileMarcosLetraC {
    public void imprimirCWhile(char simbolo, int altura) {
        int anchura = 7;
        int i = 0;

        while (i < altura) {
            int j = 0;
            while (j < anchura) {
                if ((i == 0) || (i == altura - 1) || (j == 0)) {
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
whileMarcosLetraC imprimirCCicloWhile = new whileMarcosLetraC();
        imprimirCCicloWhile.imprimirCWhile('*', 7);
*/