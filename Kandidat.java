package mainkandidat;
public class Kandidat {

    String nama;
    int atitude, penampilan, suara;

    Kandidat() {
    }

    Kandidat(String a, int b, int c, int d) {
        nama = a;
        atitude = b;
        penampilan = c;
        suara = d;
    }

    public void bandingkan(Kandidat A) {
        Kandidat dataDiri = new Kandidat("Melody", 8, 8, 9);
        Kandidat dataDiri2 = new Kandidat("Haruka", 6, 9, 6);
        int jumlahBanding1 = dataDiri.atitude + dataDiri.penampilan + dataDiri.suara;
        int jumlahBanding2 = dataDiri2.atitude + dataDiri2.penampilan + dataDiri2.suara;
        String bandingAtitude = (dataDiri.atitude > dataDiri2.atitude) ? dataDiri.nama+" lebih tinggi "+(dataDiri.atitude-dataDiri2.atitude)+" poin" : 
                                dataDiri2.nama+" lebih tinggi "+(dataDiri2.atitude-dataDiri.atitude)+" poin";
        String bandingPenampilan = (dataDiri.penampilan > dataDiri2.penampilan) ? dataDiri.nama+" lebih tinggi "+(dataDiri.penampilan-dataDiri2.penampilan)+" poin" : 
                                dataDiri2.nama+" lebih tinggi "+(dataDiri2.penampilan-dataDiri.penampilan)+" poin";
        String bandingSuara = (dataDiri.suara > dataDiri2.suara) ? dataDiri.nama+" lebih tinggi "+(dataDiri.suara-dataDiri2.suara)+" poin" : 
                                dataDiri2.nama+" lebih tinggi "+(dataDiri2.suara-dataDiri.suara)+" poin";
        String hasilBanding = (jumlahBanding1> jumlahBanding2) ? dataDiri.nama+" lebih unggul "+(jumlahBanding1-jumlahBanding2)+" poin" : 
                                dataDiri2.nama+" lebih unggul "+(jumlahBanding2-jumlahBanding1)+" poin";

        System.out.println("Perbandingan Poin antara " + dataDiri.nama + " dan " + dataDiri2.nama + " :");
        System.out.println("Atitude    : "+bandingAtitude);
        System.out.println("Penampilan : "+bandingPenampilan);
        System.out.println("Suara      : "+bandingSuara);
        System.out.println("==================================================");
        System.out.println("Hasil perbandingan : "+hasilBanding);
        System.out.println("Hasil perbandingan adalah berdarkan jumlah keseluruhan poin");
        
                
    }
    
}
