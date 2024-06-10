package G3D;
import G2D.Lingkaran;

public class Bola extends Lingkaran{
    private double volumeB;
    private double luasB;

    public Bola(){

    }

    public Bola(double jari){
        this.setLuas(jari);
        this.setVolume(jari);
    }

    public double setLuas(double jari){
        this.luasB = super.setLing(jari) * 4;
        return this.luasB;
    }
    public double setVolume(double jari){
       this.volumeB = super.setLing(jari) * jari * 4 / 3;
        return this.volumeB;
    }
    public double getLuasBola(){
        return luasB;
    }
    public double getVolumeBola(){
        return volumeB;
    }
}
