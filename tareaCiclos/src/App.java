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
    }
}
