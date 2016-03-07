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
public class MainKandidat {

    public static void main(String[] args) {

        Kandidat m1 = new Kandidat();

        Kandidat m2 = new Kandidat("Budi", 79, 86, 95);
        System.out.println("Perbandingan Poin antara " + m1.nama + " dan " + m2.nama + " : ");
        m1.bandingkan(m2);
    }
}
