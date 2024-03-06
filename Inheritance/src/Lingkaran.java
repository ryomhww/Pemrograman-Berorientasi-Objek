public class Lingkaran extends BangunDatar{
    protected double r;

    public Lingkaran(double r, String name){
        super.setNama(name);
        this.r = r;
        hitungLuas();
        hitungKeliling();
    }
    
    public void hitungLuas() {
        super.luas = Math.round(Math.PI * 100.0) / 100.0 * this.r * this.r;
    }

    public void hitungKeliling() {
        super.keliling = 2 * Math.round(Math.PI * 100.0) / 100.0 * this.r;
    }
}