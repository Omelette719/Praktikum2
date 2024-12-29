package PRAK203_2310817310012_MuhammadAzwinHakim;

// Employee diubah menjadi Pegawai supaya sama dengan penamaan class yang dipakai di Soal3Main.java
// public class Employee {
public class Pegawai {  
    public String nama;
    // mengubah dari char ke string supaya bisa menyimpan nama lengkap tempat asalnya
    // public char asal; 
    public String asal; 
    public String jabatan;
    // memberikan default umur untuk menyesuaikan dengan output
    // public int umur; 
    public int umur = 17;

    public String getNama() {
        return nama;
    }

    // Pada baris ini terjadi error karena return type method seharusnya String, bukan char
    // public String getAsal() {
    //     return asal; 
    // }
    // Pada baris ini terjadi error karena kurangnya tipe data untuk variabel j di parameter method
    // public void setJabatan() {
    //     this.jabatan = j; 
    // }

    // Perbaikan: Method getAsal harus mengembalikan String, dan setJabatan menerima parameter String
    public String getAsal() {
        return asal;
    }

    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
