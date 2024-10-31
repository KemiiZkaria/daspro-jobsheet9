import java.util.Scanner;

public class SearchNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int elemen;
        System.out.print("Masukkan jumlah mahasiswa: ");
        elemen = sc.nextInt();

        int arrNilai[] = new int[elemen];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i+1;
                break;
            }
        }
        System.out.println();
        if (hasil != 0) {
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan dalam array");
        }
        System.out.println();
    }
}
