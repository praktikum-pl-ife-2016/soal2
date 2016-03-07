/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author efriza
 */
public class Main {

    public static void main(String[] args) {
        Kandidat kdt1 = new Kandidat("Dani Rose", 88, 82, 83);
        Kandidat kdt2 = new Kandidat("Marlyn Monroe",77,90,91);
        Kandidat.Bandingkan(kdt1, kdt2);
    }
}
