public class whileDanteLetraD {

    public void whileDanteD (int tamano, String letra){
        int cont = 1;
        int cont2 =0;
        
        //Primera linea
        System.out.print(letra+letra+letra + " ");
        while (cont<=tamano-3) {
            System.out.print(letra);
            cont ++;
        }
         System.out.println();

        cont=1;

        //lineas medias
        while (cont <tamano-1) {
            System.out.print(letra + " "+" ");
            cont ++;
            while (cont2 <tamano-3) {
                System.out.print(" ");
                cont2 ++ ;
            }
            System.out.println(letra);
        }
        cont=1;

        //Ultima linea
        System.out.print(letra+letra+letra + " ");
        while (cont<=tamano-3) {
             System.out.print(letra);
             cont ++;
         }
          System.out.println();




    }
}
