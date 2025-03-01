#include "PetShop.cpp"


class Aksesoris : public PetShop
{
private:
    string jenis;
    string bahan;
    string warna;

public:
    Aksesoris()
    {
    }

    Aksesoris(int id, string namaProduk, int hargaProduk, int stokProduk, string jenis, string bahan, string warna)
    {
        setId(id);  // Pakai setter
        setNamaProduk(namaProduk);
        setHargaProduk(hargaProduk);
        setStokProduk(stokProduk);
        this->jenis = jenis;
        this->bahan = bahan;
        this->warna = warna;
    }

    string getJenis()
    {
        return jenis;
    }

    void setJenis(string jenis)
    {
        this->jenis = jenis;
    }

    string getBahan()
    {
        return bahan;
    }

    void setBahan(string bahan)
    {
        this->bahan = bahan;
    }

    string getWarna()
    {
        return warna;
    }

    void setWarna(string warna)
    {
        this->warna = warna;
    }

    // Destructor
    ~Aksesoris()
    {
    }

};
