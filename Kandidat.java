/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author efriza
 */
public class Kandidat {

    String nama;
    int atitude, penampilan, suara;

    Kandidat(String n, int a, int p, int s) {
        this.nama = n;
        this.atitude = a;
        this.penampilan = p;
        this.suara = s;
    }
    public static void Bandingkan(Kandidat kan1, Kandidat kan2) {
        int a1, p1, s1;
        String a2, p2, s2;
        System.out.println("Perbandingan poin antara " + kan1.nama + " dan " + kan2.nama);
        a2 = (kan1.atitude < kan2.atitude) ? kan2.nama : kan1.nama;
        a1 = (kan1.atitude < kan2.atitude) ? (kan2.atitude - kan1.atitude) : (kan1.atitude - kan2.atitude);
        System.out.println("Attitude : " + a2 + " lebih tinggi " + a1 + " poin");
        p2 = (kan1.penampilan < kan2.penampilan) ? kan2.nama : kan1.nama;
        p1 = (kan1.penampilan < kan2.penampilan) ? (kan2.penampilan - kan1.penampilan) : (kan1.penampilan - kan2.penampilan);
        System.out.println("Penampilan : " + p2 + " lebih tinggi " + p1 + " poin");
        s2 = (kan1.suara < kan2.suara) ? kan2.nama : kan1.nama;
        s1 = (kan1.suara < kan2.suara) ? (kan2.suara - kan1.suara) : (kan1.suara - kan2.suara);
        System.out.println("Suara : " + kan2.nama + " lebih tinggi " + s1 + " poin");
        System.out.println("=============================================================");
        int total1 = kan1.atitude + kan1.penampilan + kan1.suara;
        int total2 = kan2.atitude + kan2.penampilan + kan2.suara;
        String total = (total1<total2)?kan2.nama:kan1.nama;
        int tot =(total1<total2)?total2-total1:total1-total2;
        System.out.println("Hasil Perbandingan : " + total + " lebih unggul " + tot);
        System.out.println("Hasil perbandingan adalah berdasarkan keseluruhan poin");
    }
}
