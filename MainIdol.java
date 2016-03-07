package idol;

public class MainIdol {
    
public static void main(String[] args) {
        
Idol m1 = new Idol ();
m1.setNama ("X-Silent");
m1.setAttitude (78);
m1.setPenampilan (86);
m1.setSuara (72);

Idol m2 = new Idol ();
m2.setNama ("Rhomzie");
m2.setAttitude (60);
m2.setPenampilan (82);
m2.setSuara (91);
Idol.comparison(m1,m2);
    }
}
