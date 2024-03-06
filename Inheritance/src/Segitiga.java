public class Segitiga extends BangunDatar {
    protected double alas;
    protected double tinggi;
    protected double sisiA;
    protected double sisiB;
    protected double sisiC;

    public void setSegitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public void hitungLuas() {
        super.luas = Math.round(0.5 * this.alas * this.tinggi * 100.0) / 100.0;
    }

    public void hitungKeliling() {
        super.keliling = this.sisiA + this.sisiB + this.sisiC;
    }
}