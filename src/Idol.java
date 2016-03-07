public class Idol {

public String nama;
public int attitude;
public int penampilan;
public int suara;
public int total = 0;

public void setNama(String s) {
nama = s;
}

public void setAttitude(int i) {
attitude = i;
total += i;
}

public void setPenampilan(int i) {
penampilan = i;
total += i;
}

public void setSuara(int i) {
suara = i;
total += i;
}

public Idol() {
this.nama = nama;
this.attitude = attitude;
this.penampilan = penampilan;
this.suara = suara;
this.total = total;
}

public static void bandingkan(Idol a, Idol b) {
System.out.println("Perbandingan poin antara " + a.nama + " dan " + b.nama + "\t:");
if (a.attitude > b.attitude) {
System.out.println("Attitude\t: " + a.nama + " lebih tinggi " + (a.attitude - b.attitude) + " poin.");
} else {
System.out.println("Attitude\t: " + b.nama + " lebih tinggi " + (b.attitude - a.attitude) + " poin.");
}
if (a.penampilan > b.penampilan) {
System.out.println("Penampilan\t: " + a.nama + " lebih tinggi " + (a.penampilan - b.penampilan) + " poin.");
} else {
System.out.println("Penampilan\t: " + b.nama + " lebih tinggi " + (b.penampilan - b.penampilan) + " poin.");
}
if (a.suara > b.suara) {
System.out.println("Suara\t\t: " + a.nama + " lebih tinggi " + (a.suara - b.suara) + " poin.");
} else {
System.out.println("Suara\t\t: " + b.nama + " lebih tinggi " + (b.suara - a.suara) + " poin.");
}
System.out.println("========================================================================");
if (a.total > b.total) {
System.out.println("Hasil perbandingan\t: " + a.nama + " lebih unggul " + (a.total - b.total) + " poin.");
} else {
System.out.println("Hasil perbangingan\t: " + b.nama + " lebih unggul " + (b.total - a.total) + " poin.");
}
System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin.");
}
}