
public class Main {

    public static void main(String[] args) {
        Kandidat k1 = new Kandidat();
        k1.setNama("Yazawa Nico");
        k1.setAtt(85);
        k1.setTampil(90);
        k1.setSuara(80);
        Kandidat k2 = new Kandidat();
        k2.setNama("Ranko");
        k2.setAtt(80);
        k2.setTampil(95);
        k2.setSuara(90);
        Kandidat.bandingkan(k1, k2);
    }
}
