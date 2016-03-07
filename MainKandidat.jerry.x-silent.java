package tugas1;
/**
 *
 * @author JERRY
 */
public class MainKandidat {
    public static void main(String[] args) {
         Kandidat jer = new Kandidat();
         jer.setNama("Jerry Eko");
        jer.setAtt(90);
         jer.setTampil(95);
         jer.setSuara(85);
         Kandidat jerr = new Kandidat();
         jerr.setNama("Silent");
         jerr.setAtt(85);
         jerr.setTampil(90);
         jerr.setSuara(85);
         Kandidat.bandingkan(jer, jerr);
     }
 }

