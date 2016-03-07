public class Kandidat{
    private String nama ;
    private int atidute;
    private int penampilan;
    private int suara;
    
    public Kandidat(String nama, int atidute, int penampilan, int suara){
        this.nama = nama;
        this.atidute = atidute;
        this.penampilan = penampilan;
        this.suara = suara;
    }
    
    public void banding(Kandidat K){
        String namaAtidute,namaPenampilan,namaSuara,namaTotal;
        int poinAtidute,poinPenampilan,poinSuara,poinTotal,total1,total2;
        
        if (K.atidute>atidute){
            poinAtidute = K.atidute - atidute;
            namaAtidute = K.nama;
        }else {
            poinAtidute = atidute - K.atidute;
            namaAtidute = nama;
        }
        if (K.penampilan>penampilan){
            poinPenampilan = K.penampilan - penampilan;
            namaPenampilan = K.nama;
        }else {
            poinPenampilan = penampilan - K.penampilan;
            namaPenampilan = nama;
        }
        if (K.suara>suara){
            poinSuara = K.suara - suara;
            namaSuara = K.nama;
        }else {
            poinSuara = suara - K.suara;
            namaSuara = K.nama;
        }
        total1 = K.atidute + K.suara + K.penampilan;
        total2 = atidute + suara + penampilan;
        if (total1 > total2){
            poinTotal = total1 - total2;
            namaTotal = K.nama;
            
        }else{
            poinTotal = total2 - total1;
            namaTotal = nama;
        }
        System.out.println("Perbandingan Poin antara "+ K.nama +" dan "+ nama );
        System.out.println("Attitude :"+ namaAtidute +" lebih tinggi selisih "+ poinAtidute +" Poin");
        System.out.println("Penampilan :"+ namaPenampilan +" lebih tinggi selisih "+ poinPenampilan +" Poin");
        System.out.println("suara :"+ namaSuara +" lebih tinggi selisih "+ poinSuara +" Poin");
        System.out.println("==============================================");
        System.out.println("Hasil Perbandingan : " +namaTotal+" lebih unggul "+poinTotal+" poin");
        
    }
}
