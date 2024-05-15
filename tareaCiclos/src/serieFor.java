public class serieFor {
    //Series de Santiago
    public static void main(String[] args) {
        forSerieK(9, '*');
    }

    public static void forSerieK(int tamano, char caracter){
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
            
            for (int i = 0; i < tamano; i++) {
                for (int j = 0; j <= 2 * (tamano / 2); j++) {
                    if (j == 0) {
                        System.out.print(caracter);
                    }
                    else if ((i + j == tamano / 2) || (i - j == tamano / 2)) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
}
