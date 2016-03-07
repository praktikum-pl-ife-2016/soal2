package kandidat;

import java.util.Scanner;
public class MainKandidat {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    String nama;
    int atitude, penampilan, suara;
    
    System.out.print("Masukkan Nama Peserta 1: ");
    nama = input.nextLine();
    System.out.print("Masukkan Poin Atitude Peserta 1: ");
    atitude = input2.nextInt();
    System.out.print("Masukkan Poin Penampilan Peserta 1: ");
    penampilan = input2.nextInt();
    System.out.print("Masukkan Poin Suara Peserta 1: ");
    suara = input2.nextInt();
    Kandidat peserta1 = new Kandidat(nama, atitude, penampilan, suara);
    
    System.out.println("----------------------------------------------");
    System.out.print("Masukkan Nama Peserta 2: ");
    nama = input.nextLine();
    System.out.print("Masukkan Poin Atitude Peserta 2: ");
    atitude = input2.nextInt();
    System.out.print("Masukkan Poin Penampilan Peserta 2: ");
    penampilan = input2.nextInt();
    System.out.print("Masukkan Poin Suara Peserta 2: ");
    suara = input2.nextInt();
    Kandidat peserta2 = new Kandidat(nama, atitude, penampilan, suara);
    System.out.println("----------------------------------------------");
    
    peserta2.bandingkan(peserta1);
    }
}
