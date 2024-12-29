package PRAK201_2310817310012_MuhammadAzwinHakim;

public class Buah {
	String nama;
    double beratPerBuah;
    double hargaPerBuah;
    double totalBerat;

    public Buah(String nama, double beratPerBuah, double hargaPerBuah, double totalBerat) {
        this.nama = nama;
        this.beratPerBuah = beratPerBuah;
        this.hargaPerBuah = hargaPerBuah;
        this.totalBerat = totalBerat;
    }

    public double hitungHargaSebelumDiskon() {
        return (totalBerat / beratPerBuah) * hargaPerBuah;
    }

    public double hitungDiskon() {
        return (int)(totalBerat / 4) * 0.02 * hitungHargaSebelumDiskon();
    }

    public double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungDiskon();
    }
    
    public void tampilkan() {
        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + beratPerBuah);
        System.out.println("Harga: " + hargaPerBuah);
        System.out.println("Jumlah Beli: " + totalBerat + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", hitungHargaSebelumDiskon());
        System.out.printf("Total Diskon: Rp%.2f\n", hitungDiskon());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n", hitungHargaSetelahDiskon());
        System.out.println();
    }
}
