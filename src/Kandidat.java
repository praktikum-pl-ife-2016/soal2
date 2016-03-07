public class Kandidat {

    private String nama;
    public int attitude, penampilan, suara, total;
   

    public void setNama(String n) {
        nama = n;
    }

    public void setAttitude(int p) {
        attitude = p;
        total += p;
    }

    public void setTampil(int q) {
        penampilan = q;
        total += q;
    }

    public void setSuara(int r) {
        suara = r;
        total += r;
        
    }
    public Kandidat(){
    }
          
     public static void bandingkan (Kandidat peserta1,Kandidat peserta2){
         System.out.println("Perbandingan " + peserta1.nama + " dan " + peserta2.nama + " :");
        if (peserta1.attitude > peserta2.attitude) {
            System.out.println("Attitude idol " + peserta1.nama + " lebih tinggi " + (peserta1.attitude - peserta2.attitude) + " poin.");
        } else if(peserta2.attitude > peserta1.attitude){
            System.out.println("Attitude idol " + peserta2.nama + " lebih tinggi " + (peserta2.attitude - peserta1.attitude) + " poin.");
        }else{
            System.out.println("Attitude idol " + peserta1.nama + " memiliki poin yang sama "+ peserta2.nama);
        }
        
        if (peserta1.penampilan > peserta2.penampilan) {
            System.out.println("Penampilan idol " + peserta1.nama + " lebih tinggi " + (peserta1.penampilan - peserta2.penampilan) + " poin.");
        } else if(peserta2.penampilan > peserta1.penampilan) {
            System.out.println("Penampilan idol " + peserta2.nama + " lebih tinggi " + (peserta2.penampilan - peserta1.penampilan) + " poin.");
        }else{
            System.out.println("Penampilan idol " + peserta1.nama + " memiliki poin yang sama  "+ peserta2.nama);
        }    
        
        if (peserta1.suara > peserta2.suara) {
            System.out.println("Suara idol " + peserta1.nama + " lebih tinggi " + (peserta1.suara - peserta2.suara) + " poin.");
        } else if (peserta2.suara > peserta1.suara) {
            System.out.println("Suara idol " + peserta2.nama + " lebih tinggi " + (peserta2.suara - peserta1.suara) + " poin.");
        } else{
             System.out.println("Suara idol " + peserta1.nama + " memiliki poin yang sama  "+ peserta2.nama);
        }
        System.out.println("=================================================================");
        
        if (peserta1.total > peserta2.total) {
            System.out.println("Hasil perbandingan : " + peserta1.nama + " lebih unggul " + (peserta1.total - peserta2.total) + " poin.");
        } else {
            System.out.println("Hasil perbandingan : " + peserta2.nama + " lebih unggul " + (peserta2.total - peserta1.total) + " poin.");
        }
    }
}
    