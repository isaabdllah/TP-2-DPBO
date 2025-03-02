class Baju extends Aksesoris
{
    private String untuk;
    private String size;
    private String Merek;

    public Baju()
    {
    }

    public Baju(int id, String nama, int hargaProduk, int stokProduk, String jenis, String bahan, String warna, String untuk, String size, String Merek)
    {
        super(id, nama, hargaProduk, stokProduk, jenis, bahan, warna);
        this.untuk = untuk;
        this.size = size;
        this.Merek = Merek;
    }

    public String getUntuk()
    {
        return untuk;
    }

    public String getSize()
    {
        return size;
    }

    public String getMerek()
    {
        return Merek;
    }

    public void setUntuk(String untuk)
    {
        this.untuk = untuk;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public void setMerek(String Merek)
    {
        this.Merek = Merek;
    }
}