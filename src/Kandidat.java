
public class Kandidat {

    public String nama;
    public int attitude;
    public int penampilan;
    public int suara;
    public int jumlah = 0;
    
    public Kandidat() {
        nama = "";
        attitude = 0;
        penampilan = 0;
        suara = 0;
        jumlah = 0;
        
    }
    public void setNama (String n) {
        nama = n; 
    }
    public void setAttitude (int a) {
        attitude = a;
        jumlah += a;
    }
    public void setPenampilan (int p) {
        penampilan = p;
        jumlah += p;
    }
    public void setSuara (int s) {
        suara = s;
        jumlah += s;
    }
    
    public static void bandingkan(Kandidat n1, Kandidat n2) {  
        System.out.println("Perbandingan poin antara " + n1.nama + " dan " + n2.nama + " :");  
        if (n1.attitude > n2.attitude) {  
           System.out.println("Attitude : " + n1.nama + " lebih tinggi " + (n1.attitude - n2.attitude) + " poin.");  
     } else {  
            System.out.println("Attitude : " + n2.nama + " lebih tinggi "+(n2.attitude - n1.attitude)+" poin.");  
        }  
      if (n1.penampilan > n2.penampilan) {  
             System.out.println("Penampilan : " + n1.nama + " lebih tinggi " + (n1.penampilan - n2.penampilan) + " poin.");  
     } else {  
           System.out.println("Penampilan : " + n2.nama + " lebih tinggi " + (n2.penampilan - n1.penampilan) + " poin.");  
       }  
        if (n1.suara > n1.suara) {  
           System.out.println("Suara : " + n1.nama + " lebih tinggi " + (n1.suara - n2.suara) + " poin.");  
      } else {  
            System.out.println("Suara : " + n2.nama + " lebih tinggi " + (n2.suara - n1.suara) + " poin.");  
        }  
       System.out.println("====================================================");  
         if (n1.jumlah > n2.jumlah) {  
            System.out.println("Hasil perbandingan : " + n1.nama + " lebih unggul " + (n1.jumlah - n2.jumlah) + " poin.");  
        } else {  
            System.out.println("Hasil perbandingan : " + n2.nama + " lebih unggul " + (n2.jumlah - n1.jumlah) + " poin.");  
       }  
       System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin.");  
    }  
 }  

            
