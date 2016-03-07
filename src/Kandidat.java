public class Kandidat {
    private int attitude, penampilan, suara, total;
    private String nama;

    public void setNama(String a) {
        nama = a;
    }

    public void setAttitude(int b) {
        attitude = b;
        total += b;
    }

    public void setTampil(int c) {
        penampilan = c;
        total += c;
    }

    public void setSuara(int d) {
        suara = d;
        total += d;
        
    }

    public Kandidat() {
    }

    public static void bandingkan(Kandidat idol1, Kandidat idol2) {
        System.out.println("Perbandingan antara kedua calon idol, " + idol1.nama + " dan " + idol2.nama + " :");
        if (idol1.attitude > idol2.attitude) {
            System.out.println("Hasil Attitude idol : " + idol1.nama + " lebih tinggi " + (idol1.attitude - idol2.attitude) + " poin.");
        } else {
            System.out.println("Hasil Attitude idol : " + idol2.nama + " lebih tinggi " + (idol2.attitude - idol1.attitude) + " poin.");
        }
        if (idol1.penampilan > idol2.penampilan) {
            System.out.println("Hasil Penampilan idol : " + idol1.nama + " lebih tinggi " + (idol1.penampilan - idol2.penampilan) + " poin.");
        } else {
            System.out.println("Hasil Penampilan idol : " + idol2.nama + " lebih tinggi " + (idol2.penampilan - idol1.penampilan) + " poin.");
        }
        if (idol1.suara > idol1.suara) {
            System.out.println("Hasil Suara idol : " + idol1.nama + " lebih tinggi " + (idol1.suara - idol2.suara) + " poin.");
        } else {
            System.out.println("Hasil Suara idol : " + idol2.nama + " lebih tinggi " + (idol2.suara - idol1.suara) + " poin.");
        }
        System.out.println("============================================================================================================================================================================================");
        if (idol1.total > idol2.total) {
            System.out.println("Hasil perbandingan : " + idol1.nama + " lebih unggul " + (idol1.total - idol2.total) + " poin.");
        } else {
            System.out.println("Hasil perbangingan : " + idol2.nama + " lebih unggul " + (idol2.total - idol1.total) + " poin.");
        }
    }
}