import java.util.Scanner;

public class Soal1{

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int harga, jumlah, jumlahhrg, diskon, total;
        System.out.println("Harga barang = ");
        harga = input.nextInt();
        System.out.println("Jumlah = ");
        jumlah = input.nextInt();

        jumlahhrg = harga*jumlah;
        diskon = jumlahhrg*15/100;
        total = jumlahhrg-diskon;

    
        System.out.println("Total harga(diskon 15%) = "+total);
    }

}