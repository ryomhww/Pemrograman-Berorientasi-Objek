public class App {

    public static void main(String[] args) {
        Persegi persegiA = new Persegi(15);
        double kellingPersegi = persegiA.getKeliling();
        double luasPersegi = persegiA.getLuas();

        System.out.println("Keliling Persegi:" + kellingPersegi);
        System.out.println("Luas Persegi: " + luasPersegi + "\n");

        persegiA.setSisi(5);
        double kellingPersegiset = persegiA.getKeliling();
        double luasPersegiset = persegiA.getLuas();
        System.out.println("Keliling Persegi: " + kellingPersegiset);
        System.out.println("Luas Persegi: " + luasPersegiset + "\n");


        Books book1 = new Books("asep", "coding", 20000, 1);
        Books book2 = new Books("juldi", "IoT", 30000, 2);
        
        double totalPrice = book1.buyBooks(1) + book2.buyBooks(2);
        System.out.println("\n" + "Total Harga yang harus dibayar Rp." + totalPrice);
    }
}