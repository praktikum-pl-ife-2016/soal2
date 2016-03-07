
import java.util.Scanner;
public class PenilaianIdol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int poinA,poinAt,poinS,JmlPoin1,JmlPoin2,JmlTot;
        
        System.out.println("Nama1/Point Attitude/Point Atribute/Point Suara");
        Idol id1 = new Idol(in.next(), in.nextInt(), in.nextInt(), in.nextInt());

        System.out.println("Nama2/Point Attitude/Point Atribute/Point Suara");
        Idol id2 = new Idol(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
        System.out.println(" ");
       
        System.out.println("Perbandingan Antara "+id1.getNama1()+"  dan  "+id2.getNama1());
        System.out.println("------------------------------------------------------------");
        System.out.println(" ");
        if(id1.getPoinA()>id2.getPoinA())
        {
           poinA = id1.getPoinA()-id2.getPoinA();
            System.out.println("Attitude "+id1.getNama1()+"  Lebih Tinggi  "+poinA+" poin");
        }else {
            poinA = id2.getPoinA()-id1.getPoinA();
            System.out.println("Attitude "+id2.getNama1()+"  Lebih Tinggi  "+poinA+" poin");
        }
        System.out.println(" ");
        if(id1.getPointAt()>id2.getPointAt()){
            poinAt = id1.getPointAt()-id2.getPointAt();
            System.out.println("Atribute "+id1.getNama1()+"  Lebih Tinggi   "+poinAt+" poin");
        }else{
            poinAt = id2.getPointAt()-id1.getPointAt();
            System.out.println("Atribute "+id2.getNama1()+"  Lebih Tinggi   "+poinAt+" poin");
        }
        System.out.println(" ");
        if(id1.getPoinS()>id2.getPoinS()){
            poinS = id1.getPoinS()-id2.getPoinS();
            System.out.println("Suara "+id1.getNama1()+"     Lebih Tinggi   "+poinS+" poin");
        }else{
            poinS = id2.getPoinS()-id1.getPoinS();
            System.out.println("Suara "+id2.getNama1()+"     Lebih Tinggi   "+poinS+" poin");
        } 
        
        System.out.println("============================================================");
        
        
        JmlPoin1 = id1.getPoinA()+id1.getPointAt()+id1.getPoinS();
        JmlPoin2 = id2.getPoinA()+id2.getPointAt()+id2.getPoinS();
        
        if(JmlPoin1>JmlPoin2){
            JmlTot = JmlPoin1-JmlPoin2;
            System.out.println("Hasil Perbandingan: "+id1.getNama1()+" lebih unggul "+JmlTot+" poin");
        }else{
            JmlTot = JmlPoin2-JmlPoin1;
            System.out.println("Hasil Perbandingan: "+id2.getNama1()+" lebih unggul "+JmlTot+" poin");
        }
        
        System.out.println("'Hasil Perbanding adalah berdasarkan jumlah point'");
        
        
    }
}
