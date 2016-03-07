public class Kandidat {
    private String nama;
    private int attitude;
    public int penampilan;
    public int suara;
    
    public Kandidat(){
        nama = "";
        attitude = 0;
        penampilan = 0;
        suara = 0;
    }
    public Kandidat(String n, int a, int p, int s){
        nama = n;
        attitude = a;
        penampilan = p;
        suara = s;
    }
    
    public void setNama(String n){
        nama = n;
    }
    
    public void setAttitude(int a){
        attitude = a;
    }
    
    public void setPenampilan(int p){
        penampilan = p;
    }
    
    public void setSuara(int s){
        suara = s;
    }
    
    public void Compare(Kandidat c){
        System.out.println("Perbandingan Poin antara " + nama + " dan " + c.nama);
        if (c.attitude > attitude) {
            System.out.println("Attitude : " + c.nama + " lebih tinggi " + (c.attitude - attitude) + " poin");
        }
        else{
            System.out.println("Attitude : " + nama + " lebih tinggi " + (attitude - c.attitude) + " poin");
        }
        if (c.penampilan > penampilan) {
            System.out.println("Penampilan : " + c.nama + " lebih tinggi " + (c.penampilan - penampilan) + " poin");
        }
        else{
            System.out.println("Penampilan : " + nama + " lebih tinggi " + (penampilan - c.penampilan) + " poin");
        }
        if (c.suara > suara) {
            System.out.println("Suara : " + c.nama + " lebih tinggi " + (c.suara - suara) + " poin");
        }
        else{
            System.out.println("Suara : " + nama + " lebih tinggi " + (suara- c.suara) + " poin");
        }
        
        System.out.println("==============================================================");
        int jumlah = c.attitude + c.penampilan + c.suara;
        int jumlah2 = attitude + penampilan + suara;
        
        if (jumlah > jumlah2) {
            System.out.println("Hasil Perbandingan : " + c.nama + " lebih unggul " + (jumlah - jumlah2) + " poin");
        }
        else {
            System.out.println("Hasil Perbandingan : " + nama + " lebih unggul " + (jumlah2 - jumlah) + " poin");
        }
        System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin");       
    }}

