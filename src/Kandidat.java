import java.util.Scanner;
public class Kandidat {
    String nama;
    int attitude=0,penampilan=0,suara=0;
    Scanner in = new Scanner (System.in);
    //konstruktor yang berisi atribut nama, attitude, penampilan, dan suara
    public Kandidat(){
        System.out.println("====================================================");
        System.out.print("Nama       : ");
        nama = in.nextLine();
        System.out.print("Attitude   : ");
        attitude = in.nextInt();
        System.out.print("Penampilan : ");
        penampilan = in.nextInt();
        System.out.print("Suara      : ");
        suara = in.nextInt();
        System.out.println("");
    }
    
    //Method untuk menerima parameter berupa objek Kandidat yang berguna untuk membandingkan tiap-tiap atribut yang dimiliki oleh kedua objek
    public void bandingkan(Kandidat n){
        System.out.println("Perbandingan Poin antara "+nama + " dan "+n.nama+ " ");
        
        
        //membandingkan poin attitude
        int selisihAt = n.attitude-attitude;
        if(n.attitude>attitude)
            System.out.println("Attitude   : "+n.nama+" lebih tinggi "+ selisihAt+" poin");
        else if(n.attitude==attitude)
            System.out.println("Attitude   : Kedua kandidat memiliki poin yang sama");
        else
            System.out.println("Attitude   : "+ nama+" lebih tinggi "+ Math.abs(selisihAt)+" poin");
        
        //membandingkan poin penampilan
        int selisihPen = n.penampilan-penampilan;
        if(n.penampilan>penampilan)
            System.out.println("Penampilan : "+n.nama+" lebih tinggi "+ selisihPen+" poin");
        else if(n.penampilan==penampilan)
            System.out.println("Penampilan : Kedua kandidat memiliki poin yang sama");
        else
            System.out.println("Penampilan : "+nama+" lebih tinggi "+ Math.abs(selisihPen)+" poin");
        
        //membandingkan poin suara
        int selisihSua = n.suara-suara;
        if(n.suara>suara)
            System.out.println("Suara      : " + n.nama+" lebih tinggi "+ selisihSua+" poin");
        else if(n.suara==suara)
            System.out.println("Suara      : Kedua kandidat memiliki poin yang sama");
        else
            System.out.println("Suara      : " + nama+" lebih tinggi "+ Math.abs(selisihSua)+" poin");
        System.out.println("====================================================");
        
        //mencari jumlah poin terbesar kandidat
        int total1= n.attitude+n.penampilan+n.suara;
        int total2 = attitude+penampilan+suara;
        int selisihTot=total1 - total2;
        if(total1>total2)
            System.out.println("Hasil Perbandingan : "+ n.nama+ " lebih unggul "+" selisih "+ selisihTot+" poin");
        else if(total1==total2)
            System.out.println("Hasil Perbandingan : Kedua kandidat memiliki jumlah poin yang sama yaitu "+total1);
        else
            System.out.println("Hasil Perbandingan : "+ nama+ " lebih unggul "+" selisih "+ Math.abs(selisihTot)+ " poin");
        System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin");
    }

}
