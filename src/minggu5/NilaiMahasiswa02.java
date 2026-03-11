package minggu5;

public class NilaiMahasiswa02 {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    NilaiMahasiswa02(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Mencari nilai UTS tertinggi (Divide and Conquer)
    static int maxUTS(NilaiMahasiswa02[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }

        int mid = (l + r) / 2;

        int leftMax = maxUTS(arr, l, mid);
        int rightMax = maxUTS(arr, mid + 1, r);

        return Math.max(leftMax, rightMax);
    }

    // Mencari nilai UTS terendah (Divide and Conquer)
    static int minUTS(NilaiMahasiswa02[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }

        int mid = (l + r) / 2;

        int leftMin = minUTS(arr, l, mid);
        int rightMin = minUTS(arr, mid + 1, r);

        return Math.min(leftMin, rightMin);
    }

    // Menghitung rata-rata UAS (Brute Force)
    static double rataUASBF(NilaiMahasiswa02[] arr) {
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUAS;
        }

        return total / arr.length;
    }
}