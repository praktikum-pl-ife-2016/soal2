
import java.util.Scanner;

public class Peserta {

    String nama;
    int attitude, penampilan, suara;
    Scanner msk = new Scanner(System.in);

    public Peserta() {
        System.out.print("Input Nama\t\t: ");
        nama = msk.nextLine();
        System.out.print("Input Nilai Attitude\t: ");
        attitude = msk.nextInt();
        System.out.print("Input Nilai Penampilan\t: ");
        penampilan = msk.nextInt();
        System.out.print("Input Nilai Suara\t: ");
        suara = msk.nextInt();
        System.out.println("====================================");
    }
    void Perbandingan(Peserta pertama) {
        System.out.println("Perbandingan nilai antara dua peserta :");
        int selAtt = pertama.attitude - attitude;
        if (attitude == pertama.attitude) {
            System.out.println("Attitude \t\t: kedua peserta memiliki poin sama");
        } else if (attitude < pertama.attitude) {
            System.out.println("Attitude \t\t: "+pertama.nama+" lebih unggul " + selAtt + " poin");
        } else {
            System.out.println("Attitude \t\t: "+nama+" lebih unggul " + Math.abs(selAtt) + " poin");
        }
        int selPen = pertama.penampilan - penampilan;
        if (penampilan == pertama.penampilan) {
            System.out.println("Penampilan \t\t: kedua peserta memiliki poin sama");
        } else if (penampilan < pertama.penampilan) {
            System.out.println("Penampilan \t\t: "+pertama.nama+" lebih unggul " + selPen + " poin");
        } else {
            System.out.println("Penampilan \t\t: "+nama+" lebih unggul " + Math.abs(selPen) + " poin");
        }
        int selSur = pertama.suara - suara;
        if (suara == pertama.suara) {
            System.out.println("Suara \t\t\t: kedua peserta memiliki poin sama");
        } else if (suara < pertama.suara) {
            System.out.println("Suara \t\t\t: "+pertama.nama+" lebih unggul " + selSur + " poin");
        } else {
            System.out.println("Suara \t\t\t: "+nama+" lebih unggul " + Math.abs(selSur) + " poin");
        }
        System.out.println("------------------------------------");
        int jml1 = (pertama.attitude + pertama.penampilan + pertama.suara);
        int jml2 = (attitude + penampilan + suara);
        int selisih4 = (pertama.attitude + pertama.penampilan + pertama.suara) - (attitude + penampilan + suara);
        if (jml1 == jml2) {
            System.out.println("Kedua kandidat memiliki poin yang sama.");
        } else if (jml2 < jml1) {
            System.out.println("Hasil Perbandingan \t: " + pertama.nama + " Lebih unggul " + selisih4 + " poin.");
        } else {
            System.out.println("Hasil Perbandingan \t: " + nama + " Lebih unggul " + Math.abs(selisih4) + " poin.");
        }
        System.out.println("====================================");

        System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin.");
    }
}
