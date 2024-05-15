public class doWhileSerieKD {

    public void doWhileKevinK(int tamano, char caracter){

        if (tamano < 3) {
            System.out.println("El tamaño debe ser al menos 3.");
            return;
        }


        int i = 0;
        do{
            int j = 0;
            do{
                if(j == 0){
                    System.out.print(caracter);
                }else if((i + j == tamano / 2) || (i - j == tamano / 2)){
                    System.out.print(caracter);
                }else{
                    System.out.print(" ");
                }
                j++;
            }while(j <= 2 * (tamano / 2));
            System.out.println();
            i++;
        }while(i < tamano);
    } 


    public void doWhileDelaCruzD(int tamano, char caracter){
        if (tamano < 5) {
            System.out.println("El tamaño debe ser al menos 5.");
            return;
        }

        int i = 0;
        do { 
            
            int j = 0;
            do { 
                if (j == 0 || (i == 0 && j < tamano - 1) || (i == tamano - 1 && j < tamano - 1) || (j == tamano - 1 && i > 0 && i < tamano - 1)) {
                    System.out.print(caracter);
                }else{
                    System.out.print(" ");
                }
                
                j++;
            } while (j < tamano);
            System.out.println();
            i++;
        } while (i < tamano);
    }

    public void doWhileKevinDelaCruzKD(int tamanoK, int tamanoD, char caracter){

        if (tamanoK < 3) {
            System.out.println("El tamaño de la K debe ser al menos 3.");
            return;
        }
        
        if (tamanoD < 5) {
            System.out.println("El tamaño de la D debe ser al menos 5.");
            return;
        }

        int tamano = Math.max(tamanoK, tamanoD);

        int i = 0;
        do { 
            int j = 0;
            do { 
                if (i < tamanoK && (j == 0 || (i + j == tamanoK / 2) || (i - j == tamanoK / 2))) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }

                j++;
            } while (j <= 2 * (tamanoK / 2));

            System.out.print(" ");

            int k = 0;
            do { 
                
                if (i < tamanoD && (k == 0 || (i == 0 && k < tamanoD - 1) || (i == tamanoD - 1 && k < tamanoD - 1) || (k == tamanoD - 1 && i > 0 && i < tamanoD - 1))) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }

                k++;
            } while (k < tamanoD);

            System.out.println();

            i++;
        } while (i < tamano);

    }
}
