public class FabriqueItalienne extends Fabrique{
    @Override
    public  Voiture createVoiture(){
        return new CinqueCento();
    };
    @Override
    public  Camionnette createCamionnette(){
        return  new Ducato();
    }

}
