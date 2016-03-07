package kandidat;
public class MainKandidat {
    public static void main(String[] args) {
        
        Kandidat k1 = new Kandidat();
        k1.setNama("Dina");
        k1.setAttitude(86);
        k1.setPenampilan(88);
        k1.setSuara(90);
        
        Kandidat k2 = new Kandidat();
        k2.setNama("Ellie");
        k2.setAttitude(82);
        k2.setPenampilan(90);
        k2.setSuara(94);
        
        Kandidat.banding(k1, k2);
    }
}
