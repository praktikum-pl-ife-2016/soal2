public class Kandidat {

     private String nama ;
     private int attitude;
     private int penampilan;
     private int suara;
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
     public void setNama (String n){
         nama = n;
     }
     public void setAttitude (int at){
        attitude = at;
     }
     public void setPenampilan (int pe){
         penampilan = pe;
     }
     public void setSuara (int su){
         suara = su;
     }
     public void banding(Kandidat K){
         System.out.println("\n\nPerbandingan Poin antara "+ K.nama +" dan "+ nama );
         if (K.attitude>attitude){
             int selisih = K.attitude- attitude;
             System.out.println("Attitude : "+ K.nama +" lebih tinggi selisih "+ selisih+" Poin");
         }else if (K.attitude<attitude){
             int selisih = attitude - K.attitude;
             System.out.println("Attitude : "+ nama +" lebih tinggi selisih "+ selisih+" Poin");
         }else
              System.out.println("Poin yang didapat sama");
         if (K.penampilan>penampilan){
             int selisih = K.penampilan - penampilan;
             System.out.println("Penampilan : "+ K.nama +" lebih tinggi selisih "+ selisih+" Poin");
         }else if (K.attitude<attitude) {
             int selisih = penampilan - K.penampilan;
             System.out.println("Penampilan : "+ nama +" lebih tinggi selisih "+ selisih+" Poin");
         }else
              System.out.println("Poin yang didapat sama");
         if (K.suara>suara){
             int selisih = K.suara - suara;
             System.out.println("suara : "+ K.nama +" lebih tinggi selisih "+ selisih+" Poin");
         }else if (K.attitude<attitude){
             int selisih = suara - K.suara;
             System.out.println("suara : "+ nama +" lebih tinggi selisih "+ selisih+" Poin");
         }else 
             System.out.println("Poin yang didapat sama");
         System.out.println("==============================================");
         int total1 = K.attitude + K.suara + K.penampilan;
         int total2 = attitude + suara + penampilan;
         if (total1 > total2){
             int selisih = total1 - total2;
             System.out.println("Hasil Perbandingan : " +K.nama+" lebih unggul "+selisih+" poin");
         }else if(total1 < total2){
            int selisih = total2 - total1;
             System.out.println("Hasil Perbandingan : " +nama+" lebih unggul "+selisih+" poin");
         }else 
             System.out.println("Total yang didapat keduanya sama");
         System.out.println("Hasil perbandingan adalah berdarkan jumlah keseluruhan poin");
     }
 }
