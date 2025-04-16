public class FabriqueFrancaise extends  Fabrique{
    @Override
    public  Voiture createVoiture(){
        return new Kangoo();
    };
    @Override
    public  Camionnette createCamionnette(){
        return  new Trafic();
    }
}
