public class Muzyka {
    String gengre;
    int bpm;
    boolean aggressiveness;
    public void speak()
    {
        System.out.println("Gengre:"+gengre);
        System.out.println("BPM:"+bpm);
        System.out.println("aggressiveness:"+aggressiveness);
    }
    public Muzyka()
    {
        System.out.println("MUzyka bez informacji");
    }
    public Muzyka(String gengre)
    {
        this.gengre=gengre;
    }

    public Muzyka(int bpm,String gengre,boolean aggressiveness)
    {
        this.bpm=bpm;
        this.gengre=gengre;
        this.aggressiveness=aggressiveness;
    }
}


