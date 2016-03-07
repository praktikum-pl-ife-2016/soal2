import java.util.Scanner;
public class Kandidat {

    public String nama;
    public int atitude;
    public int penampilan;
    public int suara;
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);

    public Kandidat() { // konstruktor untuk nama,atitude,penampilan,suara
        System.out.print("Nama Kandidat : ");
        nama = scan2.nextLine();
        System.out.print("Attitude      : ");
        atitude = scan.nextInt();
        System.out.print("Penampilan    : ");
        penampilan = scan.nextInt();
        System.out.print("Suara         : ");
        suara = scan.nextInt();
    }
    public void bandingkan(Kandidat x) { //method membandingkan seluruh penilaian
        int selisihAtd = atitude - x.atitude;//menghitung selisih nilai attitude
        int selisihPen = penampilan - x.penampilan;//menghitung selisih nilai penampilan
        int selisihSua = suara - x.suara;//menghitung selisih nilai suara
        System.out.println("Perbandingan Poin antara "+ nama+" dan "+ x.nama);
        if (x.atitude < atitude) { 
            System.out.println("Attitude " + nama + " Lebih tinggi " + selisihAtd + " Poin ");
        } else if (x.atitude == atitude) {
            System.out.println("Attitude " + nama + " dan " + x.nama + " Seri ");
        } else {
            System.out.println("Attitude " + x.nama + " Lebih tinggi " + Math.abs(selisihAtd) + " Poin ");
        }
        if (x.penampilan < penampilan) {
            System.out.println("Penampilan " + nama + " Lebih tinggi " + selisihPen + " Poin ");
        } else if (x.penampilan == penampilan) {
            System.out.println("Penampilan " + nama + " dan " + x.nama + " Seri ");
        } else {
            System.out.println("Penampilan " + x.nama + " Lebih tinggi " + Math.abs(selisihPen) + " Poin ");
        }
        if (x.suara < suara) {
            System.out.println("Suara " + nama + " Lebih tinggi " + selisihSua + " Poin ");
        } else if (x.suara == suara) {
            System.out.println("Suara " + nama + " dan " + x.nama + " Seri ");
        } else {
            System.out.println("Suara " + x.nama + " Lebih tinggi " + Math.abs(selisihSua) + " Poin ");
        }
        int nilai2 = x.atitude + x.penampilan + x.suara;////menghitung total nilai2
        int nilai1 = atitude + penampilan + suara; //menghitung total nilai1
        int total = nilai2 - nilai1;//menghitung selisih nilai kedua peserta
        if (nilai2 < nilai1) {
            System.out.println("Hasil Perbandingan " + nama + " Lebih Unggul " + Math.abs(total) + " Poin ");
        } else if (nilai2 == nilai1) {
            System.out.println("Hasil Perbandingan " + nama + " dan " + x.nama + " Seri ");
        } else {
            System.out.println("Hasil Perbandingan " + x.nama + " Lebih Unggul " + (total) + " Poin ");
        }
    }

}
