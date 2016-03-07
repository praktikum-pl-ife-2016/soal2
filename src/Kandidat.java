
public class Kandidat {
    private String nama;
    private int attitude, penampilan, suara, total;
    
    public Kandidat(String n, int a, int p, int s)
    {
        nama = n;
        attitude = a;
        penampilan = p;
        suara = s;
        total = a+p+s;
    }
    
    public static void bandingkan(Kandidat p, Kandidat k){
        System.out.println("Perbandingan poin antara "+p.nama+" dan "+k.nama+" : ");
        if (p.attitude > k.attitude){
            System.out.println("Attitude : "+p.nama+" lebih tinggi "+(p.attitude - k.attitude)+" poin");
        }else if (p.attitude < k.attitude){
            System.out.println("Attitude : "+k.nama+" lebih tinggi "+(k.attitude - p.attitude)+" poin");
        }else{
            System.out.println("Attitude : "+p.nama+" sama dengan "+k.nama);
        }
        if (p.penampilan > k.penampilan){
            System.out.println("Penampilan : "+p.nama+" lebih tinggi "+(p.penampilan - k.penampilan)+" poin");
        }else if (p.penampilan < k.penampilan){
            System.out.println("Penampilan : "+k.nama+" lebih tinggi "+(k.penampilan - p.penampilan)+" poin");
        }else{
            System.out.println("Penampilan : "+p.nama+" sama dengan "+k.nama);
        }
        if (p.suara > k.suara){
            System.out.println("Suara : "+p.nama+" lebih tinggi "+(p.suara - k.suara)+" poin");
        }else if (p.suara < k.suara){
            System.out.println("Suara : "+k.nama+" lebih tinggi "+(k.suara - p.suara)+" poin");
        }else{
            System.out.println("Suara : "+p.nama+" sama dengan "+k.nama);
        }
        System.out.println("<!================================================!>");
        if (p.total > k.total){
            System.out.println("Hasil Perbandingan : "+p.nama+" lebih unggul "+(p.total - k.total)+" poin");
        }else if (p.total < k.total){
            System.out.println("Hasil Perbandingan : "+k.nama+" lebih unggul "+(k.total - p.total)+" poin");
        }else{
            System.out.println("Hasil Perbandingan : "+p.nama+" sama dengan "+k.nama);
        }
        System.out.println("Hasil Perbandingan berdasarkan jumlah keseluruhan poin");
    }
}