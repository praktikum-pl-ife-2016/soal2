public class Kandidat {
    private String nama;
    private int atitude;
    private  int penampilan;
    private int suara;
    public Kandidat (){
        nama = "";
        atitude = 0;
        penampilan = 0;
        suara = 0;
    }
    public Kandidat (String n, int at, int p, int s){
        nama = n;
        atitude = at;
        penampilan = p;
        suara = s;       
    }
    public void setNama (String n){
        nama = n;
    }
    public void setAtitude (int at){
        atitude = at;
    }
    public void setPenampilan (int p){
        penampilan = p;
    }
    public void setSuara (int s){
        suara = s;
    }
    public void banding(Kandidat nama1){
        System.out.println("Perbandingan poin anatara " + nama1.nama + " dan " + nama + " : ");
        if(nama1.atitude > atitude){
            System.out.println("Atitude : " + nama1.nama + " lebih tinggi " + (nama1.atitude - atitude) + " poin");      
        }
        else {
            System.out.println("Atitude : " + nama + " lebih tinggi " + (atitude - nama1.atitude) + " poin");
        }
        if(nama1.penampilan > penampilan){
            System.out.println("Penampilan : " + nama1.nama + " lebih tinggi " + (nama1.penampilan - penampilan) + " poin");      
        }
        else {
            System.out.println("Penampilan : " + nama + " lebih tinggi " + (penampilan - nama1.penampilan) + " poin");
        }
        if(nama1.suara > suara){
            System.out.println("Suara : " + nama1.nama + " lebih tinggi " + (nama1.suara - suara) + " poin");      
        }
        else {
            System.out.println("Suara : " + nama + " lebih tinggi " + (suara - nama1.suara) + " poin");
        }
        System.out.println("============================================");
        int total1 = nama1.atitude + nama1.suara + nama1.penampilan;
        int total2 = atitude + suara + penampilan;
        
        if (total1 > total2){
            int selisih = total1 - total2;
            System.out.println("Hasil pertandingan : " + nama1.nama + " lebih unggul " + selisih + " poin");
        }
        else {
            int selisih = total2 - total1;
            System.out.println("Hasil pertandingan : " + nama + " lebih unggul " + selisih + " poin");
        }        
    }
}
