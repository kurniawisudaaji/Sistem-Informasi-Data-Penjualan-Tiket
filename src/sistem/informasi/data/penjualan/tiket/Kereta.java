/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.data.penjualan.tiket;

/**
 *
 * @author KURNIA (1301150068)
 */
public class Kereta {
    private Gerbong[] daftarGerbong;
    private String nama;
    private String jenis;
    private String jurusan;

    public Kereta(Gerbong[] daftarGerbong, String nama, String jenis, String jurusan) {
        this.daftarGerbong = daftarGerbong;
        this.nama = nama;
        this.jenis = jenis;
        this.jurusan = jurusan;
    }

    public Gerbong[] getDaftarGerbong() {
        return daftarGerbong;
    }

    public void setDaftarGerbong(Gerbong[] daftarGerbong) {
        this.daftarGerbong = daftarGerbong;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Kereta{" + "daftarGerbong=" + daftarGerbong + ", nama=" + nama + ", jenis=" + jenis + ", jurusan=" + jurusan + '}';
    }

    
}
