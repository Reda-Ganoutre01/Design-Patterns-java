public class AdaptateurSamSaoule implements IChargeable {
    private PortableSamSaoule telephone;

    public AdaptateurSamSaoule(PortableSamSaoule telephone) {
        this.telephone = telephone;
    }

    @Override
    public void recharger(int voltage) {
        telephone.chargerPortable(voltage);
    }
}
