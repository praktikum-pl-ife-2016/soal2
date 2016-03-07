

import java.util.Scanner;

public class MainIdol {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Idol orang = new Idol();
        System.out.println("Masukan inputan sesuai aturan");
        System.out.println("Nama (spasi) Poin Attitude (spasi) Poin Penampilan (spasi) Poin Suara");
        System.out.println("Data orang ke-1 : ");
        Idol orang1 = new Idol(input.next(), input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println("Data orang ke-2 :");
        Idol orang2 = new Idol(input.next(), input.nextInt(), input.nextInt(), input.nextInt());

        orang.selisih(orang1, orang2);

    }
}
