package G2D;

public class Segitiga implements S3{
    protected double hasil;
    protected double kelilingg;
    public static double alass;
    public static double tinggii;

    public Segitiga(double alas, double tinggi){
        alass = alas;
        tinggii = tinggi;
        this.luasSegi3(alas, tinggi);
        this.setKeliling3(alas, tinggi);
    }

    public Segitiga(){

    }

    public double luasSegi3(double alas, double tinggi){
        //luas segitiga = alas * tinggi / 2
        hasil = alas * tinggi / 2;
        return hasil;
    }

    public double setKeliling3(double alas, double tinggi){
        //keliling segitiga = alas + tinggi + sisi miring
        kelilingg = alas + tinggi + Math.sqrt((alas * alas) + (tinggi * tinggi));
        return kelilingg;
    }

    public double getLuas(){
        return hasil;
    }

    public double getKeliling(){
        return kelilingg;
    }
}
