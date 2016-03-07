package mainkandidat;
/**
 *
 * @author Imam
 */
public class Kandidat {

    String nama;
    int attitude, penampilan, suara;

    Kandidat() {
    }

    Kandidat(String a, int b, int c, int d) {
        nama = a;
        attitude = b;
        penampilan = c;
        suara = d;
    }

    public void bandingkan(Kandidat A) {
        Kandidat dataCalon = new Kandidat("Xenovia", 7, 9, 5);
        Kandidat dataCalon2 = new Kandidat("Marsacanita", 4, 7, 9);
        int jumlahBanding1 = dataCalon.attitude + dataCalon.penampilan + dataCalon.suara;
        int jumlahBanding2 = dataCalon2.attitude + dataCalon2.penampilan + dataCalon2.suara;
        if (dataCalon.attitude > dataCalon2.attitude) {
            System.out.println("Attitude    : " + dataCalon.nama + " lebih tinggi " + (dataCalon.attitude - dataCalon2.attitude) + " poin");
        } else {
            System.out.println("Attitude    : " + dataCalon2.nama + " lebih tinggi " + (dataCalon2.attitude - dataCalon.attitude) + " poin");
        }

        if (dataCalon.penampilan > dataCalon2.penampilan) {
            System.out.println("Penampilan : " + dataCalon.nama + " lebih tinggi " + (dataCalon.penampilan - dataCalon2.penampilan) + " poin");
        } else {
            System.out.println("Penampilan : " + dataCalon2.nama + " lebih tinggi " + (dataCalon2.penampilan - dataCalon.penampilan) + " poin");
        }

        if (dataCalon.suara > dataCalon2.suara) {
            System.out.println("Suara      : " + dataCalon.nama + " lebih tinggi " + (dataCalon.suara - dataCalon2.suara) + " poin");
        } else {
            System.out.println("Suara      : " + dataCalon2.nama + " lebih tinggi " + (dataCalon2.suara - dataCalon.suara) + " poin");
        }

        String hasilBanding = (jumlahBanding1 > jumlahBanding2) ? dataCalon.nama + " lebih unggul " + (jumlahBanding1 - jumlahBanding2) + " poin"
                : dataCalon2.nama + " lebih unggul " + (jumlahBanding2 - jumlahBanding1) + " poin";

        System.out.println("Perbandingan Poin antara " + dataCalon.nama + " dan " + dataCalon2.nama + " :");
        System.out.println("==================================================");
        System.out.println("Hasil perbandingan : " + hasilBanding);
        System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin");

    }

}
