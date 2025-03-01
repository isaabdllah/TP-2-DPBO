#include "Baju.cpp"
#include <iostream>
#include <iomanip>
#include <vector>

using namespace std;

int digitID(int id)
{
    int digit = 0;
    while (id != 0)
    {
        id /= 10;
        digit++;
    }
    return digit;
}

// Longest ID
int longestID(vector<Baju> baju)
{
    int longest = 0;
    for (int i = 0; i < baju.size(); i++)
    {
        if (digitID(baju[i].getId()) > longest)
        {
            longest = digitID(baju[i].getId());
        }
    }
    return longest;
}

// Longest Nama Produk
int longestNamaProduk(vector<Baju> baju)
{
    int longest = 0;
    for (int i = 0; i < baju.size(); i++)
    {
        if (baju[i].getNamaProduk().length() > longest)
        {
            longest = baju[i].getNamaProduk().length();
        }
    }
    return longest;
}

// Longest Harga Produk
int longestHargaProduk(vector<Baju> baju)
{
    int longest = 0;
    for (int i = 0; i < baju.size(); i++)
    {
        if (digitID(baju[i].getHargaProduk()) > longest)
        {
            longest = digitID(baju[i].getHargaProduk());
        }
    }
    return longest;
}

// Longest Stok Produk
int longestStokProduk(vector<Baju> baju)
{
    int longest = 0;
    for (int i = 0; i < baju.size(); i++)
    {
        if (digitID(baju[i].getStokProduk()) > longest)
        {
            longest = digitID(baju[i].getStokProduk());
        }
    }
    return longest;
}

// Longest Jenis
int longestJenis(vector<Baju> baju)
{
    int longest = 0;
    for (int i = 0; i < baju.size(); i++)
    {
        if (baju[i].getJenis().length() > longest)
        {
            longest = baju[i].getJenis().length();
        }
    }
    return longest;
}

// Longest Bahan
int longestBahan(vector<Baju> baju)
{
    int longest = 0;
    for (int i = 0; i < baju.size(); i++)
    {
        if (baju[i].getBahan().length() > longest)
        {
            longest = baju[i].getBahan().length();
        }
    }
    return longest;
}

// Longest Warna
int longestWarna(vector<Baju> baju)
{
    int longest = 0;
    for (int i = 0; i < baju.size(); i++)
    {
        if (baju[i].getWarna().length() > longest)
        {
            longest = baju[i].getWarna().length();
        }
    }
    return longest;
}

// Longest Untuk
int longestUntuk(vector<Baju> baju)
{
    int longest = 0;
    for (int i = 0; i < baju.size(); i++)
    {
        if (baju[i].getUntuk().length() > longest)
        {
            longest = baju[i].getUntuk().length();
        }
    }
    return longest;
}

// Longest Size
int longestSize(vector<Baju> baju)
{
    int longest = 0;
    for (int i = 0; i < baju.size(); i++)
    {
        if (baju[i].getSize().length() > longest)
        {
            longest = baju[i].getSize().length();
        }
    }
    return longest;
}

// Longest Merek
int longestMerek(vector<Baju> baju)
{
    int longest = 0;
    for (int i = 0; i < baju.size(); i++)
    {
        if (baju[i].getMerek().length() > longest)
        {
            longest = baju[i].getMerek().length();
        }
    }
    return longest;
}

void borderTabel(int longestID, int longestNamaProduk, int longestHargaProduk, int longestStokProduk, int longestJenis, int longestBahan, int longestWarna, int longestUntuk, int longestSize, int longestMerek)
{
    cout << "+";
    for (int i = 0; i < longestID + 1; i++)
    {
        cout << "-";
    }
    cout << "+";
    for (int i = 0; i < longestNamaProduk + 1; i++)
    {
        cout << "-";
    }
    cout << "+";
    for (int i = 0; i < longestHargaProduk + 1; i++)
    {
        cout << "-";
    }
    cout << "+";
    for (int i = 0; i < longestStokProduk + 1; i++)
    {
        cout << "-";
    }
    cout << "+";
    for (int i = 0; i < longestJenis + 1; i++)
    {
        cout << "-";
    }
    cout << "+";
    for (int i = 0; i < longestBahan + 1; i++)
    {
        cout << "-";
    }
    cout << "+";
    for (int i = 0; i < longestWarna + 1; i++)
    {
        cout << "-";
    }
    cout << "+";
    for (int i = 0; i < longestUntuk + 1; i++)
    {
        cout << "-";
    }
    cout << "+";
    for (int i = 0; i < longestSize + 1; i++)
    {
        cout << "-";
    }
    cout << "+";
    for (int i = 0; i < longestMerek + 1; i++)
    {
        cout << "-";
    }
    cout << "+\n";
}

void headerTabel(int longestID, int longestNamaProduk, int longestHargaProduk, int longestStokProduk, int longestJenis, int longestBahan, int longestWarna, int longestUntuk, int longestSize, int longestMerek)
{
    cout << "|" << left << setw(longestID) << "ID"
         << " |" << setw(longestNamaProduk) << "Nama Produk"
         << " |" << setw(longestHargaProduk) << "Harga"
         << " |" << setw(longestStokProduk) << "Stok"
         << " |" << setw(longestJenis) << "Jenis"
         << " |" << setw(longestBahan) << "Bahan"
         << " |" << setw(longestWarna) << "Warna"
         << " |" << setw(longestUntuk) << "Untuk"
         << " |" << setw(longestSize) << "Size"
         << " |" << setw(longestMerek) << "Merek"
         << " |\n";
}

