package kandidat;

import java.util.Scanner;
public class Kandidat {
    Scanner input = new Scanner(System.in);
    private String nama;
    private int atitude;
    private int penampilan;
    private int suara;
    
    //Konstruktor yang berisi atribut nama, atitude, penampilan dan suara
    public Kandidat(String nama, int atitude, int penampilan, int suara) {
        this.nama = nama;   
        this.atitude = atitude;
        this.penampilan = penampilan;
        this.suara = suara;
    }
    
    //Method yang menerima parameter berupa objek Kandidat yang berguna untuk membandingkan tiap-tiap atribut yang dimiliki oleh kedua objek
    public void bandingkan(Kandidat x) {
        int selisihAtitude = x.atitude - atitude;
        int selisihPenampilan = x.penampilan - penampilan;
        int selisihSuara = x.suara - suara;
        int totalPeserta1 = x.atitude + x.penampilan + x.suara;
        int totalPeserta2 = atitude + penampilan + suara;
        
        System.out.println("Perbandingan Poin antara "+x.nama+" dan "+nama+" :");
        if(x.atitude > atitude) {
            System.out.println("Atitude : "+x.nama+" lebih unggul "+selisihAtitude+ " poin");
        }else if(x.atitude == atitude) {
            System.out.println("Atitude : Kedua Peserta Memiliki Poin Yang Sama");
        }else 
            System.out.println("Atitude : "+nama+" lebih unggul "+Math.abs(selisihAtitude)+ " poin");
        
        if(x.penampilan > penampilan) {
            System.out.println("Penampilan : "+x.nama+" lebih unggul "+selisihPenampilan+ " poin");
        }else if(x.penampilan == penampilan) {
            System.out.println("Penampilan : Kedua Peserta Memiliki Poin Yang Sama");    
        }else 
            System.out.println("Penampilan : "+nama+" lebih unggul "+Math.abs(selisihPenampilan)+ " poin");
        
        if(x.suara > suara) {
            System.out.println("Suara : "+x.nama+" lebih unggul "+selisihSuara+ " poin");
        }else if(x.suara == suara) {
            System.out.println("Suara : Kedua Peserta Memiliki Poin Yang Sama"); 
        }else 
            System.out.println("Suara : "+nama+" lebih unggul "+Math.abs(selisihSuara)+ " poin");
        
        System.out.println("==============================================");
        
        int selisihTotal = totalPeserta1 - totalPeserta2;
        if(totalPeserta1 > totalPeserta2) {
            System.out.println("Hasil Perbandingan : "+x.nama+" lebih unggul "+selisihTotal+ " poin");
        }else 
            System.out.println("Hasil Perbandingan : "+nama+" lebih unggul "+Math.abs(selisihTotal)+ " poin");
        
        System.out.println("\"Hasil perbandingan adalah berdarkan jumlah keseluruhan poin\"");
    }        
}
    
    

