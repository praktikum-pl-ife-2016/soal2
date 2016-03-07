
public class Kandidat {
 public String name;
    public int atitude;
    public int penampilan;
    public int suara;
    public int total;
    
    

    

    public void setName(String n) {
        name = n;
    }

    public void setAtitude(int a) {
        atitude = a;
        total += a; 
       
    }

    public void setPenampilan(int p) {
        penampilan = p;
        total += p;
    }

    public void setSuara(int s) {
        suara = s;
        total += s;
    }
    public Kandidat() {
        this.name = name;
        this.atitude = atitude;
        this.penampilan = penampilan;
        this.suara = suara;
        this.total = total;
    }
     public static void bandingkan(Kandidat a1, Kandidat a2) {
        System.out.println("Perbandingan poin antara " + a1.name + " dan " + a2.name + " :");
        if (a1.atitude > a2.atitude) {
            System.out.println("Atitude : " + a1.name + " lebih tinggi " + (a1.atitude - a2.atitude) + " poin.");
        } else {
            System.out.println("Atitude : " + a2.name + " lebih tinggi " + (a2.atitude - a1.atitude) + " poin.");
        }
        if (a1.penampilan > a2.penampilan) {
            System.out.println("Penampilan : " + a1.name + " lebih tinggi " + (a1.penampilan - a2.penampilan) + " poin.");
        } else {
            System.out.println("Penampilan : " + a2.name + " lebih tinggi " + (a2.penampilan - a1.penampilan) + " poin.");
        }
        if (a1.suara > a1.suara) {
            System.out.println("Suara : " + a1.name + " lebih tinggi " + (a1.suara - a2.suara) + " poin.");
        } else {
            System.out.println("Suara : " + a2.name + " lebih tinggi " + (a2.suara - a1.suara) + " poin.");
        }
        System.out.println("====================================================");
        if (a1.total > a2.total) {
            System.out.println("Hasil perbandingan : " + a1.name + " lebih unggul " + (a1.total - a2.total) + " poin.");
        } else {
            System.out.println("Hasil perbangingan : " + a2.name + " lebih unggul " + (a2.total - a1.total) + " poin.");
        }
        System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin.");
    }
}
   