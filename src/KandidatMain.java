public class KandidatMain {
    public static void main(String[] args) {
        System.out.println("Kandidat pertama");
        Kandidat kandidat1 = new Kandidat();
        
        System.out.println("Kandidat kedua");
        Kandidat kandidat2 = new Kandidat();
        kandidat1.bandingkan(kandidat2);
    } 
}
