
public class Charger {
    private IChargeable telephone;
    private final int voltage = 10; // Readonly

    public void brancherPortable(IChargeable telephone) {
        this.telephone = telephone;
        telephone.recharger(voltage);
    }
}
