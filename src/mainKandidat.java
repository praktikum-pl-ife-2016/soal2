/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RiskaAndriani
 */
public class mainKandidat {
    public static void main(String[] args) {
        Kandidat x1 = new Kandidat ();
        x1.getName ("Riska Andriani");
        x1.getAttitude(80);
        x1.getPerform(90);
        x1.getVoice(85);
        
        Kandidat x2 = new Kandidat ();
        x2.getName("Adinda Layli");
        x2.getAttitude(85);
        x2.getPerform(85);
        x2.getVoice(80);
        
        x1.Compare(x2);
    }
}
