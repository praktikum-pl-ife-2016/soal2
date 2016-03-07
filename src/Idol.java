

public class Idol {

    String nama, juara;
    int poinAt, poinPen, poinSu, jumlah, selisihAt, selisihPen, selisihSu, selisihJumlah;

    Idol() {
    }

    Idol(String a, int b, int c, int d) {
        nama = a;
        poinAt = b;
        poinPen = c;
        poinSu = d;
        jumlah = b + c + d;
    }

    public void selisih(Idol a, Idol b) {
        String nama1 = a.nama, nama2 = a.nama, nama3 = a.nama, nama4 = a.nama;
        int selisihAt = a.poinAt - b.poinAt;
        int selisihPen = a.poinPen - b.poinPen;
        int selisihSu = a.poinSu - b.poinSu;
        int selisihJumlah = a.jumlah - b.jumlah;

        if (b.poinAt > a.poinAt) {
            nama1 = b.nama;
            selisihAt = b.poinAt - a.poinAt;
        }
        if (b.poinPen > a.poinPen) {
            nama2 = b.nama;
            selisihPen = b.poinPen - a.poinPen;
        }
        if (b.poinSu > a.poinSu) {
            nama3 = b.nama;
            selisihSu = b.poinSu - a.poinSu;
        }
        if (b.jumlah > a.jumlah) {
            nama4 = b.nama;
            selisihJumlah = b.jumlah - a.jumlah;
        }

        System.out.println("Perbandingan Poin antara " + a.nama + " dan " + b.nama);
        System.out.println("======================================");
        System.out.println("Attitude : " + nama1 + " lebih tinggi " + selisihAt + " poin");
        System.out.println("Penampilan : " + nama2 + " lebih tinggi " + selisihPen + " poin");
        System.out.println("Suara : " + nama3 + " lebih tinggi " + selisihSu + " poin");
        System.out.println("======================================");
        System.out.println("Hasil Perbandingan : " + nama4 + " lebih unggul " + selisihJumlah + " poin");
        System.out.println("'Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin'");
    }

}
