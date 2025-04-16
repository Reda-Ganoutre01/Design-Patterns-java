public class Main {
    static void f(Voiture v){

        System.out.println("Voiture "+ v);
    }
    public static void main(String[] args) {

        Voiture renau=new Renault();
        Voiture fiat=new Fiat();
        f(renau);
        f(fiat);
    }
}