public class Main {
    //Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.
    public static void main(String[] args) {
        char input = '1';
        check(input);
    }

    public static void check(char a) {
        try {
            Integer.parseInt(String.valueOf(a));
            System.out.println(a + " è un numero");

        } catch (Exception e) {
            System.out.println(a + " non è un numero");
        }
    }
}