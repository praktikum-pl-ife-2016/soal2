public class MainKandidat {
    public static void main(String[] args) {
    Kandidat k1 = new Kandidat();
    k1.getName("Irma Nurvianti");
    k1.getAttitude(85);
    k1.getPerform(90);
    k1.getVoice(90);
        
    Kandidat k2 = new Kandidat();
    k2.getName("Venny Charnita");
    k2.getAttitude(90);
    k2.getPerform(85);
    k2.getVoice(80);
    
    k1.Compare(k2);
    
}}
