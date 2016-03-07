public class Tugas2 {

   public String nama;
    public int attitude,penampilan,suara;
    public int total = 0;

    
    public void setNama(String h) {
        nama = h;
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

    public Tugas2() {
        this.nama = nama;
        this.attitude = attitude;
        this.penampilan = penampilan;
        this.suara = suara;
        this.total = total;
   }

    public static void banding(Tugas2 m1, Tugas2 m2) {
        System.out.println("Perbandingan poin antara " + m1.nama + " dan " + m2.nama + " :");
        if (m1.attitude > m2.attitude) {
            System.out.println("Attitude : " + m1.nama + " lebih tinggi " + (m1.attitude - m2.attitude) + " poin.");
        } else {
            System.out.println("Attitude : " + m2.nama + " lebih tinggi " + (m2.attitude - m1.attitude) + " poin.");
        }
        if (m1.penampilan > m2.penampilan) {
            System.out.println("Penampilan : " + m1.nama + " lebih tinggi " + (m1.penampilan - m2.penampilan) + " poin.");
        } else {
            System.out.println("Penampilan : " + m2.nama + " lebih tinggi " + (m2.penampilan - m1.penampilan) + " poin.");
        }
        if (m1.suara > m1.suara) {
            System.out.println("Suara : " + m1.nama + " lebih tinggi " + (m1.suara - m2.suara) + " poin.");
        } else {
            System.out.println("Suara : " + m2.nama + " lebih tinggi " + (m2.suara - m1.suara) + " poin.");
        }
        System.out.println("====================================================");
        if (m1.total > m2.total) {
            System.out.println("Hasil perbandingan : " + m1.nama + " lebih unggul " + (m1.total - m2.total) + " poin.");
        } else {
            System.out.println("Hasil perbangingan : " + m2.nama + " lebih unggul " + (m2.total - m1.total) + " poin.");
        }
        System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin.");
    }
}