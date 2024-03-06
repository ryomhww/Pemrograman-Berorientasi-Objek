public class Persegi extends BangunDatar {
    protected double sisi;

    public Persegi(String name, double sisi) {
        super.setNama(name);
        this.sisi = sisi;
        hitungLuas();
        hitungKeliling();
    }

    public void hitungLuas() {
        super.luas = this.sisi * this.sisi;
    }

    public void hitungKeliling() {
        super.keliling = this.sisi * 4;
    }
}