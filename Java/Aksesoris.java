class Aksesoris extends Petshop
{
    private String jenis;
    private String bahan;
    private String warna;

    public Aksesoris()
    {
    }

    public Aksesoris(int id, String nama, int hargaProduk, int stokProduk, String jenis, String bahan, String warna)
    {
        super(id, nama, hargaProduk, stokProduk);
        this.jenis = jenis;
        this.bahan = bahan;
        this.warna = warna;
    }

    public String getJenis()
    {
        return jenis;
    }

    public String getBahan()
    {
        return bahan;
    }

    public String getWarna()
    {
        return warna;
    }

    public void setJenis(String jenis)
    {
        this.jenis = jenis;
    }

    public void setBahan(String bahan)
    {
        this.bahan = bahan;
    }

    public void setWarna(String warna)
    {
        this.warna = warna;
    }
}