

public class Main {
    public static void main(String[] args) {
        Charger charger = new Charger();

        PortableDeTest testPhone = new PortableDeTest();
        charger.brancherPortable(testPhone);


        PortableSamSaoule samPhone = new PortableSamSaoule();
        AdaptateurSamSaoule adapterSam = new AdaptateurSamSaoule(samPhone);
        charger.brancherPortable(adapterSam);


        PortableSonneEricSonne sonnePhone = new PortableSonneEricSonne();
        AdaptateurSonneEricSonne adapterSonne = new AdaptateurSonneEricSonne(sonnePhone);
        charger.brancherPortable(adapterSonne);
    }
}
