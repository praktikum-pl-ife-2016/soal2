
public class Kandidat {
    
    public String nama;
    public int sikap;
    public int penampilan;
    public int suara;
    public int total = 0;
    
    public void setNama(String s) {
        nama = s;
    }
    
    public void setSikap(int i) {
        sikap = i;
        total += i;
    }
    public void setPenampilan ( int i) {
        penampilan = i;
        total += i;
    }
    public void setVoice ( int i ) {
        suara = i;
        total += 1;
    }
    public Kandidat () {
        this.nama = nama;
        this.sikap = sikap;
        this.penampilan = penampilan;
        this.suara = suara ;
        this.total = total;
    }
    
    public static void bandingkan (Kandidat k1, Kandidat k2 ) {
        System.out.println("Perbandingan antara : " + k1.nama + " dan " + k2.nama + " : ");
        if(k1.sikap > k2.sikap) {
            System.out.println("Sikap : " + k1.nama + " lebih tinggi " + (k1.sikap - k2.sikap) + " poin . ");
        } else {
            System.out.println("Sikap : " + k2.nama + " lebih tinggi " + (k2.sikap - k1.sikap) + " poin ");
        }
        if (k1.penampilan > k2.penampilan) {
            System.out.println("Penampilan : " + k1.nama + " lebih tinggi " + (k1.penampilan - k2.penampilan) + " poin ");
        } else {
            System.out.println("Penampilan : " + k2.nama + " lebih tinggi " + (k2.penampilan - k1.penampilan) + " poin ");
        }
        if (k1.suara > k2.suara){
            System.out.println("Suara : " + k1.nama + " lebih tinggi " + (k1.suara - k2.suara) + " poin ");
        } else {
            System.out.println("Suara : " + k2.nama + " lebih tinggi " + (k2.suara - k1.suara) + " poin ");
        }
        System.out.println("-----------");
        if (k1.total > k2.total) {
            System.out.println("Hasil perbandingan : " + (k1.nama) + " lebih unggul " + (k2.nama) + (k1.total - k2.total) + " poin ");
        } else {
            System.out.println("Hasil perbandingan : " + (k2.nama) + " lebih unggul " + (k1.nama) + (k2.total - k1.total) + " poin ");
            
        
            
        }
        
    }
    
}
