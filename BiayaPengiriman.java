import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan volume barang (cm^3): ");
        double volume = input.nextDouble();


        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        double biayaPengiriman = berat * biayaPerKg;


        if (volume > 100) {
            biayaPengiriman += 50000;
        }

        System.out.println("Biaya total pengiriman: Rp " + biayaPengiriman);
    }
}
