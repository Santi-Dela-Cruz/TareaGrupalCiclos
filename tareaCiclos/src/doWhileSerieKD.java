public class doWhileSerieKD {
    public static void main(String[] args) {
        doWhileSerieK(9, '*');
        doWhileSerieD(9, '*');
        
    }

    public static void doWhileSerieK(int tamano, char caracter){

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


    public static void doWhileSerieD(int tamano, char caracter){
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
}
