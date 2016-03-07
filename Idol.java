package idol;

public class Idol {

    private String nama;
    private int attitude;
    private int penampilan;
    private int suara;
   
    
    
    
    
public Idol(){
nama = "";
attitude = 0;
penampilan = 0;
suara = 0;

}
public Idol(String n, int a, int p,int s){
nama = n;
attitude = a;
penampilan =p;
suara = s;

}
public void setNama(String n){
    nama = n;
}
public void setAttitude(int a){
attitude = a;
}
public void setPenampilan(int p){
penampilan = p;
}
public void setSuara(int s){
suara = s;
}
            
public static void banding(Idol m1,Idol m2){

System.out.println("Perbandingan poin antara " + m1.nama + " dan " + m2.nama + " :");
if (m1.attitude > m2.attitude) {
System.out.println("Attitude : " + m1.nama + " lebih tinggi " + (m1.attitude - m2.attitude) + " poin.");
} else 
{
System.out.println("Attitude : " + m1.nama + " lebih tinggi " + (m2.attitude - m1.attitude) + " poin.");
}
if (m1.penampilan > m2.penampilan) {
System.out.println("Penampilan : " + m1.nama + " lebih tinggi " + (m1.penampilan - m2.penampilan) + " poin.");
} else 
{ 
System.out.println("Penampilan : " + m1.nama + " lebih tinggi " + (m2.penampilan - m1.penampilan) + " poin.");
}
{
if (m1.suara > m2.suara){
System.out.println("Suara : " + m1.nama + " lebih tinggi " + (m1.suara - m2.suara) + " poin.");
} else 
{
System.out.println("Suara : " + m1.nama + " lebih tinggi " + (m2.suara - m1.suara) + " poin.");
}
System.out.println("==============================================");
int total1 = m1.attitude + m1.suara + m1.penampilan;
int total2 = m2.attitude + m2.suara + m2.penampilan;
if (total1 > total2){
int selisih = total1 - total2;
System.out.println("Hasil Perbandingan : " +m1.nama+" lebih unggul "+selisih+" poin");
}
else
{
int selisih = total2 - total1;
System.out.println("Hasil Perbandingan : " +m2.nama+" lebih unggul "+selisih+" poin");
}
System.out.println("Hasil perbandingan adalah berdarkan jumlah keseluruhan poin");
}
}

}

    



        
    
    

