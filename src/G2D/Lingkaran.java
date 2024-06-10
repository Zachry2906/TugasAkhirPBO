package G2D;

public class Lingkaran{
    private double luas;
    private double keliling;
    public static double jari;

    public Lingkaran(double jarijari){
       jari = jarijari;
        this.setLing(jarijari);
        this.setKeliling(jarijari);
    }

    public Lingkaran() {
        // Konstruktor tanpa parameter
    }

    public double setLing(double jarijari){
        this.luas = (double) (Math.PI * jarijari * jarijari);
        return this.luas;
    }
    

    public double setKeliling(double jarijari){
        this.keliling =  (double) (2 * Math.PI * jarijari);
        return this.keliling;
    }

    public double getLingkaran(){
        return this.luas;
    }

    public double getKeliling(){
        return this.keliling;
    }
}
