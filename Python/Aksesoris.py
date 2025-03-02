from Petshop import Petshop

class Aksesoris(Petshop):
    def __init__(this):
        this.jenis = ""
        this.bahan = ""
        this.warna = ""
        
    # Setter & Getter
    def get_jenis(this):
        return this.jenis
    
    def set_jenis(this, jenis):
        this.jenis = jenis
        
    def get_bahan(this):
        return this.bahan
    
    def set_bahan(this, bahan):
        this.bahan = bahan
        
    def get_warna(this):
        return this.warna
    
    def set_warna(this, warna):
        this.warna = warna