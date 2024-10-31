import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
    
        System.out.print("Masukkan nilai mahasiswa ke-1: ");
        nilaiMahasiswa[0] = sc.nextInt();
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        int totalNilai = nilaiMahasiswa[0];

        for (int i = 1; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();

            totalNilai += nilaiMahasiswa[i];

            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }
        double rataRata = (double) totalNilai / jumlahMahasiswa;
        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }
        System.out.println("Nilai tertinggi mahasiswa adalah: " + nilaiTertinggi);
        System.out.println("Nilai terendah mahasiswa adalah: " + nilaiTerendah);
        System.out.println("Rata-rata nilai mahasiswa adalah: " + rataRata);
    }
}
