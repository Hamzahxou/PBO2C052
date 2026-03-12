class AkunBank {
    // Modifier private agar saldo tidak bisa diakses langsung dari luar class
    private double saldo;
    private String namaPemilik;

    // Constructor untuk inisialisasi objek
    public AkunBank(String namaPemilik, double saldoAwal) {
        // Menggunakan 'this' untuk merujuk ke variabel instance
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }

    // Method public agar bisa diakses di main
    public void cekSaldo() {
        System.out.println("Halo " + this.namaPemilik + ", saldo Anda: Rp" + this.saldo);
    }

    public void tambahSaldo(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("Berhasil setor Rp" + jumlah);
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Membuat objek baru (memanggil constructor)
        AkunBank akunSaya = new AkunBank("Hamzah", 500000);
        
        akunSaya.tambahSaldo(150000);
        akunSaya.cekSaldo();
    }
}
