package PRAK203_2310817310012_MuhammadAzwinHakim;

public class Soal3Main {
	public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        
        // Pada baris ini terjadi error karena kurang titik koma (;) setelah p1.nama
        // p1.nama = "Roi"
        // Perbaikan:
        p1.nama = "Roi"; 
        
        // Pada baris ini terjadi error karena tipe data asal pada class Pegawai adalah char
        //pada class Pegawai sudah diperbaiki menjadi string
        p1.asal = "Kingdom of Orvel"; 
        
        // Pada baris ini terjadi error karena setJabatan() tidak menerima parameter
        //pada class Pegawai sudah diperbaiki menjadi setJabatan(String j)
        p1.setJabatan("Assasin"); 

        // Display output
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
	}
}
