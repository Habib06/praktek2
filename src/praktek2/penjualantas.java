package praktek2;
public class penjualantas {
    int harga_tas;
    int jumlah_barang;

    public penjualantas() {
      harga_tas=200000;
     jumlah_barang=5;
    } 
    
 void cetakInfo(){
    System.out.println("================================");
    System.out.println("harga_tas     :"+harga_tas);
    System.out.println("jumlah_barang     :"+jumlah_barang);
    System.out.println("================================");
}

 Integer hitungPembelian(){
            int total;
            total=harga_tas*jumlah_barang;
            return total;
 }        
             void cetaktotal(){
        System.out.println("Totalnya    = "+hitungPembelian());
    }
}