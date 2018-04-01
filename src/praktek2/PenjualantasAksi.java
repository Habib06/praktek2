package praktek2;

public class PenjualantasAksi {
     public static void main(String[] args) {
        penjualantas r1 = new penjualantas();

        r1.harga_tas = 1000000;
        r1.jumlah_barang = 5;        
        
         r1.cetakInfo();
          System.out.println("total   =   "+r1.hitungPembelian());
    }
}






