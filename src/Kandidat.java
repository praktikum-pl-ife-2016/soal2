public class Kandidat{
    private String nama ;
    private int attidute;
    private int penampilan;
    private int suara;
    public Kandidat(){
        nama = "";
        attidute = 0;
        penampilan = 0;
        suara = 0;
    }
    public Kandidat(String n, int a, int p, int s){
        nama = n;
        attidute = a;
        penampilan = p;
        suara = s;
    }
    public void setNama (String n){
        nama = n;
    }
    public void setAttidute (int at){
        attidute = at;
    }
    public void setPenampilan (int pe){
        penampilan = pe;
    }
    public void setSuara (int su){
        suara = su;
    }
    public void banding(Kandidat K){
        System.out.println("Perbandingan Poin antara "+ K.nama +" dan "+ nama );
        if (K.attidute>attidute){
            int selisih = K.attidute - attidute;
            System.out.println("Attitude :"+ K.nama +" lebih tinggi selisih "+ selisih+" Poin");
        }else {
            int selisih = attidute - K.attidute;
            System.out.println("Attitude :"+ nama +" lebih tinggi selisih "+ selisih+" Poin");
        }
        if (K.penampilan>penampilan){
            int selisih = K.penampilan - penampilan;
            System.out.println("Penampilan :"+ K.nama +" lebih tinggi selisih "+ selisih+" Poin");
        }else {
            int selisih = penampilan - K.penampilan;
            System.out.println("Penampilan :"+ nama +" lebih tinggi selisih "+ selisih+" Poin");
        }
        if (K.suara>suara){
            int selisih = K.suara - suara;
            System.out.println("suara :"+ K.nama +" lebih tinggi selisih "+ selisih+" Poin");
        }else {
            int selisih = suara - K.suara;
            System.out.println("suara :"+ nama +" lebih tinggi selisih "+ selisih+" Poin");
        }
        System.out.println("==============================================");
        int total1 = K.attidute + K.suara + K.penampilan;
        int total2 = attidute + suara + penampilan;
        if (total1 > total2){
            int selisih = total1 - total2;
            System.out.println("Hasil Perbandingan : " +K.nama+" lebih unggul "+selisih+" poin");
        }else{
            int selisih = total2 - total1;
            System.out.println("Hasil Perbandingan : " +nama+" lebih unggul "+selisih+" poin");
        }
        System.out.println("Hasil perbandingan adalah berdarkan jumlah keseluruhan poin");
    }
}
