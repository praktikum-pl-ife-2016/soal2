/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kandidat;

/**
 *
 * @author Rezananda
 */
public class Kandidat {

    public String nama;
    public int atitude;
    public int penampilan;
    public int suara;
    public int total;


    public Kandidat() {
        nama = "Reza";
        atitude = 89;
        penampilan = 67;
        suara = 78;
        total = atitude + penampilan + suara;
    }

    public Kandidat(String nm, int at, int pen, int su) {
        nama = nm;
        atitude = at;
        penampilan = pen;
        suara = su;
        total = at + pen + su;
    }
    public void bandingkan (Kandidat m2){
        if(atitude > m2.atitude){
            System.out.println("Atitude : " + nama + " lebih tinggi " + (atitude - m2.atitude) + " poin ");
        }else {
            System.out.println("Atitude : " + m2.nama + " lebih tinggi " + (m2.atitude - atitude) + " poin ");
        }  if(penampilan > m2.penampilan){
            System.out.println("Penampilan : " + nama + " lebih tinggi " + (penampilan - m2.penampilan) + " poin ");
        }else {
            System.out.println("Penampilan : " + m2.nama + " lebih tinggi " + (m2.penampilan - penampilan) + " poin ");
        } if(suara > m2.suara){
            System.out.println("Suara : " + nama + " lebih tinggi " + (suara - m2.suara) + " poin ");
        }else {
            System.out.println("Suara : " + m2.nama + " lebih tinggi " + (m2.suara - suara) + " poin ");
        }
        System.out.println("=========================================");
        if(total > m2.total){
            System.out.println("Perbandingan : " + nama + " lebih tinggi " + (total-m2.total) + " point");
        } else{
            System.out.println("Perbandingan : " + m2.nama + " lebih tinggi " + (m2.total-total) + " point");
        } 
    }

}
