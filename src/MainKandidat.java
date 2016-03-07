
public class MainKandidat {
    public static void main(String[] args) {
    Kandidat kandidat1 = new Kandidat();
    kandidat1.setNama("Fatimatuz");
    kandidat1.setAttitude(90);
    kandidat1.setPenampilan(90);
    kandidat1.setSuara(75);
        
    Kandidat kandidat2 = new Kandidat();
    kandidat2.setNama("Zahro");
    kandidat2.setAttitude(80);
    kandidat2.setPenampilan(75);
    kandidat2.setSuara(90);
    
    kandidat1.Compare(kandidat2);
    
}
}
