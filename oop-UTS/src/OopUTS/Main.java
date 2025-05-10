package OopUTS;
/**
 * @author Reza syawani
 * /// sabtu 10 mei 2025
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catatan catatan = new Catatan(); // Default kapasitas 10
        int pilihan;

        do {
            System.out.println("\n=== Aplikasi Catatan ===");
            System.out.println("1. Tambah Catatan");
            System.out.println("2. Tampilkan Catatan");
            System.out.println("3. Ubah Catatan");
            System.out.println("4. Hapus Catatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            // Validasi input angka
            while (!scanner.hasNextInt()) {
                System.out.print("Input tidak valid, masukkan angka menu: ");
                scanner.next();
            }
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Bersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan catatan: ");
                    String inputCatatan = scanner.nextLine();
                    catatan.addCatatan(inputCatatan);
                    break;
                case 2:
                    catatan.displayCatatan();
                    break;
                case 3:
                    catatan.displayCatatan();
                    if (catatan.getCount() > 0) {
                        System.out.print("Pilih nomor catatan yang ingin diubah: ");
                        int indexUbah = scanner.nextInt();
                        scanner.nextLine();
                        if (indexUbah >= 1 && indexUbah <= catatan.getCount()) {
                            System.out.print("Masukkan catatan baru: ");
                            String catatanBaru = scanner.nextLine();
                            catatan.updateCatatan(indexUbah - 1, catatanBaru);
                        } else {
                            System.out.println("Nomor catatan tidak valid.");
                        }
                    }
                    break;
                case 4:
                    catatan.displayCatatan();
                    if (catatan.getCount() > 0) {
                        System.out.print("Pilih nomor catatan yang ingin dihapus: ");
                        int indexHapus = scanner.nextInt();
                        scanner.nextLine();
                        if (indexHapus >= 1 && indexHapus <= catatan.getCount()) {
                            catatan.deleteCatatan(indexHapus -1);
                        } else {
                            System.out.println("Nomor catatan tidak valid.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
