
import java.util.Scanner;

public class Kandidat {

    String nama;
    int attitude, penampilan, suara;
    Scanner msk = new Scanner(System.in);

    public Kandidat() {
        System.out.print("Input Nama\t: ");
        nama = msk.nextLine();
        System.out.print("Input Nilai Attitude\t: ");
        attitude = msk.nextInt();
        System.out.print("Input Nilai Penampilan\t: ");
        penampilan = msk.nextInt();
        System.out.print("Input Nilai Suara\t: ");
        suara = msk.nextInt();
        System.out.println("---------------------------------------");
    }

    void Bandingkan(Kandidat pertama) {
        int selisih = pertama.attitude - attitude;
        if (attitude == pertama.attitude) {
            System.out.println("Attitude \t: " + pertama.nama + " dan " + nama + " memiliki poin sama");
        } else if (attitude < pertama.attitude) {
            System.out.println("Attitude \t: " + pertama.nama + " Lebih Unggul " + selisih + " poin");
        } else {
            System.out.println("Attitude \t: " + nama + " Lebih Unggul " + Math.abs(selisih) + " poin");
        }

        int selisih2 = pertama.penampilan - penampilan;
        if (penampilan == pertama.penampilan) {
            System.out.println("Penampilan \t: " + pertama.nama + " dan " + nama + " memiliki poin sama");
        } else if (penampilan < pertama.penampilan) {
            System.out.println("Penampilan \t: " + pertama.nama + " Lebih Unggul " + selisih2 + " poin");
        } else {
            System.out.println("Penampilan \t: " + nama + " Lebih Unggul " + Math.abs(selisih2) + " poin");
        }

        int selisih3 = pertama.suara - suara;
        if (suara == pertama.suara) {
            System.out.println("Suara \t\t: " + pertama.nama + " dan " + nama + " memiliki poin sama");
        } else if (suara < pertama.suara) {
            System.out.println("Suara \t\t: " + pertama.nama + " Lebih Unggul " + selisih3 + " poin");
        } else {
            System.out.println("Suara \t\t: " + nama + " Lebih Unggul " + Math.abs(selisih3) + " poin");
        }
        System.out.println("---------------------------------------");

        int jml1 = (pertama.attitude + pertama.penampilan + pertama.suara);
        int jml2 = (attitude + penampilan + suara);
        int selisih4 = (pertama.attitude + pertama.penampilan + pertama.suara) - (attitude + penampilan + suara);
        if (jml1 == jml2) {
            System.out.println("Kedua kandidat memiliki poin yang sama");
        } else if (jml2 < jml1) {
            System.out.println("Hasil Perbandingan : " + pertama.nama + " Lebih Unggul " + selisih4 + " poin");
        } else {
            System.out.println("Hasil Perbandingan : " + nama + " Lebih Unggul " + Math.abs(selisih4) + " poin");
        }
        System.out.println("---------------------------------------");

        System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin");
    }
}
