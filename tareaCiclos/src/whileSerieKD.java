//Ciclos While - De La Cruz

public class whileSerieKD {
    /**
     * Funcion de tipo void que imprime la inicial del primer nombre del autor.
     * @param tamano: Variable de tipo int que dara el tamano a la letra.
     * @param caracter: Variable de tipo char que es el caracter con el que se formara la letra.
     */
    public void imprimir_whileKevinLetraK(int tamano, char caracter) {
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

/**
     Funcion de tipo void que imprime la inicial del primer apellido del autor.
     * @param tamano: Variable de tipo int que dara el tamano a la letra.
     * @param caracter: Variable de tipo char que es el caracter con el que se formara la letra.
 */
    public void imprimir_whileDelaCruzLetraD(int tamano,char caracter){
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

    /**
     * Funcion de tipo void que imprime las iniciales del nombre y apellido del autor.
     * @param tamanoK: Variable de tipo int que le dara el tamano a la inicial del nombre.
     * @param tamanoD: Variable de tipo int que le dara el tamano a la inicial del apellido.
     * @param caracter: Variable de tipo char que es el caracter con el que se formara la letra.
     */
    public void imprimir_whileKevinDelaCruzLetrasKD(int tamanoK, int tamanoD, char caracter){

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
        while(i < tamano){
            int j = 0;
            while(j <= 2 * (tamanoK / 2)){
                if(i < tamanoK && (j == 0 || (i + j == tamanoK / 2) || (i - j == tamanoK / 2))){
                    System.out.print(caracter);
                }else{
                    System.out.print(" ");
                }
                j++;
            }

            System.out.print(" ");

            int k = 0;
            while(k < tamanoD){
                if (i < tamanoD && (k == 0 || (i == 0 && k < tamanoD - 1) || (i == tamanoD - 1 && k < tamanoD - 1) || (k == tamanoD - 1 && i > 0 && i < tamanoD - 1))) {
                    System.out.print(caracter);
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
