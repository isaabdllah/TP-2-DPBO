class Petshop:
    def __init__(this, id=0, namaProduk="", hargaProduk=0, stokProduk=0):
        this.id = id
        this.namaProduk = namaProduk
        this.hargaProduk = hargaProduk
        this.stokProduk = stokProduk
        
    # Setter & Getter
    def get_id(this):
        return this.id
    
    def set_id(this, id):
        this.id = id
        
    def get_namaProduk(this):
        return this.namaProduk
    
    def set_namaProduk(this, namaProduk):
        this.namaProduk = namaProduk
        
    def get_hargaProduk(this):
        return this.hargaProduk
    
    def set_hargaProduk(this, hargaProduk):
        this.hargaProduk = hargaProduk
        
    def get_stokProduk(this):
        return this.stokProduk
    
    def set_stokProduk(this, stokProduk):
        this.stokProduk = stokProduk

