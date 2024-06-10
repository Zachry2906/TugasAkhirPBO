package G3D;
import G2D.Lingkaran;

public class Kerucut extends Lingkaran{

    private double volumeK;
    private double luasPermukaanK;

    public  Kerucut(){

    }

    public Kerucut(double jari, double tinggi){
        this.setLuas(jari, tinggi);
        this.setVolume(jari, tinggi);
    }
    public void setLuas(double jari, double tinggi){
        luasPermukaanK = super.setLing(jari) + super.setLing(jari) + 3.14 * jari * tinggi;
    }

    public void setVolume(double jari, double tinggi){
        volumeK = super.setLing(jari) * tinggi / 3;
    }

    public double getLuas(){
        return luasPermukaanK;
    }

    public double getVolume(){
        return volumeK;
    }
}
