
public class Kandidat1 {

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
public void Compare(Kandidat1 c){
System.out.println("Perbandingan Poin antara " + nama + " dan " + c.nama);
if (c.attitude > attitude) {
System.out.println("Attitude : " + c.nama + " lebih tinggi " + (c.attitude - attitude) + " poin");
}
else{
System.out.println("Attitude : " + nama + " lebih tinggi " + (attitude - c.attitude) + " poin");
}
if (c.penampilan > penampilan) {
System.out.println("Penampilan : " + c.nama + " lebih tinggi " + (c.penampilan - penampilan) + " poin");
}
else{
System.out.println("Penampilan : " + nama + " lebih tinggi " + (penampilan - c.penampilan) + " poin");
}
if (c.suara > suara) {
System.out.println("Suara : " + c.nama + " lebih tinggi " + (c.suara - suara) + " poin");
}
else{
System.out.println("Suara : " + nama + " lebih tinggi " + (suara- c.suara) + " poin");
}
System.out.println("==============================================================");
int jumlah = c.attitude + c.penampilan + c.suara;
int jumlah2 = attitude + penampilan + suara;
if (jumlah > jumlah2) {
System.out.println("Hasil Perbandingan : " + c.nama + " lebih unggul " + (jumlah - jumlah2) + " poin");
}
else {
System.out.println("Hasil Perbandingan : " + nama + " lebih unggul " + (jumlah2 - jumlah) + " poin");
}
System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin");
}}
    