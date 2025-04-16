
public class AdaptateurSonneEricSonne implements IChargeable {
    private PortableSonneEricSonne telephone;

    public AdaptateurSonneEricSonne(PortableSonneEricSonne telephone) {
        this.telephone = telephone;
    }

    @Override
    public void recharger(int voltage) {
        telephone.chargerBatteries(voltage);
    }
}
