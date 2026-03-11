package minggu5;

public class MainLatihan02 {
    public static void main(String[] args) {

        NilaiMahasiswa02[] mahasiswa = {
            new NilaiMahasiswa02("Ahmad", "220101001",2022, 78, 82),
            new NilaiMahasiswa02("Budi", "220101002",2022, 85, 88),
            new NilaiMahasiswa02("Cindy", "220101003",2021, 90, 87),
            new NilaiMahasiswa02("Dian", "220101004",2021, 76, 79),
            new NilaiMahasiswa02("Eko", "220101005",2023, 92, 95),
            new NilaiMahasiswa02("Fajar", "220101006",2020, 88,85),
            new NilaiMahasiswa02("Gina", "220101007",2023, 80, 83),
            new NilaiMahasiswa02("Hadi", "220101008",2020, 82, 84),
        };

        int n = mahasiswa.length;

        System.out.println("=== HASIL LATIHAN PRAKTIKUM ===");

        int maxUTS = NilaiMahasiswa02.maxUTS(mahasiswa, 0, n-1);
        System.out.println("a) Nilai UTS tertinggi (Divide and Conquer): " + maxUTS);

        int minUTS = NilaiMahasiswa02.minUTS(mahasiswa, 0, n-1);
        System.out.println("b) Nilai UTS terendah (Divide and Conquer): " + minUTS);

        double rataUAS = NilaiMahasiswa02.rataUASBF(mahasiswa);
        System.out.printf("c) Rata-rata nilai UAS (Brute Force): %.2f%n", rataUAS);
    }
}