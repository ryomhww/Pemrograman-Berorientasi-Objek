class Persegi{
    private double sisi;
    private double luas;
    private double keliling;

    public Persegi(double sisi) {
        this.sisi = sisi;
        System.out.println("Sisi perseginya adalah: " + sisi);
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
        System.out.println("sisi setelah di set: " + sisi);
    }

    public double getLuas(){
        luas = sisi * sisi;
        return luas;
    }

    public double getKeliling(){
        keliling = sisi * 4;
        return keliling;
    }
}