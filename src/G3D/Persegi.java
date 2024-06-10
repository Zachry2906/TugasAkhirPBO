package G3D;
import G2D.Segi4;

public class Persegi extends Segi4{
    protected double volume;
    protected double luasP;
    protected double luasLP;
    protected double luasPP;
    protected double volumeB;
    protected double volumeLP;
    protected double volumePP;
    static double luasP4;

    public Persegi(double sisi){
        this.setLuas(sisi);
        this.setVolume(sisi);
    }

    public void setLuas(double sisi){
        luasP4 = super.setL4(sisi);
        luasP = luasP4 * 6;
        luasLP = (luasP4) + (4 * (1/2 * sisi * sisi));
        luasPP = luasP4;
    }

    public void setVolume(double sisi){
        volumeB = luasP4 * sisi;
        volumeLP = super.setL4(sisi) * sisi / 3;
        volumePP = luasP4 * sisi;
    }

    public double getLuasP(){
        return luasP;
    }
    public double getLuasLP(){
        return luasLP;
    }
    public double getLuasPP(){
        return luasPP;
    }

    public double getVolumeB(){
        return volumeB;
    }
    public double getVolumeLP(){
        return volumeLP;
    }
    public double getVolumePP(){
        return volumePP;
    }

}
