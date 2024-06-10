import java.util.Scanner;

import G3D.*;
import G2D.*;
import LuasThread.*;
import KelilingThread.*;

public class Main {
    public static void main(String[] args) {
        boolean ulangb = true;
        do {
            System.out.print("\u001B[2J");
            menu();
            System.out.print("\n");
            System.out.print("Apakah anda ingin mengulang? (y/n) : ");
            Scanner input = new Scanner(System.in);
            String ulang = input.next();
            System.out.print("\n");
            if (ulang.equals("n")){
                ulangb = false;
            } else if (ulang.equals("y")){
                ulangb = true;
            }
        } while (ulangb == true);
    }

    public static void menu(){
        System.out.println("Pilih menu dimensi benda : ");
        System.out.println("1. 2 Dimensi");
        System.out.println("2. 3 Dimensi");
        System.out.print("Pilihan : ");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        System.out.print("\n");

        if (pilihan == 1){
            System.out.println("Pilih menu bangun datar : ");
            System.out.println("1. Lingkaran");
            System.out.println("2. Elips");
            System.out.println("3. Layang layang");
            System.out.println("4. Trapesium");
            System.out.println("5. Jajar genjang");
            System.out.println("6. Belah ketupat");
            System.out.println("7. Persegi");
            System.out.println("8. Persegi panjang");
            System.out.println("9. Segitiga");

            System.out.print("Pilihan : ");
            int pilihan2 = input.nextInt();
            System.out.print("\n");

            if (pilihan2 == 1){
                System.out.print("Masukkan jari-jari : ");
                double jari = input.nextDouble();
            
                double[] parameter = {jari};
                LuasThread luasThread = new LuasThread(parameter, "Lingkaran");
                KelilingThread kelilingThread = new KelilingThread(parameter, "Lingkaran");
            
                luasThread.start();
                kelilingThread.start();
            
                try {
                    luasThread.join();
                    kelilingThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            
                double luas = luasThread.getHasil();
                double keliling = kelilingThread.getHasil();
            
                System.out.println("Luas lingkaran : " + luas);
                System.out.println("Keliling lingkaran : " + keliling);
            } else if (pilihan2 == 2){
                System.out.print("Masukkan jari-jari 1 : ");
                double jari1 = input.nextDouble();
                System.out.print("Masukkan jari-jari 2 : ");
                double jari2 = input.nextDouble();
                double[] parameter = {jari1, jari2};
                LuasThread luasThread = new LuasThread(parameter, "Elips");
                KelilingThread kelilingThread = new KelilingThread(parameter, "Elips");
            
                luasThread.start();
                kelilingThread.start();
            
                try {
                    luasThread.join();
                    kelilingThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            
                double luas = luasThread.getHasil();
                double keliling = kelilingThread.getHasil();
            
                System.out.println("Luas lingkaran : " + luas);
                System.out.println("Keliling lingkaran : " + keliling);
            } else if (pilihan2 == 3){
                System.out.print("Masukkan diagonal 1 : ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2 : ");
                double d2 = input.nextDouble();
                double[] parameter = {d1, d2};
                LuasThread luasThread = new LuasThread(parameter, "Layang Layang");
                KelilingThread kelilingThread = new KelilingThread(parameter, "Layang Layang");
            
                luasThread.start();
                kelilingThread.start();
            
                try {
                    luasThread.join();
                    kelilingThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            
                double luas = luasThread.getHasil();
                double keliling = kelilingThread.getHasil();
            
                System.out.println("Luas lingkaran : " + luas);
                System.out.println("Keliling lingkaran : " + keliling);
            } else if (pilihan2 == 4){
                System.out.print("Masukkan sisi 1 : ");
                double s1 = input.nextDouble();
                System.out.print("Masukkan sisi 2 : ");
                double s2 = input.nextDouble();
                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();
                double[] parameter = {s1, s2, tinggi};
                LuasThread luasThread = new LuasThread(parameter, "Trapesium");
                KelilingThread kelilingThread = new KelilingThread(parameter, "Trapesium");

                luasThread.start();
                kelilingThread.start();

                try {
                    luasThread.join();
                    kelilingThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                double luas = luasThread.getHasil();
                double keliling = kelilingThread.getHasil();

                System.out.println("Luas trapesium : " + luas);
                System.out.println("Keliling trapesium : " + keliling);
            } else if (pilihan2 == 5){
                System.out.print("Masukkan alas : ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();
                double[] parameter = {alas, 0, tinggi};
                LuasThread luasThread = new LuasThread(parameter, "Jajar Genjang");
                KelilingThread kelilingThread = new KelilingThread(parameter, "Jajar Genjang");

                luasThread.start();
                kelilingThread.start();

                try {
                    luasThread.join();
                    kelilingThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                double luas = luasThread.getHasil();
                double keliling = kelilingThread.getHasil();

                System.out.println("Luas jajar genjang : " + luas);
                System.out.println("Keliling jajar genjang : " + keliling);
            } else if (pilihan2 == 6){
                System.out.print("Masukkan diagonal 1 : ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2 : ");
                double d2 = input.nextDouble();
                double[] parameter = {d1, d2};

                LuasThread luasThread = new LuasThread(parameter, "Belah Ketupat");
                KelilingThread kelilingThread = new KelilingThread(parameter, "Belah Ketupat");

                luasThread.start();
                kelilingThread.start();

                try {
                    luasThread.join();
                    kelilingThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                double luas = luasThread.getHasil();
                double keliling = kelilingThread.getHasil();

                System.out.println("Luas belah ketupat : " + luas);
                System.out.println("Keliling belah ketupat : " + keliling);
            } else if (pilihan2 == 7){
                System.out.print("Masukkan sisi : ");
                double sisi = input.nextDouble();
                double[] parameter = {sisi};

                LuasThread luasThread = new LuasThread(parameter, "Persegi");
                KelilingThread kelilingThread = new KelilingThread(parameter, "Persegi");

                luasThread.start();
                kelilingThread.start();

                try {
                    luasThread.join();
                    kelilingThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                double luas = luasThread.getHasil();
                double keliling = kelilingThread.getHasil();

                System.out.println("Luas persegi : " + luas);
                System.out.println("Keliling persegi : " + keliling);
            } else if (pilihan2 == 8){
                System.out.print("Masukkan panjang : ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar : ");
                double lebar = input.nextDouble();
                double[] parameter = {panjang, lebar};

                LuasThread luasThread = new LuasThread(parameter, "Persegi Panjang");
                KelilingThread kelilingThread = new KelilingThread(parameter, "Persegi Panjang");

                luasThread.start();
                kelilingThread.start();

                try {
                    luasThread.join();
                    kelilingThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                double luas = luasThread.getHasil();
                double keliling = kelilingThread.getHasil();

                System.out.println("Luas persegi panjang : " + luas);
                System.out.println("Keliling persegi panjang : " + keliling);
            } else if (pilihan2 == 9){
                System.out.print("Masukkan alas : ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();
                double[] parameter = {alas, tinggi};

                LuasThread luasThread = new LuasThread(parameter, "Segitiga");
                KelilingThread kelilingThread = new KelilingThread(parameter, "Segitiga");

                luasThread.start();
                kelilingThread.start();

                try {
                    luasThread.join();
                    kelilingThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                double luas = luasThread.getHasil();
                double keliling = kelilingThread.getHasil();

                System.out.println("Luas segitiga : " + luas);
                System.out.println("Keliling segitiga : " + keliling);
            }
        } else if (pilihan == 2){

            System.out.println("Pilih menu bangun ruang : ");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Limas Segitiga");
            System.out.println("4. Prisma Segitiga");
            System.out.println("5. Tabung");
            System.out.println("6. Limas Persegi");
            System.out.println("7. Prisma Persegi");
            System.out.println("8. Prisma Persegi Panjang");
            System.out.println("9. Limas Persegi Panjang");
            System.out.println("10. Bola");
            System.out.println("11. Kerucut");
            System.out.println("12. Tembereng");
            System.out.println("13. Juring");
            System.out.println("14. Cincin");
            System.out.println("15. Kerucut Terpancung");

            System.out.print("Pilihan : ");
            int pilihan3 = input.nextInt();
            System.out.print("\n");

            if (pilihan3 == 1){
                Persegi k = null;
                if (Segi4.sisi == 0){
                    System.out.print("Masukkan sisi : ");
                    double sisi = input.nextDouble();
                    k = new Persegi(sisi);
                } else {
                    System.out.print("Apakah anda ingin menggunakan sisi persegi sebelumnya? (y/n) : ");
                    String pilihan4 = input.next();
                    if (pilihan4.equals("y")){
                        k = new Persegi(Segi4.sisi);
                    } else {
                        System.out.print("Masukkan sisi : ");
                        double sisi = input.nextDouble();
                        k = new Persegi(sisi);
                    }
                }
                System.out.println("Luas kubus : " + k.getLuasP());
                System.out.println("Volume kubus : " + k.getVolumeB());
            } else if (pilihan3 == 2){
                PersegiP b = null;
                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();
                if (PersegiPanjang.panjangg == 0){
                    System.out.print("Masukkan lebar : ");
                    double lebar = input.nextDouble();
                    System.out.print("Masukkan panjang : ");
                    double panjang = input.nextDouble();
                    b = new PersegiP(panjang, tinggi, lebar, 0);
                } else {
                    System.out.print("Apakah anda ingin menggunakan sisi persegi panjang sebelumnya? (y/n) : ");
                    String pilihan4 = input.next();
                    if (pilihan4.equals("y")){
                        b = new PersegiP(PersegiPanjang.panjangg, tinggi, PersegiPanjang.lebarr, 0);
                    } else {
                        System.out.print("Masukkan sisi : ");
                        double sisi = input.nextDouble();
                        System.out.print("Masukkan lebar : ");
                        double lebar = input.nextDouble();
                        b = new PersegiP(sisi, tinggi, lebar, 0);
                    }
                }
                System.out.println("Luas balok : " + b.getLuasB());
                System.out.println("Volume balok : " + b.getVolumeB());
            } else if (pilihan3 == 3){
                Segi3 ls = null;
                System.out.print("Masukkan tinggi : ");
                double tinggiLimas = input.nextDouble();
                System.out.print("Masukkan tinggi limas : ");
                if (Segitiga.alass == 0){
                    System.out.print("Masukkan alas : ");
                    double alas = input.nextDouble();
                    System.out.print("Masukkan tinggi limas : ");
                    double tinggi = input.nextDouble();
                    ls = new Segi3(alas, tinggi, tinggiLimas);
                } else {
                    System.out.print("Apakah anda ingin menggunakan alas dan tinggi sebelumnya? (y/n) : ");
                    String pilihan4 = input.next();
                    if (pilihan4.equals("y")){
                        ls = new Segi3(Segitiga.alass, Segitiga.tinggii, tinggiLimas);
                    } else {
                        System.out.print("Masukkan alas : ");
                        double alas = input.nextDouble();
                        System.out.print("Masukkan tinggi ");
                        double tinggi = input.nextDouble();
                        ls = new Segi3(alas, tinggi, tinggiLimas);
                    }
                }
                System.out.println("Luas limas segitiga : " + ls.getLuas());
                System.out.println("Volume limas segitiga : " + ls.getVolume());
            } else if (pilihan3 == 4){
                Segi3 ls = null;
                System.out.print("Masukkan tinggi prisma : ");
                double tinggiPrisma = input.nextDouble();
                System.out.print("Masukkan tinggi prisma : ");
                if (Segitiga.alass == 0){
                    System.out.print("Masukkan alas : ");
                    double alas = input.nextDouble();
                    System.out.print("Masukkan tinggi limas : ");
                    double tinggi = input.nextDouble();
                    ls = new Segi3(alas, tinggi, tinggiPrisma);
                } else {
                    System.out.print("Apakah anda ingin menggunakan alas dan tinggi sebelumnya? (y/n) : ");
                    String pilihan4 = input.next();
                    if (pilihan4.equals("y")){
                        ls = new Segi3(Segitiga.alass, Segitiga.tinggii, tinggiPrisma);
                    } else {
                        System.out.print("Masukkan alas : ");
                        double alas = input.nextDouble();
                        System.out.print("Masukkan tinggi ");
                        double tinggi = input.nextDouble();
                        ls = new Segi3(alas, tinggi, tinggiPrisma);
                    }
                }
                System.out.println("Luas prisma segitiga : " + ls.getLuas());
                System.out.println("Volume prisma segitiga : " + ls.getVolume());
            } else if (pilihan3 == 5){
                Tabung t = null;
                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();
                if (Lingkaran.jari == 0){
                    System.out.print("Masukkan jari-jari : ");
                    double jari = input.nextDouble();
                    t = new Tabung(jari, tinggi);
                } else {
                    System.out.print("Apakah anda ingin menggunakan jari-jari sebelumnya? (y/n) : ");
                    String pilihan4 = input.next();
                    if (pilihan4.equals("y")){
                        t = new Tabung(Lingkaran.jari, tinggi);
                    } else {
                        System.out.print("Masukkan jari-jari : ");
                        double jari = input.nextDouble();
                        t = new Tabung(jari, tinggi);
                    }
                }
                System.out.println("Luas tabung : " + t.getLuas());
                System.out.println("Volume tabung : " + t.getVolume());
            } else if (pilihan3 == 6){
                Persegi l = null;
                if (Segi4.sisi == 0){
                    System.out.print("Masukkan sisi : ");
                    double sisi = input.nextDouble();
                    l = new Persegi(sisi);
                } else {
                    System.out.print("Apakah anda ingin menggunakan sisi persegi sebelumnya? (y/n) : ");
                    String pilihan4 = input.next();
                    if (pilihan4.equals("y")){
                        l = new Persegi(Segi4.sisi);
                    } else {
                        System.out.print("Masukkan sisi : ");
                        double sisi = input.nextDouble();
                        l = new Persegi(sisi);
                    }
                }
                System.out.println("Luas limas persegi : " + l.getLuasLP());
                System.out.println("Volume limas persegi : " + l.getVolumeLP());
            } else if (pilihan3 == 7){
                Persegi l = null;
                if (Segi4.sisi == 0){
                    System.out.print("Masukkan sisi : ");
                    double sisi = input.nextDouble();
                    l = new Persegi(sisi);
                } else {
                    System.out.print("Apakah anda ingin menggunakan sisi persegi sebelumnya? (y/n) : ");
                    String pilihan4 = input.next();
                    if (pilihan4.equals("y")){
                        l = new Persegi(Segi4.sisi);
                    } else {
                        System.out.print("Masukkan sisi : ");
                        double sisi = input.nextDouble();
                        l = new Persegi(sisi);
                    }
                }
                System.out.println("Luas limas persegi : " + l.getLuasPP());
                System.out.println("Volume limas persegi : " + l.getVolumePP());
            } else if (pilihan3 == 8){
                PersegiP pp = null;
                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();
                if (PersegiPanjang.panjangg == 0){
                    System.out.print("Masukkan panjang : ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar : ");
                    double lebar = input.nextDouble();
                    pp = new PersegiP(panjang, lebar, tinggi, tinggi);
                } else {
                    System.out.print("Apakah anda ingin menggunakan panjang dan lebar sebelumnya? (y/n) : ");
                    String pilihan4 = input.next();
                    if (pilihan4.equals("y")){
                        pp = new PersegiP(PersegiPanjang.panjangg, PersegiPanjang.lebarr, tinggi, tinggi);
                    } else {
                        System.out.print("Masukkan panjang : ");
                        double panjang = input.nextDouble();
                        System.out.print("Masukkan lebar : ");
                        double lebar = input.nextDouble();
                        pp = new PersegiP(panjang, lebar, tinggi, tinggi);
                    }}
                System.out.println("Luas prisma persegi panjang : " + pp.getLuasPP());
                System.out.println("Volume prisma persegi panjang : " + pp.getVolumePP());
            } else if (pilihan3 == 9){
                PersegiP pp = null;
                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();
                if (PersegiPanjang.panjangg == 0){
                    System.out.print("Masukkan panjang : ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar : ");
                    double lebar = input.nextDouble();
                    pp = new PersegiP(panjang, lebar, tinggi, tinggi);
                } else {
                    System.out.print("Apakah anda ingin menggunakan panjang dan lebar sebelumnya? (y/n) : ");
                    String pilihan4 = input.next();
                    if (pilihan4.equals("y")){
                        pp = new PersegiP(PersegiPanjang.panjangg, PersegiPanjang.lebarr, tinggi, tinggi);
                    } else {
                        System.out.print("Masukkan panjang : ");
                        double panjang = input.nextDouble();
                        System.out.print("Masukkan lebar : ");
                        double lebar = input.nextDouble();
                        pp = new PersegiP(panjang, lebar, tinggi, tinggi);
                    }}
                System.out.println("Luas prisma persegi panjang : " + pp.getLuasLP());
                System.out.println("Volume prisma persegi panjang : " + pp.getVolumeLP());
            } else if (pilihan3 == 10){
                Bola b = null;
                if (Lingkaran.jari == 0){
                    System.out.print("Masukkan jari-jari : ");
                    double jari = input.nextDouble();
                    b = new Bola(jari);
                } else {
                    System.out.print("Apakah anda ingin menggunakan jari-jari sebelumnya? (y/n) : ");
                    String pilihan4 = input.next();
                    if (pilihan4.equals("y")){
                        b = new Bola(Lingkaran.jari);
                    } else {
                        System.out.print("Masukkan jari-jari : ");
                        double jari = input.nextDouble();
                        b = new Bola(jari);
                    }
                }
                System.out.println("Luas bola : " + b.getLuasBola());
                System.out.println("Volume bola : " + b.getVolumeBola());
            } else if (pilihan3 == 11){
                Kerucut k = null;
                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();
                if (Lingkaran.jari == 0){
                    System.out.print("Masukkan jari-jari : ");
                    double jari = input.nextDouble();
                    k = new Kerucut(jari, tinggi);
                } else {
                    System.out.print("Apakah anda ingin menggunakan jari-jari sebelumnya? (y/n) : ");
                    String pilihan4 = input.next();
                    if (pilihan4.equals("y")){
                        k = new Kerucut(Lingkaran.jari, tinggi);
                    } else {
                        System.out.print("Masukkan jari-jari : ");
                        double jari = input.nextDouble();
                        k = new Kerucut(jari, tinggi);
                    }
                }
                System.out.println("Luas kerucut : " + k.getLuas());
                System.out.println("Volume kerucut : " + k.getVolume());
            } else if (pilihan3 == 12){
                Bolaa t = null;
                System.out.print("Masukkan sudut : ");
                double sudut = input.nextDouble();
                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();
                if (Lingkaran.jari == 0){
                    System.out.print("Masukkan jari-jari : ");
                    double jari = input.nextDouble();
                    t = new Bolaa(jari, tinggi, sudut);
                } else {
                    System.out.print("Apakah anda ingin menggunakan jari-jari sebelumnya? (y/n) : ");
                    String pilihan4 = input.next();
                    if (pilihan4.equals("y")){
                        t = new Bolaa(Lingkaran.jari, tinggi, sudut);
                    } else {
                        System.out.print("Masukkan jari-jari : ");
                        double jari = input.nextDouble();
                        t = new Bolaa(jari, tinggi, sudut);
                    }
                }
                System.out.println("Luas tembereng : " + t.getLuasT());
                System.out.println("Volume tembereng : " + t.getVolumeT());
            } else if (pilihan3 == 13){
                Bolaa t = null;
                System.out.print("Masukkan sudut : ");
                double sudut = input.nextDouble();
                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();
                if (Lingkaran.jari == 0){
                    System.out.print("Masukkan jari-jari : ");
                    double jari = input.nextDouble();
                    t = new Bolaa(jari, tinggi, sudut);
                } else {
                    System.out.print("Apakah anda ingin menggunakan jari-jari sebelumnya? (y/n) : ");
                    String pilihan4 = input.next();
                    if (pilihan4.equals("y")){
                        t = new Bolaa(Lingkaran.jari, tinggi, sudut);
                    } else {
                        System.out.print("Masukkan jari-jari : ");
                        double jari = input.nextDouble();
                        t = new Bolaa(jari, tinggi, sudut);
                    }
                }
                System.out.println("Luas Juring : " + t.getLuasJ());
            } else if (pilihan3 == 14){
                Bolaa t = null;
                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();
                System.out.print("Masukkan jari jari dalam : ");
                double jD = input.nextDouble();
                if (Lingkaran.jari == 0){
                    System.out.print("Masukkan jari luar : ");
                    double jL = input.nextDouble();
                    t = new Bolaa(jL, jD, tinggi);
                } else {
                    System.out.print("Apakah anda ingin menggunakan jari-jari sebelumnya? (y/n) : ");
                    String pilihan4 = input.next();
                    if (pilihan4.equals("y")){
                        t = new Bolaa(Lingkaran.jari, jD, tinggi);
                    } else {
                        System.out.print("Masukkan jari-jari : ");
                        double jari = input.nextDouble();
                        t = new Bolaa(jari, jD, tinggi);
                    }
                }
                System.out.println("Luas cincin : " + t.getLuasC());
                System.out.println("Volume Cincin : " + t.getVolumeC());
            } else if (pilihan3 == 15){
                System.out.print("Masukkan jari-jari atas : ");
                double jariAtas = input.nextDouble();
                System.out.print("Masukkan jari-jari bawah : ");
                double jariBawah = input.nextDouble();
                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();
                System.out.print("Masukkan sisi miring : ");
                double sisimiring= input.nextDouble();
                KerucutTerpancung kt = new KerucutTerpancung(jariAtas, jariBawah, tinggi, sisimiring);
                System.out.println("Luas kerucut terpancung : " + kt.getLuas());
                System.out.println("Volume kerucut terpancung : " + kt.getVolume());
            }

        }
    }
}