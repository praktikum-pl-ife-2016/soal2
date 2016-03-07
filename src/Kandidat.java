
import java.util.Scanner;

public class Kandidat {

    private String nama;
    private int attitude;
    private int penampilan;
    private int suara;

    public Kandidat() { // default method
        nama = "";
        attitude = 0;
        penampilan = 0;
        suara = 0;

    }

    public Kandidat(String n, int a, int p, int s) { // konstruktor yang berparameter n,a,p, dan s

        this.nama = n;
        this.attitude = a;
        this.penampilan = p;
        this.suara = s;

    }

    public void bandingkan(Kandidat m) { // Method untuk mengecek parameter objek yang digunakan untuk membandingkan masing - masing atribut kandidat
        System.out.println("Perbandingan Poin antara " + m.nama + " dan " + nama);
        if (m.attitude > attitude) {
            System.out.println("Attitude : " + m.nama + " lebih tinggi " + (m.attitude - attitude) + " poin");
        } else {
            System.out.println("Attitude : " + nama + " lebih tinggi " + (attitude - m.attitude) + " poin");
        }
        if (m.penampilan > penampilan) {
            System.out.println("Penampilan : " + m.nama + " lebih tinggi " + (m.penampilan - penampilan) + " poin");
        } else {
            System.out.println("Penampilan : " + nama + " lebih tinggi " + (penampilan - m.penampilan) + " poin");

        }
        if (m.suara > suara) {
            System.out.println("Suara : " + m.nama + " lebih tinggi " + (m.suara - suara) + " poin");
        } else {
            System.out.println("Suara : " + nama + " lebih tinggi " + (suara - m.suara) + " poin");
        }

        System.out.println("=========================================");

        int total = m.attitude + m.penampilan + m.suara;
        int total1 = attitude + penampilan + suara;
        if (total > total1) {
            int selisih = total - total1;
            System.out.println("Hasil Perbandingan : " + m.nama + " lebih unggul " + selisih + "poin");

        } else {
            int selisih = total1 - total;
            System.out.println("Hasil Perbandingan : " + nama + " lebih unggul " + selisih + " poin");
        }
        System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin");
    }
}
