package PRAK201_2310817310012_MuhammadAzwinHakim;

public class Main {

	public static void main(String[] args) {
		Buah apel = new Buah("Apel", 0.4, 7000, 40);
        Buah mangga = new Buah("Mangga", 0.2, 3500, 15);
        Buah alpukat = new Buah("Alpukat", 0.25, 10000, 12);

        apel.tampilkan();
        mangga.tampilkan();
        alpukat.tampilkan();

	}
}
