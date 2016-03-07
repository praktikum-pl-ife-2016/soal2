package idol;

public class MainIdol {
    
public static void main(String[] args) {
        
Idol m1 = new Idol ();
m1.setNama ("Hardwell");
m1.setAttitude (90);
m1.setPenampilan (89);
m1.setSuara (79);

Idol m2 = new Idol ();
m2.setNama ("David Guetta");
m2.setAttitude (50);
m2.setPenampilan (87);
m2.setSuara (98);
Idol.banding(m1,m2);
    }
}