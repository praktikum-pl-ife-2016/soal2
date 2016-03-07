
public class KandidatDemo {
    public static void main(String[] args){
        Kandidat pertama = new Kandidat("Yuri", 70, 80, 70);
        Kandidat kedua = new Kandidat("Frost", 80, 90, 70);
        Kandidat.bandingkan(pertama, kedua);
    }
}
