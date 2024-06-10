package G3D;
import G2D.Lingkaran;

public class Tabung extends Lingkaran{
    double volumeT;
    double luasT;
    static double lLing;

    public  Tabung(double jari, double tinggi){
        this.setLuas(jari, tinggi);
        this.setVolume(jari, tinggi);
    }
    public void setLuas(double jari, double tinggi){
        lLing = super.setLing(jari);
        luasT = lLing * 2 + super.setKeliling(jari) * tinggi;
    }

    public void setVolume(double jari, double tinggi){
        volumeT = lLing * tinggi;
    }

    public double getLuas(){
        return luasT;
    }

    public double getVolume(){
        return volumeT;
    }

}
