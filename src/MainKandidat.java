import java.util.Scanner;
public class MainKandidat {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String nama1, nama2;
       int atitude1, penampilan1, suara1, atitude2, penampilan2, suara2;
       System.out.print("Nama : ");
       nama1 = in.next();
       System.out.print("Nilai Penampilan : ");
       penampilan1 = in.nextInt();
       System.out.print("Nilai Atitude : ");
       atitude1 = in.nextInt();
       System.out.print("Nilai Suara : ");
       suara1 = in.nextInt();
       System.out.println("-----------------------------");
       Kandidat K1 = new Kandidat();
       K1.setNama(nama1);
       K1.setAttitude(atitude1);
       K1.setPenampilan(penampilan1);
       K1.setSuara(suara1);
       System.out.print("Nama : ");
         nama2 = in.next();
         System.out.print("Nilai Penampilan : ");
         penampilan2 = in.nextInt();
         System.out.print("Nilai Atitude : ");
         atitude2 = in.nextInt();
         System.out.print("Nilai Suara : ");
         suara2 = in.nextInt();
       Kandidat K2 = new Kandidat();
       K2.setNama(nama2);
       K2.setAttitude(atitude2);
       K2.setPenampilan(penampilan2);
       K2.setSuara(suara2);
       K1.banding(K2);
       
       
}}
