package G3D;
import java.lang.Math;

public class KerucutTerpancung extends Kerucut{
    private double volumeKT;
    private double luasPermukaanKT;
    static double lb;
    static double la;

    public KerucutTerpancung(double jariAtas,  double jariBawah, double tinggi, double miring){
        this.setLuas(jariAtas, jariBawah, miring);
        this.setVolume(jariAtas, jariBawah, tinggi);
    }

    public void setLuas(double jariAtas, double jariBawah, double miring){
        la = super.setLing(jariAtas);
        lb = super.setLing(jariBawah);
        luasPermukaanKT = la + lb + miring;
    }

    public double setVolume(double jariAtas, double jariBawah, double tinggi){
        volumeKT = (1/3 * 3.14 * tinggi) * ((jariBawah*jariBawah) + (jariBawah*jariAtas) + (jariAtas * jariAtas));
        return volumeKT;
    }

    @Override
    public double getLuas(){
        return luasPermukaanKT;
    }

    @Override
    public double getVolume(){
        return volumeKT;
    }
}
