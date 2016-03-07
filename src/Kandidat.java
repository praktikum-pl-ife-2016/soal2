
public class Kandidat {

    public String nama;
    public int attitude;
    public int penampilan;
    public int suara;
    public int total = 0;

    public void setNama(String s) {
        nama = s;
    }

    public void setAtt(int i) {
        attitude = i;
        total += i;
    }

    public void setTampil(int i) {
        penampilan = i;
        total += i;
    }

    public void setSuara(int i) {
        suara = i;
        total += i;
    }

    public Kandidat() {
        this.nama = nama;
        this.attitude = attitude;
        this.penampilan = penampilan;
        this.suara = suara;
        this.total = total;
    }

    public static void bandingkan(Kandidat k1, Kandidat k2) {
        System.out.println("Perbandingan poin antara " + k1.nama + " dan " + k2.nama + " :");
        if (k1.attitude > k2.attitude) {
            System.out.println("Attitude : " + k1.nama + " lebih tinggi " + (k1.attitude - k2.attitude) + " poin.");
        } else {
            System.out.println("Attitude : " + k2.nama + " lebih tinggi " + (k2.attitude - k1.attitude) + " poin.");
        }
        if (k1.penampilan > k2.penampilan) {
            System.out.println("Penampilan : " + k1.nama + " lebih tinggi " + (k1.penampilan - k2.penampilan) + " poin.");
        } else {
            System.out.println("Penampilan : " + k2.nama + " lebih tinggi " + (k2.penampilan - k1.penampilan) + " poin.");
        }
        if (k1.suara > k1.suara) {
            System.out.println("Suara : " + k1.nama + " lebih tinggi " + (k1.suara - k2.suara) + " poin.");
        } else {
            System.out.println("Suara : " + k2.nama + " lebih tinggi " + (k2.suara - k1.suara) + " poin.");
        }
        System.out.println("====================================================");
        if (k1.total > k2.total) {
            System.out.println("Hasil perbandingan : " + k1.nama + " lebih unggul " + (k1.total - k2.total) + " poin.");
        } else {
            System.out.println("Hasil perbangingan : " + k2.nama + " lebih unggul " + (k2.total - k1.total) + " poin.");
        }
        System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin.");
    }
}
