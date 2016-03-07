public class RunKandidat {
    public static void main(String[] args) {
        Kandidat peserta1 = new Kandidat();
        peserta1.setNama("Rias Gremory");
        peserta1.setAttitude(35);
        peserta1.setTampil(90);
        peserta1.setSuara(60);
        Kandidat peserta2 = new Kandidat();
        peserta2.setNama("Akeno Himejima");
        peserta2.setAttitude(30);
        peserta2.setTampil(90);
        peserta2.setSuara(80);
        Kandidat.bandingkan(peserta1, peserta2);
    }

    
}
    
