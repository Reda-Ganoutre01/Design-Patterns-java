public class Main {
    static void f(Voiture v){

        System.out.println("Voiture "+ v);
    }
    public static void main(String[] args) {

        Voiture v=Voiture.createVoiture("fr");
        f(v);
    }
}