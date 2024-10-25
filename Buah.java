import java.util.ArrayList;
import java.util.Scanner;

public class Buah {

    public static void main(String[] args) {
        Scanner buahEnak = new Scanner(System.in);

        ArrayList<String> buah = new ArrayList<>();
        ArrayList<Integer> harga = new ArrayList<>();
        ArrayList<Integer> totalharga = new ArrayList<>();

       buah.add("apel");
        harga.add(5000);
       buah.add("jeruk");
        harga.add(2500);
       buah.add("mangga");
        harga.add(2500);
       buah.add("duku");
        harga.add(10000);
       buah.add("semangka");
        harga.add(25000);

        for (int i = 0 ; i < buah.size(); i++) {
            totalharga.add(0); 
        }

        int total = 0;

        while (true) {
            System.out.print("pilih buah dinomer 0-4: ");
            int belanjabuah =buahEnak.nextInt();

            if (belanjabuah < 0 || belanjabuah >= buah.size()) {
                System.out.println("ih gagal");
                continue;
            }

            System.out.print("masukan jumlah buah: ");
            int quantity =buahEnak.nextInt();
            totalharga.set(belanjabuah, totalharga.get(belanjabuah) + quantity);

            total += harga.get(belanjabuah) * quantity;

            System.out.print("input lagi? (y/n): ");
            String input = buahEnak.next();

            if (!input.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("daftar belanja:");
        System.out.println("=================================================================");
        System.out.println("no.\tnama buah\tjumlah\t\tharga\t\tjubtotal");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i <buah.size(); i++) {
            if (totalharga.get(i) > 0) {
                System.out.printf("%s.\t%s\t%s\t\t%s\t\t%s\n", i + 1, buah.get(i), totalharga.get(i), harga.get(i), harga.get(i) * totalharga.get(i));
            }
        }
        System.out.println("=================================================================");

        System.out.println("total:\t\t\t" + total);
        int discount = (int) (total * 0.15);
        System.out.println("discount (15%):\t\t" + discount);
        System.out.println("total bayar:\t\t"+ (total - discount));

       buahEnak.close();
    }
}