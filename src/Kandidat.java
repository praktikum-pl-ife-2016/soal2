public class Kandidat {
    private String nama;
    public int attitude, penampilan, suara, total;
   

    public void setNama(String w) {
        nama = w;
    }

    public void setAttitude(int x) {
        attitude = x;
        total += x;
    }

    public void setTampil(int y) {
        penampilan = y;
        total += y;
    }

    public void setSuara(int z) {
        suara = z;
        total += z;
        
    }

    public Kandidat() {
    }

    public static void perbandingan(Kandidat orang1, Kandidat orang2) {
        System.out.println("Perbandingan " + orang1.nama + " dan " + orang2.nama + " :");
        if (orang1.attitude > orang2.attitude) {
            System.out.println("Attitude idol " + orang1.nama + " lebih tinggi " + (orang1.attitude - orang2.attitude) + " poin.");
        } else if(orang2.attitude > orang1.attitude){
            System.out.println("Attitude idol " + orang2.nama + " lebih tinggi " + (orang2.attitude - orang1.attitude) + " poin.");
        }else{
            System.out.println("Attitude idol " + orang1.nama + " sama dengan "+ orang2.nama);
        }
        
        if (orang1.penampilan > orang2.penampilan) {
            System.out.println("Penampilan idol " + orang1.nama + " lebih tinggi " + (orang1.penampilan - orang2.penampilan) + " poin.");
        } else if(orang2.penampilan > orang1.penampilan) {
            System.out.println("Penampilan idol " + orang2.nama + " lebih tinggi " + (orang2.penampilan - orang1.penampilan) + " poin.");
        }else{
            System.out.println("Penampilan idol " + orang1.nama + " sama dengan "+ orang2.nama);
        }    
        
        if (orang1.suara > orang2.suara) {
            System.out.println("Suara idol " + orang1.nama + " lebih tinggi " + (orang1.suara - orang2.suara) + " poin.");
        } else if (orang2.suara > orang1.suara) {
            System.out.println("Suara idol " + orang2.nama + " lebih tinggi " + (orang2.suara - orang1.suara) + " poin.");
        } else{
             System.out.println("Suara idol " + orang1.nama + " sama dengan "+ orang2.nama);
        }
        System.out.println("=================================================================");
        
        if (orang1.total > orang2.total) {
            System.out.println("Hasil perbandingan : " + orang1.nama + " lebih unggul " + (orang1.total - orang2.total) + " poin.");
        } else {
            System.out.println("Hasil perbandingan : " + orang2.nama + " lebih unggul " + (orang2.total - orang1.total) + " poin.");
        }
    }
}