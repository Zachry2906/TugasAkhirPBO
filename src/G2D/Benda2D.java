package G2D;

import java.util.HashMap;

interface PP {
    public double luasPersegiPanjang(double panjang, double lebar);
}

interface Ling {
    public double luasLingkaran(double jarijari);
}

interface S4 {
    public double setL4(double panjang);
}

interface S3 {
    public double luasSegi3(double alas, double tinggi);
}

interface Benda2Ddoubleerface {
    public void setJg(double alas, double tinggi);
    public void setTr(double atas, double bawah, double tinggi);
    public void setLl(double diagonal1, double diagonal2);
    public void setBk(double diagonal1, double diagonal2);
    public void setEl(double panjang, double lebar);
}

public class Benda2D implements Benda2Ddoubleerface{
    private HashMap <String, Double> luas = new HashMap<String, Double>();
    private HashMap <String, Double> keliling = new HashMap<String, Double>();
    protected Double hasil;
    protected Double kelilingg;

    public Benda2D(double satu, double dua, double tiga){
        this.setJg(satu, tiga);
        this.setTr(satu, dua, tiga);
        this.setLl(satu, dua);
        this.setBk(satu, dua);
        this.setEl(satu, dua);
    }

    public void setJg(double alas, double tinggi){
        //luas jajargenjang = alas * tinggi
        hasil = alas * tinggi;
        kelilingg = alas + alas + tinggi + tinggi;
        luas.put("Jg", hasil);
        keliling.put("Jg", kelilingg);
    }

    public void setTr(double atas, double bawah, double tinggi){
        //luas trapesium = (atas + bawah) * tinggi / 2
        hasil = (atas + bawah) * tinggi / 2;
        luas.put("Tr", hasil);
        kelilingg = atas + bawah + tinggi + tinggi;
        keliling.put("Tr", kelilingg);
    }

    public void setLl(double diagonal1, double diagonal2){
        //luas layang-layang = diagonal1 * diagonal2 / 2
        hasil = diagonal1 * diagonal2 / 2;
        luas.put("Ll", hasil);
        kelilingg = diagonal1 + diagonal1 + diagonal2 + diagonal2;
        keliling.put("Ll", kelilingg);
    }

    public void setBk(double diagonal1, double diagonal2){
        //luas belah ketupat = diagonal1 * diagonal2 / 2
        hasil = diagonal1 * diagonal2 / 2;
        luas.put("Bk", hasil);
        kelilingg = diagonal1 + diagonal1 + diagonal2 + diagonal2;
        keliling.put("Bk", kelilingg);
    }

    public void setEl(double panjang, double lebar){
        //luas elips = π * panjang * lebar
        hasil =  (double) (Math.PI * panjang * lebar);
        luas.put("El", hasil);
        kelilingg = (double) (2 * Math.PI * Math.sqrt((panjang * panjang + lebar * lebar) / 2));
        keliling.put("El", kelilingg);
    }

    public double getLuasTr(){
        return luas.get("Tr");
    }
    public double getLuasLl(){
        return luas.get("Ll");
    }
    public double getLuasBk(){
        return luas.get("Bk");
    }
    public double getLuasEl(){
        return luas.get("El");
    }
    public double getLuasJg(){
        return luas.get("Jg");
    }

    public double getKelilingTr(){
        return keliling.get("Tr");
    }
    public double getKelilingLl(){
        return keliling.get("Ll");
    }
    public double getKelilingBk(){
        return keliling.get("Bk");
    }
    public double getKelilingEl(){
        return keliling.get("El");
    }
    public double getKelilingJg(){
        return keliling.get("Jg");
    }

}

