import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        
        Kandidat kandidat1 = new Kandidat();
        Kandidat kandidat2 = new Kandidat();
        
        System.out.println("\tSelamat datang di indonesia odol group");
        System.out.println("\n\nSilahkan masukkan Nama dan perolehan poin kandidat");
        System.out.print("\nNama Kandidat 1: ");
        kandidat1.setNama(in2.nextLine());
        System.out.print("Poin Atitude Kandidat 1: ");
        kandidat1.setAtitude(in.nextInt());
        System.out.print("Poin Penampilan Kandidat 1: ");
        kandidat1.setPenampilan(in.nextInt());
        System.out.print("Poin Suara Kandidat 1: ");
        kandidat1.setSuara(in.nextInt());
        
        System.out.print("\nNama Kandidat 2: ");
        kandidat2.setNama(in2.nextLine());
        System.out.print("Poin Atitude Kandidat 2: ");
        kandidat2.setAtitude(in.nextInt());
        System.out.print("Poin Penampilan Kandidat 2: ");
        kandidat2.setPenampilan(in.nextInt());
        System.out.print("Poin Suara Kandidat 2: ");
        kandidat2.setSuara(in.nextInt());
        
        Kandidat.bandingkan(kandidat1, kandidat2);
        
    }
}
