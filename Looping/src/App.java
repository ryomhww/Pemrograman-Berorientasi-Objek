public class App {
    public static void main(String[] args) throws Exception {
        ////Saya semangat belajar java sebanyak 7 kali
    for (int i = 0; i < 7; i++){
        System.out.println("saya semangat belajar java");
    }
    //buatlah looping deret angka : 1 3 5 7 9 11
    int angka = 1;
    int beda = 2;
    for (int i = 1; i <7; i++){
        System.out.print(angka);
        System.out.print(" ");
        angka += beda;
        beda = 2;
        
    }
    System.out.println(" ");
    //buatlah looping deret angka : 9 6 3 0 -3 -6
    for (int i = 9; i >= -6; i -= 3){
        
        System.out.print(i+" ");
    }
    System.out.println(" ");
    //buatlah looping perkalian
    for (int i = 1; i <= 4; i++) {
        int hasil = 4 * i;
        System.out.println(4+"x"+i+"="+hasil);
    }

}}
