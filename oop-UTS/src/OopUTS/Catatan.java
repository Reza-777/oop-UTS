package OopUTS;

public class Catatan {
    private String[] catatanList;
    private int count;

    // Constructor dengan overloading (default size 10)
    public Catatan() {
        this(10);
    }

    public Catatan(int size) {
        catatanList = new String[size];
        count = 0;
    }

    // Menambah catatan
    public void addCatatan(String catatan) {
        if (count < catatanList.length) {
            catatanList[count] = catatan;
            count++;
            System.out.println("Catatan berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas penyimpanan catatan penuh.");
        }
    }

    // Menampilkan semua catatan
    public void displayCatatan() {
        if (count == 0) {
            System.out.println("Tidak ada catatan.");
            return;
        }
        System.out.println("Daftar catatan:");
        for (int i = 0; i < count; i++) {
            System.out.printf("%d. %s%n", i + 1, catatanList[i]);
        }
    }

    // Mengubah catatan pada index tertentu
    public void updateCatatan(int index, String catatan) {
        if (index >= 0 && index < count) {
            catatanList[index] = catatan;
            System.out.println("Catatan berhasil diubah.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    // Menghapus catatan pada index tertentu
    public void deleteCatatan(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < count -1; i++) {
                catatanList[i] = catatanList[i + 1];
            }
            catatanList[count - 1] = null; // Hilangkan referensi
            count--;
            System.out.println("Catatan berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    // Mendapatkan jumlah catatan saat ini
    public int getCount() {
        return count;
    }
}
