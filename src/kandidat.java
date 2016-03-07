/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author user
 */
public class kandidat {
    private String nama;
    private int atitude,suara,penampilan,total;
    
    
    kandidat(String nama,int atitude,int suara,int penampilan){
        this.nama=nama;
        this.atitude=atitude;
        this.suara=suara;
        this.penampilan=penampilan;
        total=atitude+suara+penampilan;
    }
    public void bandingkan(kandidat x){
        String nam1=nama,nam2=nama,nam3=nama,nam4=x.nama;
        int a=atitude-x.atitude,b=suara-x.suara,c=penampilan-x.penampilan;
        if(a<0)
            nam1=x.nama;
        if(b<0)
            nam2=x.nama;
        if(c<0)
            nam3=x.nama;
        if(total>x.total)
            nam4=nama;
        System.out.println("Hasil perbandingan penilaian juri dari peserta "+nama+" dan "+x.nama);
        System.out.println("=======================================================================");
        System.out.println("Atitude   :"+nam1+" memiliki nilai lebih tinggi.Dengan selisih "+mutlak(a)+"Poin");
        System.out.println("Suara     :"+nam2+" memiliki nilai lebih tinggi.Dengan selisih "+mutlak(b)+"Poin");
        System.out.println("Penampilan:"+nam3+" memiliki nilai lebih tinggi.Dengan selisih "+mutlak(c)+"Poin");
        System.out.println("\nHasil: "+nam3+" lebih unggul.Dengan selilisih total "+mutlak(total-x.total));
    }
    private int mutlak(int c){
        int b=0;
        if(c>0)
           b=c;
        if(c<0)
          b=c*-1;
        return b;  
    }
}
