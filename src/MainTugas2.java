import java.util.Scanner;
public class MainTugas2 {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Kandidat 1   ");
        System.out.print("Nama         = ");
        String a = input.nextLine();
        System.out.print("Attitude     = ");
        int a1 = input.nextInt();
        System.out.print("Penampilan   = ");
        int a2 = input.nextInt();
        System.out.print("Suara        = ");
        int a3 = input.nextInt();
        System.out.println("Masukkan Kandidat 2   ");
        System.out.print("Nama         = ");
        String b = in.nextLine();
        System.out.print("Attitude     = ");
        int b1 = in.nextInt();
        System.out.print("Penampilan   = ");
        int b2 = in.nextInt();
        System.out.print("Suara        = ");
        int b3 = in.nextInt();

        
        //instan objek bernama m1
        Tugas2 m1 = new Tugas2();
        m1.setNama(a);
        m1.setAtt(a1);
        m1.setTampil(a2);
        m1.setSuara(a3);
        
        Tugas2 m2 = new Tugas2();
        m2.setNama(b);
        m2.setAtt(b1);
        m2.setTampil(b2);
        m2.setSuara(b3);
        Tugas2.banding(m1, m2);
    }
}