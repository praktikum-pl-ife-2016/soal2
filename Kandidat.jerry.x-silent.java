package tugas1;

/**
 *
 * @author JERRY
 */
public class Kandidat {
    public String nama;
     public int attitude;
    public int penampilan;
    public int suara;
     public int total = 0;
 
     public void setNama(String s) {
         nama = s;
     }
 
     public void setAtt(int i) {
         attitude = i;
         total += i;
     }
 
     public void setTampil(int i) {
         penampilan = i;
         total += i;
     }
 
     public void setSuara(int i) {
         suara = i;
         total += i;
     }
 
     public Kandidat() {
         this.nama = nama;
         this.attitude = attitude;
         this.penampilan = penampilan;
         this.suara = suara;
         this.total = total;
     }
 
     public static void bandingkan(Kandidat jer, Kandidat jerr) {
         System.out.println("Perbandingan poin antara " + jer.nama + " dan " + jerr.nama + " :");
         if (jer.attitude > jerr.attitude) {
             System.out.println("Attitude : " + jer.nama + " lebih tinggi " + (jer.attitude - jerr.attitude) + " poin.");
         } else {
             System.out.println("Attitude : " + jerr.nama + " lebih tinggi " + (jerr.attitude - jer.attitude) + " poin.");
         }
         if (jer.penampilan > jerr.penampilan) {
             System.out.println("Penampilan : " + jer.nama + " lebih tinggi " + (jer.penampilan - jerr.penampilan) + " poin.");
         } else {
             System.out.println("Penampilan : " + jerr.nama + " lebih tinggi " + (jerr.penampilan - jer.penampilan) + " poin.");
         }
         if (jer.suara > jer.suara) {
             System.out.println("Suara : " + jer.nama + " lebih tinggi " + (jer.suara - jerr.suara) + " poin.");
         } else {
             System.out.println("Suara : " + jerr.nama + " lebih tinggi " + (jerr.suara - jer.suara) + " poin.");
         }
         System.out.println("====================================================");
         if (jer.total > jerr.total) {
             System.out.println("Hasil perbandingan : " + jer.nama + " lebih unggul " + (jer.total - jerr.total) + " poin.");
         } else {
             System.out.println("Hasil perbangingan : " + jerr.nama + " lebih unggul " + (jerr.total - jer.total) + " poin.");
         }
         System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin.");
     }

    
    }
 

