package kandidat;
public class Kandidat {
    private String nama;
    private int attitude, penampilan, suara, jumlah;
    
    public Kandidat () {
        this.nama = "";
        this.attitude = 0;
        this.penampilan = 0;
        this.suara = 0;
        this.jumlah = 0;
    }
    public void setNama(String n) {
        nama = n;
    }
    public void setAttitude(int a) {
        attitude = a;
        jumlah += a;
    }
    public void setPenampilan(int p) {
        penampilan = p;
        jumlah += p;
    }
    public void setSuara(int s) {
        suara = s;
        jumlah += s;
    }
    public static void banding(Kandidat k1, Kandidat k2) {
        System.out.println("Perbandingan poin antara "+k1.nama+" dan "+k2.nama+" :");
        if (k1.attitude > k2.attitude)
            System.out.println("Attitude : "+k1.nama+" lebih tinggi "+(k1.attitude - k2.attitude)+" poin");
        else
            System.out.println("Attitude : "+k2.nama+" lebih tinggi "+(k2.attitude - k1.attitude)+" poin");
        if (k1.penampilan > k2.penampilan)
            System.out.println("Penampilan : "+k1.nama+" lebih tinggi "+(k1.penampilan - k2.penampilan)+" poin");
        else
            System.out.println("Penampilan : "+k2.nama+" lebih tinggi "+(k2.penampilan - k1.penampilan)+" poin");
        if (k1.suara > k2.suara)
            System.out.println("Suara : "+k1.nama+" lebih tinggi "+(k1.suara - k2.suara)+" poin");
        else
            System.out.println("Suara : "+k2.nama+" lebih tinggi "+(k2.suara - k1.suara)+" poin");
        System.out.println("==========================================");
        if (k1.jumlah > k2.jumlah)
            System.out.println("Hasil perbandingan : "+k1.nama+" lebih unggul "+(k1.jumlah - k2.jumlah)+" poin");
        else
            System.out.println("Hasil perbandingan : "+k2.nama+" lebih unggul "+(k2.jumlah - k1.jumlah)+" poin");
    }
}