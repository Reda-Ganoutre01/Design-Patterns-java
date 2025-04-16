
public class PortableDeTest implements IChargeable {
    @Override
    public void recharger(int voltage) {
        System.out.println("PortableDeTest is charging with " + voltage + " volts.");
    }
}
