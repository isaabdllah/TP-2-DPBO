public class Petshop {
    private int id;
    private String namaProduk;
    private int hargaProduk;
    private int stokProduk;

    public Petshop() 
    {
    }

    // Constructor
    public Petshop(int id, String nama, int hargaProduk, int stokProduk) {
        this.id = id;
        this.namaProduk = nama;
        this.hargaProduk = hargaProduk;
        this.stokProduk = stokProduk;
    }

    // Getter
    public int getId() 
    {
        return id;
    }

    public String getNama() 
    {
        return namaProduk;
    }

    public int getHargaProduk() 
    {
        return hargaProduk;
    }   

    public int getStokProduk() 
    {
        return stokProduk;
    }

    // Setter
    public void setId(int id) 
    {
        this.id = id;
    }

    public void setNama(String nama) 
    {
        this.namaProduk = nama;
    }

    public void setHargaProduk(int hargaProduk) 
    {
        this.hargaProduk = hargaProduk;
    }

    public void setStokProduk(int stokProduk) 
    {
        this.stokProduk = stokProduk;
    }

}
