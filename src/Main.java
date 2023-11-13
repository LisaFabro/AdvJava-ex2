public class Main {
    //Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.
    public static void main(String[] args){
        char input = '&';
        check(input);
    }
    public static void check(char a){
        try{
            if(Character.isDigit(a)){
                System.out.println(a + " è un numero");
            } else {
                throw new Exception();
            };
        }catch (Exception e){
            System.out.println(a + " non è un numero");
        }
    }
}