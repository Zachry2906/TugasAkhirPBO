package KelilingThread;

import G2D.Benda2D;
import G2D.Lingkaran;
import G2D.PersegiPanjang;
import G2D.Segi4;
import G2D.Segitiga;

public class KelilingThread extends Thread{
        private final double[] p;
    private final String jenisbangun;
    private double hasil;

    public KelilingThread(double[] parameter, String jenisbangun) {
        p = parameter;
        this.jenisbangun = jenisbangun;
    }

    @Override
    public void run() {
        if (jenisbangun.equals("Lingkaran")) {
            Lingkaran k = new Lingkaran(p[0]);
            hasil = k.getLingkaran();
        } else if (jenisbangun.equals("Elips")) {
            Benda2D el = new Benda2D(p[0], p[1], 0);
            hasil = el.getKelilingEl();
        } else if (jenisbangun.equals("Segitiga")) {
            Segitiga s = new Segitiga(p[0], p[1]);
            hasil = s.getKeliling();
        } else if (jenisbangun.equals("Persegi")) {
            Segi4 p = new Segi4(this.p[0]);
            hasil = p.getKeliling();
        } else if (jenisbangun.equals("Persegi Panjang")) {
            PersegiPanjang pp = new PersegiPanjang(this.p[0], this.p[1]);
            hasil = pp.getKeliling();
        } else if (jenisbangun.equals("Jajar Genjang")) {
            Benda2D jg = new Benda2D(this.p[0], 0, this.p[1]);
            hasil = jg.getKelilingJg();
        } else if (jenisbangun.equals("Trapesium")) {
            Benda2D t = new Benda2D(this.p[0], this.p[1], this.p[2]);
            hasil = t.getKelilingTr();
        } else if (jenisbangun.equals("Layang Layang")) {
            Benda2D ll = new Benda2D(this.p[0], this.p[1], 0);
            hasil = ll.getKelilingLl();
        } else if (jenisbangun.equals("Belah Ketupat")) {
            Benda2D bk = new Benda2D(this.p[0], this.p[1], 0);
            hasil = bk.getKelilingBk();
        }
    }

    public double getHasil() {
        return hasil;
    }
}
