import java.util.Scanner;

public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int elemen = 0;
        System.out.print("Masukkan jumlah mahasiswa: ");
        elemen = sc.nextInt();

        int nilaiMhs[] = new int[elemen];
        double total = 0, rata2, rataLulus = 0, rataTidakLulus = 0, jmlLulus = 0, jmlTidakLulus = 0, lulus = 0, tidakLulus = 0;


        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Memasukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                tidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        rataLulus = lulus/jmlLulus;
        rataTidakLulus = tidakLulus/jmlTidakLulus;
        
        System.out.println("Rata-rata nilai: " + rata2);
        System.out.println("Rata-rata nilai lulus: " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus: " + rataTidakLulus);
    }
}
