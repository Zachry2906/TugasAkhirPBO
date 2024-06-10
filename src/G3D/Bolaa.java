package G3D;

public class Bolaa extends Bola{
    protected double luasT;
    protected double luasJ;
    protected double luasC;
    protected double volumeT;
    protected double volumeC;
    static double lLing;

    public Bolaa(double jari, double tinggi, double sudut){
        this.setLuasPermukaan(jari, tinggi, sudut);
        this.setVolume(jari, tinggi);
        this.setVolume(jari, tinggi, sudut);
    }

    public void setLuasPermukaan(double jari, double tinggi, double sudut){
        lLing = super.setLing(jari);
        luasT = (lLing * sudut / 360) - (jari * tinggi / 2);
        luasJ = lLing * sudut / 360;
        luasC = super.setLing(jari) - super.setLing(tinggi);
    }

    public void setVolume(double jari, double tinggi){
        volumeT = lLing * tinggi/3;
    }

    public void setVolume(double jariLuar, double jariDalam, double tinggi){
        volumeC = (super.setLing(jariLuar) - super.setLing(jariDalam)) * tinggi;
    }

    public double getLuasT(){
        return luasT;
    }
    public double getLuasC(){
        return luasC;
    }
    public double getLuasJ(){
        return luasJ;
    }
    public double getVolumeC(){
        return volumeC;
    }
    public double getVolumeT(){
        return volumeT;
    }


}
