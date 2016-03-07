public class Main {
    public static void main(String[] args) {
        Kandidat nama1 = new Kandidat();
        nama1.setNama("Melody");
        nama1.setAtitude(80);
        nama1.setPenampilan(94);
        nama1.setSuara(84);
        Kandidat nama2 = new Kandidat();
        nama2.setNama("Nabilah");
        nama2.setAtitude(85);
        nama2.setPenampilan(87);
        nama2.setSuara(87);
        nama1.banding(nama2);       
    }   
}
