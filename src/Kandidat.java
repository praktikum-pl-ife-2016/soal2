/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RiskaAndriani
 */
public class Kandidat{
    private String Name;
    private int Attitude;
    public int Perform;
    public int Voice;
    
    public Kandidat(){
        Name = "";
        Attitude = 0;
        Perform = 0;
        Voice = 0;
    }
    public Kandidat (String a, int b, int c, int d){
        Name = a;
        Attitude = b;
        Perform = c;
        Voice = d;
    }
    public void getName (String a){
        Name = a;
    }
    public void getAttitude(int b){
        Attitude = b;
    }
     public void getPerform(int c){
         Perform = c;
     }
     public void getVoice(int d){
         Voice = d;
     }
     public void Compare(Kandidat e){
         System.out.println(" perbandingan poin antara " + Name + " dan " + e.Name );
         if (e.Attitude > Attitude){
             System.out.println(" sikap : " + e.Name + " lebih tinggi " + (e.Attitude - Attitude) + " poin ");
         }
         else{
             System.out.println(" sikap : " + Name + " lebih tinggi " + (Attitude - e.Attitude )+ " poin ");
         }
         if (e.Perform > Perform){
             System.out.println(" penampilan : " + e.Name + " lebih tinggi " + (e.Perform-Perform) + " poin ");
         }
         else{
             System.out.println(" penampilan : " + Name + " lebih tinggi " + (Perform - e.Perform) + " poin ");
     }
         if (e.Voice > Voice) {
             System.out.println(" Suara : " + e.Name + " lebih tinggi " + (e.Voice - Voice) + " poin ");
         }
         else{
             System.out.println(" Suara : " + Name + " lebih tinggi "  +(Voice - e.Voice) + " poin ");
         }
         
         System.out.println("================================================================");
         int jml1 = e.Attitude + e.Perform + e.Voice;
         int jml2 = Attitude + Perform + Voice;
         
         if (jml1 > jml2) {
             System.out.println(" Hasil Perbandingan : " + e.Name + " lebih unggul " + (jml1 - jml2) + " poin ");
         }
         else {
             System.out.println(" Hasil Perbandingan : " + Name + " lebih unggul " + (jml2 - jml1) + " poin ");
         }
         System.out.println(" Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin ");       
     }
}