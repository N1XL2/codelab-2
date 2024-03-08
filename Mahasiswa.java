import java.util.Scanner;

public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiya malang");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean selesai = false;
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[100];
        int jumlahMahasiswa = 0;

        while (!selesai) {
            System.out.println("Menu :");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Choose Option (1-3) : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Input data mahasiswa:");
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    while (nim.length() != 15) {
                        System.out.println("Panjang NIM harus 15 angka. Silakan input kembali.");
                        System.out.print("NIM: ");
                        nim = scanner.nextLine();
                    }
                    System.out.print("Jurusan: ");
                    String jurusan = scanner.nextLine();
                    daftarMahasiswa[jumlahMahasiswa] = new Mahasiswa(nama, nim, jurusan);
                    jumlahMahasiswa++;
                    break;
                case 2:
                    System.out.println("\nData mahasiswa:");
                    Mahasiswa.tampilUniversitas();
                    for (int i = 0; i < jumlahMahasiswa; i++) {
                        daftarMahasiswa[i].tampilDataMahasiswa();
                    }
                    break;
                case 3:
                    selesai = true;
                    System.out.println("Hasta la vista !!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        }
        scanner.close();
    }
}
