public class Kandidat {
    private String name;
    private int attitude;
    public int perform;
    public int voice;
    
    public Kandidat(){
        name = "";
        attitude = 0;
        perform = 0;
        voice = 0;
    }
    public Kandidat(String e, int s, int a, int i){
        name = e;
        attitude = s;
        perform = a;
        voice = i;
    }
    
    public void getName(String e){
        name = e;
    }
    
    public void getAttitude(int s){
        attitude = s;
    }
    
    public void getPerform(int a){
        perform = a;
    }
    
    public void getVoice(int i){
        voice = i;
    }
    
    public void Compare(Kandidat c){
        System.out.println("Perbandingan Poin antara " + name + " dan " + c.name);
        if (c.attitude > attitude) {
            System.out.println("Attitude : " + c.name + " lebih tinggi " + (c.attitude - attitude) + " poin");
        }
        else{
            System.out.println("Attitude : " + name + " lebih tinggi " + (attitude - c.attitude) + " poin");
        }
        if (c.perform > perform) {
            System.out.println("Penampilan : " + c.name + " lebih tinggi " + (c.perform - perform) + " poin");
        }
        else{
            System.out.println("Penampilan : " + name + " lebih tinggi " + (perform - c.perform) + " poin");
        }
        if (c.voice > voice) {
            System.out.println("Suara : " + c.name + " lebih tinggi " + (c.voice - voice) + " poin");
        }
        else{
            System.out.println("Suara : " + name + " lebih tinggi " + (voice - c.voice) + " poin");
        }
        
        System.out.println("================================================================");
        int jml = c.attitude + c.perform + c.voice;
        int jml2 = attitude + perform + voice;
        
        if (jml > jml2) {
            System.out.println("Hasil Perbandingan : " + c.name + " lebih unggul " + (jml - jml2) + " poin");
        }
        else {
            System.out.println("Hasil Perbandingan : " + name + " lebih unggul " + (jml2 - jml) + " poin");
        }
        System.out.println("Hasil perbandingan adalah berdasarkan jumlah keseluruhan poin");       
    }}
