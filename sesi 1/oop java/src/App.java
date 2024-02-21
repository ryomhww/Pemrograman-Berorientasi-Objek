public class App {
    public static void main(String[] args) throws Exception {
        // Konversi suhu dari reamur ke (celcius, fahrenheit dan kelvin
        double reamur = 80.00;
        


        double celcius = 5.00/4 * reamur;
        double fahrenheit = 9.00/5 + celcius + 32;
        double kelvin = celcius + 273;
        
        

        System.out.println("reamur = " + reamur);
        System.out.println("celcius = " + celcius);
        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("kelvin = " + kelvin);

        int tahun_lahir = 1985;
        int tahun_sekarang = 2024;

        // Hitung umur berdasarkan tahun lahir

        int umur = tahun_sekarang - tahun_lahir;

        System.out.println("Umur sekarang = " + umur);

        // menghitung luas dan keliling segitiga

        int alas = 10;
        int tinggi = 10;
        double sisi = 4.5;

        // rumus mencari luas
        double luas = 0.5 * alas * tinggi;
        // rumus mencari keliling
        double keliling = 3 * sisi;

        // double keliling = alas + 
        System.out.println("luas segitigas = " + luas);  
        System.out.println("keliling segitiga = " + keliling);  
    }
}
