    abstract class Voiture {
        public abstract String getMarque();
        public String toString(){
            return getMarque();
        }
        public  static Voiture createVoiture(String origine){
            if (origine.equals("fr")) return new Renault();
            if (origine.equals("it")) return new Fiat();
            return  null ;
        }
    }
