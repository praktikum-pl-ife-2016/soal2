import java.util.Scanner;

public class Kandidat {
    String nama;
    int atitude, penampilan, suara;
    Scanner in = new Scanner(System.in);
    //membuat constructor yang berisi nama, atitude, penampilan, suara
    public Kandidat(){
        System.out.print("Masukkan nama : ");
        nama = in.nextLine();
        System.out.print("Masukkan nilai atitude (1-5): ");
        atitude = in.nextInt();
        System.out.print("Masukkan nilai penampilan (1-5): ");
        penampilan = in.nextInt();
        System.out.print("Masukkan nilai suara (1-5): ");
        suara = in.nextInt();
        System.out.println("===========================================================");
    }
    //membuat method berisi parameter a yang berfungsi membandingkan 
    void Bandingkan(Kandidat a){
        //membandingkan poin atitude dari kedua kandidat
        int selisih = a.atitude-atitude;
        if(atitude == a.atitude)
            System.out.println("Atitude \t: "+a.nama+" dan "+nama+" memiliki poin sama");
        else if(atitude < a.atitude)
            System.out.println("Atitude \t: "+a.nama+" Lebih tinggi "+selisih+" poin");
        else
            System.out.println("Atitude \t: "+nama+" Lebih tinggi "+Math.abs(selisih)+" poin");
        
        //membandingkan poin penampilan dari kedua kandidat
        int selisih2 = a.penampilan-penampilan;
        if(penampilan == a.penampilan)
            System.out.println("Penampilan \t: "+a.nama+" dan "+nama+" memiliki poin sama");
        else if(penampilan < a.penampilan)
            System.out.println("Penampilan \t: "+a.nama+" Lebih tinggi "+selisih2+" poin");
        else
            System.out.println("Penampilan \t: "+nama+" Lebih tinggi "+Math.abs(selisih2)+" poin");
        
        //membandingkan poin suara dari kedua kandidat
        int selisih3 = a.suara-suara;
        if(suara == a.suara)
            System.out.println("Suara \t\t: "+a.nama+" dan "+nama+" memiliki poin sama");
        else if(suara < a.suara)
            System.out.println("Suara \t\t: "+a.nama+" Lebih tinggi "+selisih3+" poin");
        else
            System.out.println("Suara \t\t: "+nama+" Lebih tinggi "+Math.abs(selisih3)+" poin");
        System.out.println("===========================================================");
        
        //menghitung jumlah poin dari setiap-setiap penampilan dan membandingkan jumlah poin dari kedua kandidat
        int jum1 = (a.atitude+a.penampilan+a.suara);
        int jum2 = (atitude+penampilan+suara);
        int selisih4 = (a.atitude+a.penampilan+a.suara)-(atitude+penampilan+suara);
        if(jum2 == jum1)
            System.out.println("Kedua kandidat memiliki jumlah poin yang sama");
        else if(jum2 < jum1)
            System.out.println("Hasil Perbandingan : "+a.nama+" Lebih unggul "+selisih4+" poin");
        else
            System.out.println("Hasil Perbandingan : "+nama+" Lebih unggul "+Math.abs(selisih4)+" poin");
        
        System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin");
    }
}
