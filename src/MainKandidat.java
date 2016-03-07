public class MainKandidat {
    
    public static void main(String[] args) {
        Kandidat idol1 = new Kandidat();
        idol1.setNama("Dr. I. Ball");
        idol1.setAttitude(0);
        idol1.setTampil(40);
        idol1.setSuara(20);
        Kandidat idol2 = new Kandidat();
        idol2.setNama("Angela Gossow");
        idol2.setAttitude(60);
        idol2.setTampil(85);
        idol2.setSuara(100);
        Kandidat.bandingkan(idol1, idol2);
    }
}