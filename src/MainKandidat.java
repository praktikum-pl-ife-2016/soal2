public class MainKandidat {
    
    public static void main(String[] args) {
        Kandidat orang1 = new Kandidat();
        orang1.setNama("Lindsay Charles");
        orang1.setAttitude(75);
        orang1.setPenampilan(70);
        orang1.setSuara(80);
        Kandidat orang2 = new Kandidat();
        orang2.setNama("Anna Whiteside");
        orang2.setAttitude(85);
        orang2.setPenampilan(80);
        orang2.setSuara(85);
        Kandidat.perbandingan(orang1, orang2);
    }
}