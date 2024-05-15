import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("TAREA GRUPAL CICLOS");
        System.out.println("- Jonathan Cuasapaz");
        ForJonathanLetraJ fj = new ForJonathanLetraJ();
        ForJonathanLetraC fc = new ForJonathanLetraC();
        ForJonathanLetrasJC fjc = new ForJonathanLetrasJC();
        WhileJonathanLetraJ wj = new WhileJonathanLetraJ();
        WhileJonathanLetraC wc = new WhileJonathanLetraC();
        WhileJonathanLetrasJC wjc = new WhileJonathanLetrasJC();
        DoWhileJonathanLetraJ dwj = new DoWhileJonathanLetraJ();
        DoWhileJonathanLetraC dwc = new DoWhileJonathanLetraC();
        DoWhileJonathanLetrasJC dwjc = new DoWhileJonathanLetrasJC();
        fj.imprimirLetraJFor(7, '+');
        fc.imprimirLetraCFor(7, '+');
        fjc.imprimirLetrasJCFor(7, '+');
        wj.imprimirLetraJWhile(7, '+');
        wc.imprimirLetraCWhile(7, '+');
        wjc.imprimirLetrasJCWhile(7, '+');
        dwj.imprimirLetraJDoWhile(7, '+');
        dwc.imprimirLetraCDoWhile(7, '+');
        dwjc.imprimirLetrasJCDoWhile(7, '+');
        System.out.println();

        System.out.println("- Kevin De La Cruz");
        serieFor for_KD = new serieFor();
        whileSerieKD  while_KD = new whileSerieKD();
        doWhileSerieKD doWhile_KD = new doWhileSerieKD();
        for_KD.imprimir_forKevinLetraK(9, '*');
        for_KD.imprimir_forDelaCruzLetraD(9, '*');
        for_KD.imprimir_forKevinDelaCruzLetrasKD(9, 9, '*');
        while_KD.imprimir_whileKevinLetraK(9, '*');
        while_KD.imprimir_whileKevinDelaCruzLetrasKD(9, 9, '*');
        while_KD.imprimir_whileKevinDelaCruzLetrasKD(9, 9, '*');
        doWhile_KD.imprimir_doWhileKevinLetraK(9, '*');
        doWhile_KD.imprimir_doWhileDelaCruzLetraD(9,'*');
        doWhile_KD.imprimir_doWhileKevinDelaCruzLetrasKD(9, 9, '*');
        
        System.out.println();

        System.out.println("- Marcos Cuenca");
        System.out.println("Letras con ciclo For");
        System.out.println();

        forMarcosLetraM imprimirMCicloFor = new forMarcosLetraM();
        imprimirMCicloFor.imprimirMFor('*', 7);
        System.out.println();
        forMarcosLetraC imprimirCCicloFor = new forMarcosLetraC();
        imprimirCCicloFor.imprimirCFor('*', 7);
        System.out.println();
        forMarcosLetraMC imprimirMCCicloFor = new forMarcosLetraMC();
        imprimirMCCicloFor.imprimirMCFor('*', 7);
        System.out.println();

        System.out.println("Letras con ciclo While");
        whileMarcosLetraM imprimirMCicloWhile = new whileMarcosLetraM();
        imprimirMCicloWhile.imprimirMWhile('*', 7);
        System.out.println();
        whileMarcosLetraC imprimirCCicloWhile = new whileMarcosLetraC();
        imprimirCCicloWhile.imprimirCWhile('*', 7);
        System.out.println();
        whileMarcosLetraMC imprimirMCCicloWhile = new whileMarcosLetraMC();
        imprimirMCCicloWhile.imprimirMCWhile('*', 7);
        System.out.println();

        System.out.println("Letras con ciclo Do While");
        doWhileMarcosLetraM imprimirMCicloDoWhile = new doWhileMarcosLetraM();
        imprimirMCicloDoWhile.imprimirMDoWhile('*', 7);
        System.out.println();
        doWhileMarcosLetraC imprimirCCicloDoWhile = new doWhileMarcosLetraC();
        imprimirCCicloDoWhile.imprimirCDoWhile('*', 7);
        System.out.println();
        doWhileMarcosLetraMC imprimirMCCicloDoWhile = new doWhileMarcosLetraMC();
        imprimirMCCicloDoWhile.imprimirMCDoWhile('*', 7);
        System.out.println();

        System.out.println("-------------------Dante Zambrano---------------------");
        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("Ingrese el tamano que desea");
        int tamano = ingresoDatos.nextInt();

        System.out.println("Ingrese el diseno de la letra");
        ingresoDatos.nextLine(); 
        String disenoLetra = ingresoDatos.nextLine();
    
        //Impresiones
        System.out.println("-----------------------------------");
        System.out.println(" ");
        forDanteLetraD fD = new forDanteLetraD();
        fD.forDanteD(tamano, disenoLetra);
        System.out.println(" ");
        System.out.println("-----------------------------------");
        forZambranoLetraZ fZ = new forZambranoLetraZ();
        fZ.forZambranoZ(tamano, disenoLetra);
        System.out.println(" ");
        System.out.println("-----------------------------------");
        forDanteZambranoLetrasDZ fDZ = new forDanteZambranoLetrasDZ();
        fDZ.forDanteZambranoDZ(tamano, disenoLetra);
        System.out.println(" ");
        System.out.println("-----------------------------------");
        whileDanteLetraD wD = new whileDanteLetraD();
        wD.whileDanteD(tamano, disenoLetra); 
        System.out.println(" ");
        System.out.println("-----------------------------------");
        WhileZambranoLetraZ wZ = new WhileZambranoLetraZ();
        wZ.whileZambranoZ(tamano, disenoLetra);
        System.out.println(" ");
        System.out.println("-----------------------------------");
        whileDanteZambranoLetrasDZ1 wDZ = new whileDanteZambranoLetrasDZ1();
        wDZ.whileDanteZambranoDZ(tamano, disenoLetra);
        System.out.println(" ");
        System.out.println("-----------------------------------");
        doWhileDanteLetraD dD = new doWhileDanteLetraD();
        dD.doWhileDanteD (tamano, disenoLetra);
        System.out.println(" ");
        System.out.println("-----------------------------------");
        doWhileZambranoLetraZ1 dZ = new doWhileZambranoLetraZ1();
        dZ.doWhileZambranoZ(tamano, disenoLetra);
        System.out.println(" ");
        System.out.println("-----------------------------------");
        doWhileDanteZambranoLetrasDZ1 dDZ =new doWhileDanteZambranoLetrasDZ1();
        dDZ.doWhileDanteZambranoDZ(tamano, disenoLetra);
        forCarlosC fcaC = new forCarlosC();
        forFuentesF ff = new forFuentesF();
        forCarlosFuentesCF fr = new forCarlosFuentesCF();
        whileCarlosC fp = new whileCarlosC();
        whileFuentesF fd = new whileFuentesF();
        whileCarlosFuentesCF fw = new whileCarlosFuentesCF();
        doWhileCarlosC dn = new doWhileCarlosC();
        doWhileApellidoF da = new doWhileApellidoF();
        doWhileCarlosFuentesCF di = new doWhileCarlosFuentesCF();
        fcaC.inicial();
        ff.apellido(args);
        fr.iniciales(args);
        fp.inicialWhile(args); 
        fd.apellidoWhile(args);
        fw.inicialesWhile(args);
        dn.inicialDoWhile(args);
        da.apellidoDoWhile(args);
        di.inicialesDoWhile(args);
    }
}
