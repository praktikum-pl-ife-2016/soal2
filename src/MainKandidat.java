
public class MainKandidat {
    public static void main(String[] args) {
        Kandidat k1 = new Kandidat();
        k1.setNama("Steven Gerrard");
        k1.setSikap(90);
        k1.setPenampilan(90);
        k1.setVoice(90);
        Kandidat k2 = new Kandidat();
        k2.setNama("John Terry");
        k2.setSikap(80);
        k2.setPenampilan(78);
        k2.setVoice(80);
        Kandidat.bandingkan(k1, k2);
        
    }
    
}
