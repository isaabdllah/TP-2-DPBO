#include <iostream>
#include <iomanip>
using namespace std;

class PetShop
{
private:
    int id;
    string namaProduk;
    int hargaProduk;
    int stokProduk;

public:


    PetShop()
    {
    }


    PetShop(int id, string namaProduk, int hargaProduk, int stokProduk)
    {
        this->id = id;
        this->namaProduk = namaProduk;
        this->hargaProduk = hargaProduk;
        this->stokProduk = stokProduk;
    }
    

    // Getter & Setter
    int getId()
    {
        return this->id;
    }

    void setId(int id)
    {
        this->id = id;
    }

    string getNamaProduk()
    {
        return this->namaProduk;
    }

    void setNamaProduk(string namaProduk)
    {
        this->namaProduk = namaProduk;
    }

    int getHargaProduk()
    {
        return this->hargaProduk;
    }

    void setHargaProduk(int hargaProduk)
    {
        this->hargaProduk = hargaProduk;
    }

    int getStokProduk()
    {
        return this->stokProduk;
    }

    void setStokProduk(int stokProduk)
    {
        this->stokProduk = stokProduk;
    }

    // getJumlahProduk
    int getJumlahProduk()
    {
        return 0;
    }

    
    ~PetShop()
    {
    }
};
