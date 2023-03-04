public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        char[] letras = { 'A', 'B', 'C' };
        System.out.println(letras);
        String letras2 = String.copyValueOf(letras);
        System.out.println(letras2);
    }
}
