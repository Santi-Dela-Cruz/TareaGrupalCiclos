public class serieFor {

    public void forKevinK(int tamano, char caracter){
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


    public void forDelaCruzD(int tamano, char caracter){
        /*Objetivo: 
        * * *
        *     *
        *       *
        *     *
        * * *
         
         */
        if (tamano < 5) {
            System.out.println("El tamaño debe ser al menos 5.");
            return;
        }
        
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (j == 0 || (i == 0 && j < tamano - 1) || (i == tamano - 1 && j < tamano - 1) || (j == tamano - 1 && i > 0 && i < tamano - 1)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void forKevinDelaCruzKD(int tamanoK, int tamanoD, char caracter){

        /* Objetivo
            
            *     *  * * *
            *   *    *      *
            * *      *        *
            *   *    *      *
            *     *  * * *
            
             */

        if (tamanoK < 3) {
            System.out.println("El tamaño de la K debe ser al menos 3.");
            return;
        }
        
        if (tamanoD < 5) {
            System.out.println("El tamaño de la D debe ser al menos 5.");
            return;
        }

        int tamano = Math.max(tamanoK, tamanoD);

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j <= 2 * (tamanoK / 2); j++) {
                if (i < tamanoK && (j == 0 || (i + j == tamanoK / 2) || (i - j == tamanoK / 2))) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.print(" ");

            // Imprimir la 'D'
            for (int j = 0; j < tamanoD; j++) {
                if (i < tamanoD && (j == 0 || (i == 0 && j < tamanoD - 1) || (i == tamanoD - 1 && j < tamanoD - 1) || (j == tamanoD - 1 && i > 0 && i < tamanoD - 1))) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }

}
