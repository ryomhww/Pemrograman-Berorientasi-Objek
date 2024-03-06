public class SegitigaSembarang extends Segitiga{
    double alas;
    double sisiB;
    double sisiC;
    double sudut;

    public SegitigaSembarang(String name, double alas, double sisiB, double sisiC, double sudut) {
        super.setNama(name);

        this.alas = alas;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.sudut = sudut;

        super.setSegitiga(alas, 0, alas, sisiB, sisiC);
        
        this.hitungLuas();
        hitungKeliling();
    }

    @Override
    public void hitungLuas() {
        super.luas = 0.5 * this.alas * this.sisiB * Math.round(Math.sin(Math.toRadians(this.sudut)) * 100.0) / 100.0;
    }
}