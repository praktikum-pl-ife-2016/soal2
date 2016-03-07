

package ujikandidat;

public class UjiKandidat {

   
    public static void main(String[] args) {
        
        Kandidat k1 = new Kandidat();
        k1.setNama("rafi");
        k1.setAtitude(90);
        k1.setPenampilan(85);
        k1.setSuara(87);
 
        Kandidat k2 = new Kandidat();
        k2.setNama("daryo");
        k2.setAtitude(85);
        k2.setPenampilan(88);
        k2.setSuara(92);
      
        k1.bandingkan(k2);
    }
    
}
