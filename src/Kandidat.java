public class Kandidat {
    String nama;
    int attitude;
    int penampilan;
    int suara;
    int total;
    public Kandidat() {
        this.nama = "Sonia";
        this.attitude = 85;
        this.penampilan = 90;
        this.suara = 80;
        total = attitude + penampilan + suara;
    }
    public Kandidat(String n, int a, int p, int s) {
        this.nama = n;
        this.attitude = a;
        this.penampilan = p;
        this.suara = s;
        total = attitude + penampilan + suara;
    }
    public void bandingkan(Kandidat k2) {
        System.out.println("Perbandingan antara " + nama + " dan " + k2.nama + " : ");
        if (attitude > k2.attitude) {
            System.out.println(nama + " lebih tinggi " + (attitude - k2.attitude) + " poin ");
        } else {
            System.out.println(k2.nama + " lebih tinggi " + (k2.attitude - attitude) + " poin ");
        }
        if (penampilan > k2.penampilan) {
            System.out.println(nama + " lebih tinggi " + (penampilan - k2.penampilan) + " poin ");
        } else {
            System.out.println(k2.nama + " lebih tinggi " + (k2.penampilan - penampilan) + " poin ");
        }
        if (suara > k2.suara) {
            System.out.println(nama + " lebih tinggi " + (suara - k2.suara) + " poin ");
        } else {
            System.out.println(k2.nama + " lebih tinggi " + (k2.suara - suara) + " poin ");
        }
        if (total > k2.total) {
            System.out.println("Hasil Perbandingan : " + nama + " lebih unggul " + (total - k2.total) + " poin ");
        } else {
            System.out.println("Hasil Perbandingan : " + k2.nama + " lebih unggul " + (k2.total - total) + " poin ");
        }
        System.out.println("Hasil Perbandingan adalah berdasarkan jumlah keseluruhan poin");
    }
}