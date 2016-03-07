import java.util.Scanner;

public class mainIdol {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
        //instan object menggunakan A
        Idol A = new Idol();
        //inputan pertama
        System.out.print("Masukkan nama\t\t: ");
        String nama = input.nextLine();
        System.out.print("Masukan poin attitude\t: ");
        int attitude = in.nextInt();
        System.out.print("Masukan poin penampilan\t: ");
        int penampilan =   in.nextInt();
        System.out.print("Masukan poin suara\t: ");
        int suara = in.nextInt();
        System.out.println("========================================================================");
        //instan object menggunakan A
        A.setNama(nama);
        A.setAttitude(attitude);
        A.setPenampilan(penampilan);
        A.setSuara(suara);
        // instan object menggunakan B
        Idol B = new Idol();
        //inputan kedua
        System.out.print("Masukkan nama\t\t: ");
        String nama2 = input.nextLine();
        System.out.print("Masukan poin attitude\t: ");
        int attitude2 = in.nextInt();
        System.out.print("Masukan poin penampilan\t: ");
        int penampilan2 =   in.nextInt();
        System.out.print("Masukan poin suara\t: ");
        int suara2 = in.nextInt();
        System.out.println("========================================================================");
        //instan object menggunakan B 
        B.setNama(nama2);
        B.setAttitude(attitude2);
        B.setPenampilan(penampilan2);
        B.setSuara(suara2);
        //perbandingan A dan B
        Idol.bandingkan(A,B);
}
}