void tampilkanBaju(vector<Baju> baju)
{
    if (baju.size() == 0)
    {
        cout << "Data kosong, tidak ada baju di PetShop!\n";
        return;
    }

    // Mencari lebar kolom maksimum
    int idWidth = max(2, longestID(baju));
    int namaProdukWidth = max(10, longestNamaProduk(baju));
    int hargaProdukWidth = max(5, longestHargaProduk(baju));
    int stokProdukWidth = max(4, longestStokProduk(baju));
    int jenisWidth = max(5, longestJenis(baju));
    int bahanWidth = max(5, longestBahan(baju));
    int warnaWidth = max(5, longestWarna(baju));
    int untukWidth = max(5, longestUntuk(baju));
    int sizeWidth = max(4, longestSize(baju));
    int merekWidth = max(5, longestMerek(baju));

    // Mencetak border atas tabel
    borderTabel(idWidth, namaProdukWidth, hargaProdukWidth, stokProdukWidth, jenisWidth, bahanWidth, warnaWidth, untukWidth, sizeWidth, merekWidth);

    // Mencetak header
    headerTabel(idWidth, namaProdukWidth, hargaProdukWidth, stokProdukWidth, jenisWidth, bahanWidth, warnaWidth, untukWidth, sizeWidth, merekWidth);

    // Mencetak border atas tabel
    borderTabel(idWidth, namaProdukWidth, hargaProdukWidth, stokProdukWidth, jenisWidth, bahanWidth, warnaWidth, untukWidth, sizeWidth, merekWidth);

    // Mencetak isi tabel
    for (int i = 0; i < baju.size(); i++)
    {
        cout << "|" << left << setw(idWidth) << baju[i].getId()
             << " |" << setw(namaProdukWidth) << baju[i].getNamaProduk()
             << " |" << setw(hargaProdukWidth) << baju[i].getHargaProduk()
             << " |" << setw(stokProdukWidth) << baju[i].getStokProduk()
             << " |" << setw(jenisWidth) << baju[i].getJenis()
             << " |" << setw(bahanWidth) << baju[i].getBahan()
             << " |" << setw(warnaWidth) << baju[i].getWarna()
             << " |" << setw(untukWidth) << baju[i].getUntuk()
             << " |" << setw(sizeWidth) << baju[i].getSize()
             << " |" << setw(merekWidth) << baju[i].getMerek()
             << " |\n";
    }

    // Mencetak border bawah tabel
    borderTabel(idWidth, namaProdukWidth, hargaProdukWidth, stokProdukWidth, jenisWidth, bahanWidth, warnaWidth, untukWidth, sizeWidth, merekWidth);
}

void tambahBaju(vector<Baju> &baju)
{
    int id, harga, stok;
    string namaProduk, jenis, bahan, warna, untuk, size, merek;

    cout << "Masukkan ID: ";
    cin >> id;
    cin.ignore();

    cout << "Masukkan Nama Produk: ";
    getline(cin, namaProduk);

    cout << "Masukkan Harga: ";
    cin >> harga;

    cout << "Masukkan Stok: ";
    cin >> stok;
    cin.ignore();

    cout << "Masukkan Jenis: ";
    getline(cin, jenis);

    cout << "Masukkan Bahan: ";
    getline(cin, bahan);

    cout << "Masukkan Warna: ";
    getline(cin, warna);

    cout << "Masukkan Untuk: ";
    getline(cin, untuk);

    cout << "Masukkan Size: ";
    getline(cin, size);

    cout << "Masukkan Merek: ";
    getline(cin, merek);

    baju.push_back(Baju(id, namaProduk, harga, stok, jenis, bahan, warna, untuk, size, merek));
}

int main()
{
    vector<Baju> baju;
    baju.push_back(Baju(1, "Sweater Hangat", 75000, 10, "Baju", "Wol", "Merah", "Anjing", "M", "Pawfect"));
    baju.push_back(Baju(2, "Jaket Waterproof", 120000, 5, "Jaket", "Polyester", "Biru", "Anjing", "L", "FurEver"));
    baju.push_back(Baju(3, "Kaos Santai", 50000, 7, "Baju", "Katun", "Kuning", "Kucing", "S", "MeowStyle"));
    baju.push_back(Baju(4, "Hoodie Sporty", 100000, 3, "Hoodie", "Fleece", "Hitam", "Anjing", "XL", "WoofyWear"));
    baju.push_back(Baju(5, "Gaun Elegan", 150000, 2, "Gaun", "Sifon", "Pink", "Kucing", "M", "KittyCouture"));

    int menu;

    while (menu != 3)
    {
        cout << "Menu:\n";
        cout << "1. Tampilkan Baju\n";
        cout << "2. Tambah Baju\n";
        cout << "3. Keluar\n";
        cout << "Pilih menu: ";
        cin >> menu;
        cin.ignore();

        switch (menu)
        {
        case 1:
            tampilkanBaju(baju);
            break;
        case 2:
            tambahBaju(baju);
            break;
        case 3:
            cout << "Terima kasih telah menggunakan program ini!\n";
            break;
        default:
            cout << "Menu tidak valid!\n";
            break;
        }
    }

    return 0;
}