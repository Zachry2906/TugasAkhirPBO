package G2D;

public class PersegiPanjang {
    double hasil;
    double kelilingg;
    public static double panjangg;
    public static double lebarr;

    public PersegiPanjang(double panjang, double lebar) {
        panjangg = panjang;
        lebarr = lebar;
        this.setLuasPer(panjang, lebar);
        this.setKelilingPer(panjang, lebar);
    }

    public PersegiPanjang(){

    }

    public double setLuasPer(double panjang, double lebar){
        hasil = panjang * lebar;
        return hasil;
    }

    public double setKelilingPer(double panjang, double lebar){
        kelilingg = 2 * (panjang + lebar);
        return kelilingg;
    }


    public double getLuas(){
        return hasil;
    }

    public double getKeliling(){
        return kelilingg;
    }
}

