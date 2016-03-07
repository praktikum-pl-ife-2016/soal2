public class Kandidat {
    
    public String nama;
    public int atitude, penampilan, suara, total=0;
    public void setNama(String n){
        nama = n;
    }
    public void setAtitude(int a){
        atitude = a;
        total +=a;
    }
    public void setPenampilan(int p){
        penampilan = p;
        total += p;
    }
    public void setSuara(int s){
        suara = s;
        total += s;
    }
    public void Kandidat(){
        this.nama = nama;
        this.atitude = atitude;
        this.penampilan = penampilan;
        this.suara = suara;
        this.total = total;
    }
    
    public static void bandingkan(Kandidat kandidat1, Kandidat kandidat2){
        String hasilAtitude, hasilPenampilan, hasilSuara, hasilTotal;
        int pA, pP, pS, pT;
        System.out.print("\n\nPerbandingan Poin antara ");
        System.out.println(kandidat1.nama + " dan " +kandidat2.nama);
        
        if(kandidat1.atitude > kandidat2.atitude){
            hasilAtitude = kandidat1.nama;
            pA = kandidat1.atitude-kandidat2.atitude;
        }
        else{ hasilAtitude = kandidat2.nama;
            pA = kandidat2.atitude-kandidat1.atitude;
        }
        if(kandidat1.penampilan > kandidat2.penampilan){
            hasilPenampilan = kandidat1.nama;
            pP = kandidat1.penampilan-kandidat2.penampilan;
        }
        else{ hasilPenampilan = kandidat2.nama;
            pP = kandidat2.penampilan-kandidat1.penampilan;
        }
        if(kandidat1.suara > kandidat2.suara){
            hasilSuara = kandidat1.nama;
            pS = kandidat1.suara-kandidat2.suara;
        }
        else{ hasilSuara = kandidat2.nama;
        pS = kandidat2.suara-kandidat1.suara;
        }
        if(kandidat1.total>kandidat2.total){
            hasilTotal = kandidat1.nama;
            pT = kandidat1.total-kandidat2.total;
        }
        else{
            hasilTotal = kandidat2.nama;
            pT = kandidat2.total-kandidat1.total;
        }
        
        System.out.print("Attitude\t: " + hasilAtitude + " lebih tinggi ");
        System.out.println( pA + " Poin");
        System.out.print("Penampilan\t: " + hasilPenampilan + " lebih tinggi ");
        System.out.println( pP + " Poin");
        System.out.print("Suara\t\t: " + hasilSuara + " lebih tinggi ");
        System.out.println(pS + " Poin");
        System.out.println("__________________________________________");
        System.out.println("Hasil Perbandingan : " + hasilTotal + " Lebih tinggi " + pT + " Poin");
        System.out.println("hasil perbandingan adalah berdasarkan jumlah keseluruhan poin");
                
    }
}
