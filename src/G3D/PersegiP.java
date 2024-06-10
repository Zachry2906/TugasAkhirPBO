package G3D;
import G2D.PersegiPanjang;

import java.util.HashMap;
import java.util.logging.Handler;

public class PersegiP extends PersegiPanjang {
    private HashMap <String, Double> luasPermukaan = new HashMap<String, Double>();
    private HashMap <String, Double> volume = new HashMap<String, Double>();


    static double lP4;
    static double LimasPersegiPanjang;
    static double PrismaPersegiPanjang;
    static double balok;

    public PersegiP(double panjang, double lebar, double tinggi, double tinggiPrisma){
        this.lP4 = panjang * lebar;
        this.setLuas(panjang, lebar, tinggi, tinggiPrisma);
        this.setVolume(panjang, lebar, tinggi, tinggiPrisma);
    }

    public void setLuas(double panjang, double lebar, double tinggi, double tinggiPrisma){
        luasPermukaan.put("Balok", 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi));
        luasPermukaan.put("Limas", 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi) + panjang * lebar);
        luasPermukaan.put("Prisma", 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi) + 2 * panjang * lebar);
    }

    public void setVolume(double panjang, double lebar, double tinggi, double tinggiPrisma){
        volume.put("Balok", lP4 * tinggi);
        volume.put("Limas", lP4 * tinggi / 3);
        volume.put("Prisma", lP4 * tinggiPrisma);
    }


    public double getLuasB(){
        return luasPermukaan.get("Balok");
    }
    public double getLuasPP(){
        return luasPermukaan.get("Limas");
    }
    public double getLuasLP(){
        return luasPermukaan.get("Prisma");
    }
    public double getVolumeB(){
        return volume.get("Balok");
    }
    public double getVolumeLP(){
        return volume.get("Limas");
    }
    public double getVolumePP(){
        return volume.get("Prisma");
    }
}
