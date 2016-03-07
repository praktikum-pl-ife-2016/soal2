

public class Kandidat {
     String nama;
    int atitude;
    int penampilan;
    int suara;
    
    
    public Kandidat (){
        nama ="";
        atitude=0;
        penampilan=0;
        suara=0;
       }
    
    public Kandidat(String a,int at,int p,int s,int t){
        nama =a;
        atitude=at;
        penampilan=p;
        suara=s;
        
        
    }
    public void setNama(String n){
        nama=n;
    }
    public void setAtitude(int a){
        atitude=a;
        
        
    }
    public void setPenampilan(int i){
        penampilan=i;
        
    }
    public void setSuara(int x){
        suara=x;
           
    }   
    
    
    
    public void bandingkan(Kandidat x){
        System.out.println("========================================================"); 
        int selisih = x.atitude-atitude;
        if(atitude == x.atitude)
            System.out.println("Atitude \t: "+x.nama+" dan "+nama+" memiliki poin sama");
        else if(atitude < x.atitude)
            System.out.println("Atitude \t: "+x.nama+" Lebih tinggi "+selisih+" poin");
        else
            System.out.println("Atitude \t: "+nama+" Lebih tinggi "+Math.abs(selisih)+" poin");
        
        int selisih2 = x.penampilan-penampilan;
        if(penampilan == x.penampilan)
            System.out.println("Penampilan \t: "+x.nama+" dan "+nama+" memiliki poin sama");
        else if(penampilan < x.penampilan)
            System.out.println("Penampilan \t: "+x.nama+" Lebih tinggi "+selisih2+" poin");
        else
            System.out.println("Penampilan \t: "+nama+" Lebih tinggi "+Math.abs(selisih2)+" poin");
               
        int selisih3 = x.suara-suara;
        if(suara == x.suara)
            System.out.println("Suara \t\t: "+x.nama+" dan "+nama+" memiliki poin sama");
        else if(suara < x.suara)
            System.out.println("Suara \t\t: "+x.nama+" Lebih tinggi "+selisih3+" poin");
        else
            System.out.println("Suara \t\t: "+nama+" Lebih tinggi "+Math.abs(selisih3)+" poin");
        System.out.println("===========================================================");
        
        int jum1 = (x.atitude+x.penampilan+x.suara);
        int jum2 = (atitude+penampilan+suara);
        int selisih4 = (x.atitude+x.penampilan+x.suara)-(atitude+penampilan+suara);
        if(jum2 == jum1)
            System.out.println("Kedua kandidat memiliki poin yang sama");
        else if(jum2 < jum1)
            System.out.println("Hasil Perbandingan : "+x.nama+" Lebih unggul "+selisih4+" poin");
        else
            System.out.println("Hasil Perbandingan : "+nama+" Lebih unggul "+Math.abs(selisih4)+" poin");
        
        System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin");
        }
    
    }
    
