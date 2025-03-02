from Aksesoris import Aksesoris

class Baju(Aksesoris):
    def __init__(this, id=0, nama_produk="", harga_produk=0, stok_produk=0, jenis="", bahan="", warna="", untuk="", size="", merek=""):
        super().__init__(id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna) 
        this.untuk = untuk
        this.size = size
        this.merek = merek
        
    # Setter & Getter
    def get_untuk(this):
        return this.untuk
    
    def set_untuk(this, untuk):
        this.untuk = untuk
        
    def get_size(this):
        return this.size
    
    def set_size(this, size):
        this.size = size
        
    def get_merek(this):
        return this.merek
    
    def set_merek(this, merek):
        this.merek = merek
        
    def addBaju(this, id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna, untuk, size, merek):
        this.set_id(id)
        this.set_namaProduk(nama_produk)
        this.set_hargaProduk(harga_produk)
        this.set_stokProduk(stok_produk)
        this.set_jenis(jenis)
        this.set_bahan(bahan)
        this.set_warna(warna)
        this.set_untuk(untuk)
        this.set_size(size)
        this.set_merek(merek)

        