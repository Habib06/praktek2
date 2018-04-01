package praktek2;

public class PenjualantasAksi {
     public static void main(String[] args) {
        penjualantas r1 = new penjualantas();

        r1.harga_tas = 1000000;
        r1.jumlah_barang = 5;        
        
         r1.cetakInfo();
          System.out.println("total   =   "+r1.hitungPembelian());
          r1.cetaktotal();
          
        penjualantas r2 = new penjualantas();
        r2.cetakInfo();
        r2.cetakInfo();
        
        penjualantas r3 = new penjualantas(500000,2);
        r3.cetakInfo();
        r3.cetakInfo();
    }
    s
}






