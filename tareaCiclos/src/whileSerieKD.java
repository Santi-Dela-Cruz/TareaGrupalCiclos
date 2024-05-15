public class whileSerieKD {
    public static void main(String[] args) {
        whileSerieK(9, '*');
        whileSerieD(9, '*');
    }

    public static void whileSerieK(int tamano, char caracter) {
        /* Objetivo
         
            *     *
            *   *
            * * 
            *   *
            *     *
            
        */
        if (tamano < 3) {
            System.out.println("El tamaño debe ser al menos 3.");
            return;
        }

        int i = 0;
        while (i < tamano) {
            int j = 0;
            while (j <= 2 * (tamano / 2)) {
                if (j == 0) {
                    System.out.print(caracter);
                } else if ((i + j == tamano / 2) || (i - j == tamano / 2)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void whileSerieD(int tamano,char caracter){
        /*Objetivo: 

        * * *
        *     *
        *       *
        *     *
        * * *
         
         */

        if (tamano < 5) {
            System.out.println("El tamaño debe ser al menos 3.");
            return;
        }

        int i = 0;
        while (i < tamano) {
            int j = 0;
            while (j <= 2 * (tamano)) {
                if (j == 0 || (i == 0 && j < tamano - 1) || (i == tamano - 1 && j < tamano - 1) || (j == tamano - 1 && i > 0 && i < tamano - 1)) {
                    System.out.print(caracter);
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
