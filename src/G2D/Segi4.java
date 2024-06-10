package G2D;

public class Segi4 implements S4{
    protected double hasil;
    protected double kelilingg;
    public static double sisi;

    public  Segi4(double sisii){
        sisi = sisii;
        this.setL4(sisii);
        this.setKeliling4(sisii);
    }

    public Segi4(){

    }

    public double setL4(double panjang){
        hasil = panjang * panjang;
        return hasil;
    }

    public double setKeliling4(double panjang){
        kelilingg = 4 * panjang;
        return kelilingg;
    }

    public double getLuas(){
        return hasil;
    }

    public double getKeliling(){
        return kelilingg;
    }
}
