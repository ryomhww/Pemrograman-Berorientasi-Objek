public class App {

    public static void main(String[] args) {
        //turunan
        Lingkaran lingkaran1 = new Lingkaran(4, "lingkaran 1");
        lingkaran1.getInfo();
        //turunan
        Persegi persegi1 = new Persegi("Persegi 1", 4);
        persegi1.getInfo();
        
        SegitigaSamaKaki segitigaSamaKaki1 = new SegitigaSamaKaki("Segitiga Sama Kaki 1", 5, 3);
        segitigaSamaKaki1.getInfo();

        SegitigaSamaSisi segitigaSamaSisi1 = new SegitigaSamaSisi("Segitiga Sama Sisi 1", 12);
        segitigaSamaSisi1.getInfo();

        SegitigaSikuSiku segitigaSikuSiku1 = new SegitigaSikuSiku("Segitiga Siku Siku 1", 5, 3);
        segitigaSikuSiku1.getInfo();

        SegitigaSembarang segitigaSembarang1 = new SegitigaSembarang("Segitiga Sembarang Normal 1", 16, 12, 10, 30);
        segitigaSembarang1.getInfo();
    }
}