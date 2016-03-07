package soal_2;

public class Kandidat {

    private String nama;
    private int attitude, penampilan, suara;

    Kandidat(String a, int b, int c, int d) {
        nama = a;
        attitude = b;
        penampilan = c;
        suara = d;
    }

    Kandidat() {
    }

    public void bandingkan() {
        Kandidat dataIdol = new Kandidat("Idol1", 6, 6, 6);
        Kandidat dataIdol2 = new Kandidat("Idol2", 8, 8, 8);
        int jumlahBanding1 = dataIdol.attitude + dataIdol.penampilan + dataIdol.suara;
        int jumlahBanding2 = dataIdol2.attitude + dataIdol2.penampilan + dataIdol2.suara;
        System.out.println("Perbandingan Poin antara " + dataIdol.nama + " dan " + dataIdol2.nama + " :");
        if (dataIdol.attitude > dataIdol2.attitude) {
            String perbandinganIdol = dataIdol.nama + " lebih tinggi " + (dataIdol.attitude - dataIdol2.attitude) + " poin";
            System.out.println("Attitude    : " + perbandinganIdol);
        } else {
            String perbandinganIdol = dataIdol2.nama + " lebih tinggi " + (dataIdol2.attitude - dataIdol.attitude) + " poin";
            System.out.println("Attitude    : " + perbandinganIdol);
        }
        if (dataIdol.penampilan > dataIdol2.penampilan) {
            String perbandingIdol2 = dataIdol.nama + " lebih tinggi " + (dataIdol.penampilan - dataIdol2.penampilan) + " poin";
            System.out.println("Penampilan : " + perbandingIdol2);
        } else {
            String perbandingIdol2 = dataIdol2.nama + " lebih tinggi " + (dataIdol2.penampilan - dataIdol.penampilan) + " poin";
            System.out.println("Penampilan : " + perbandingIdol2);
        }
        if (dataIdol.suara > dataIdol2.suara) {
            String perbandingIdol3 = dataIdol.nama + " lebih tinggi " + (dataIdol.suara - dataIdol2.suara) + " poin";
            System.out.println("Suara      : " + perbandingIdol3);
        } else {
            String perbandingIdol3 = dataIdol2.nama + " lebih tinggi " + (dataIdol2.suara - dataIdol.suara) + " poin";
            System.out.println("Suara      : " + perbandingIdol3);
        }
        System.out.println("==================================================");
        if (jumlahBanding1 > jumlahBanding2) {
            String hasilPerbandingan = dataIdol.nama + " lebih unggul " + (jumlahBanding1 - jumlahBanding2) + " poin";
            System.out.println("Hasil perbandingan : " + hasilPerbandingan);
        } else {
            String hasilPerbandingan = dataIdol2.nama + " lebih unggul " + (jumlahBanding2 - jumlahBanding1) + " poin";
            System.out.println("Hasil perbandingan : " + hasilPerbandingan);
        }
        System.out.println("Hasil perbandingan adalah berdarkan jumlah keseluruhan poin");
    }
}
