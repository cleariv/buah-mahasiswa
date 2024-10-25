import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mahasiswa[] = new String[100];
        int nilai[] = new int[100];
        int i = 0;

        Scanner on = new Scanner(System.in);
        String inputData = "y";
        do {
            System.out.print("masukkan nama: ");
            mahasiswa[i] = on.nextLine();

            System.out.print("masukkan nilai: ");
            nilai[i] = on.nextInt();
            on.nextLine();

            System.out.print("input lagi? (y/n) ");
            inputData = on.nextLine();
            i++;
        } while(i<mahasiswa.length && inputData.equalsIgnoreCase("y"));
        on.close();

        System.out.println("\nmasukin jumlah data: " + i);
        System.out.println();

        int w=1;
        for (int o = 0; o < mahasiswa.length; o++) {
            if(mahasiswa[o] != null){
                System.out.println("------------------------------");
                System.out.println("mahasiswa ke: " + (w++));
                System.out.println("nama: " + mahasiswa[o]);
                System.out.println("nilai: " + nilai[o]);
            }
        }

        System.out.println("\ndaftar nilai mahasiswa: ");
        System.out.println("==============================");
        System.out.println("no\tnama\tnilai\tstatus");
        System.out.println("------------------------------");

        w=1;
        for (int g = 0; g < mahasiswa.length; g++) {
            if (mahasiswa[g] != null) {
                String status = (nilai[g] >= 75) ? "lulus" : "tidak Lulus";
                System.out.println((w++) + "\t" + mahasiswa[g] + "\t" + nilai[g] + "\t" + status);
            }
        }

        System.out.println("------------------------------");
        double jumlah=0;
        for (double num : nilai) {
            jumlah += num;
        }

        System.out.println("jumlah nilai: " + jumlah);
        double rata2 = jumlah / i;
        System.out.println("nilai rata-rata: " + rata2);
    }
}