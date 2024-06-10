package G3D;
import G2D.Segitiga;

public class Segi3 extends Segitiga {
    protected double volume;
    protected double luas;
    static double lS3;

    public Segi3(double alas, double tinggi, double tinggiLimas){
        this.LuasLimas(alas, tinggiLimas);
        this.VolumeLimas(alas, tinggi, tinggiLimas);
        this.LuasPrisma(alas, tinggi);
        this.VolumePrisma(alas, tinggi, tinggiLimas);
    }

    public double LuasLimas(double alas, double tinggi){
        // luas alas + jumlah luas sisi tegak
        lS3 = super.luasSegi3(alas, tinggi);
        double sisiMiring = Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2));
        luas = lS3 + (0.5 * tinggi * sisiMiring);
        return luas;
    }

    public double VolumeLimas(double alas, double tinggi, double tinggiLimas){
        volume = lS3 * tinggiLimas / 3;
        return volume;
    }

    public double LuasPrisma(double alas, double tinggi){
        // 2 . ((panjang . lebar) + (panjang . tinggi) + (lebar . tinggi)
        lS3 = super.luasSegi3(alas, tinggi);
        luas = lS3 * 2 + super.luasSegi3(alas, tinggi) * 2 + super.luasSegi3(tinggi, tinggi) * 2;
        return luas;
    }

    public double VolumePrisma(double alas, double tinggi, double tinggiPrisma){
        volume = lS3 * tinggiPrisma;
        return volume;
    }

    public double getLuas(){
        return luas;
    }

    public double getVolume(){
        return volume;
    }
}

