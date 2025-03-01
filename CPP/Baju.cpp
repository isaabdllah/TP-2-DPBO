#include "Aksesoris.cpp"

class Baju : public Aksesoris
{
private:
    string untuk;
    string size;
    string Merek;

public:

    Baju()
    {
    }

    Baju(int id, string namaProduk, int hargaProduk, int stokProduk, string jenis, string bahan, string warna, string untuk, string size, string Merek)
    {
        setId(id);  // Pakai setter
        setNamaProduk(namaProduk);
        setHargaProduk(hargaProduk);
        setStokProduk(stokProduk);
        setJenis(jenis);
        setBahan(bahan);
        setWarna(warna);
        this->untuk = untuk;
        this->size = size;
        this->Merek = Merek;
    }

    string getUntuk()
    {
        return untuk;
    }

    void setUntuk(string untuk)
    {
        this->untuk = untuk;
    }

    string getSize()
    {
        return size;
    }

    void setSize(string size)
    {
        this->size = size;
    }

    string getMerek()
    {
        return Merek;
    }

    void setMerek(string Merek)
    {
        this->Merek = Merek;
    }

    // Destructor
    ~Baju()
    {
    }
    
};