public class Main {
    static void application(Fabrique f){
        Voiture v=f.createVoiture();
        Camionnette c=f.createCamionnette();
        System.out.println(v);
        System.out.println(c);
    }
    public static void main(String[] args) {

        FabriqueItalienne fi=new FabriqueItalienne();
        application(fi);

        FabriqueFrancaise fr=new FabriqueFrancaise();
        application(fr);
    }
}