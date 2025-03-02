
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    
    private static ArrayList<Baju> daftarProduk = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    // digit ID

    public static int digitID(int id) 
    {
        int digit = 0;
        while (id != 0) {
            id /= 10;
            digit++;
        }
        return digit;
    }

    // cari longest ID
    public static int longestID() 
    {
        int longest = 0;
        for (Baju baju : daftarProduk) {
            if (digitID(baju.getId()) > longest) {
                longest = digitID(baju.getId());
            }
        }
        return longest;
    }

    // cari longest nama
    public static int longestNama() 
    {
        int longest = 0;
        for (Baju baju : daftarProduk) {
            if (baju.getNama().length() > longest) {
                longest = baju.getNama().length();
            }
        }
        return longest;
    }

    // cari longest harga
    public static int longestHarga() 
    {
        int longest = 0;
        for (Baju baju : daftarProduk) {
            if (digitID(baju.getHargaProduk()) > longest) {
                longest = digitID(baju.getHargaProduk());
            }
        }
        return longest;
    }

    // cari longest stok
    public static int longestStok() 
    {
        int longest = 0;
        for (Baju baju : daftarProduk) {
            if (digitID(baju.getStokProduk()) > longest) {
                longest = digitID(baju.getStokProduk());
            }
        }
        return longest;
    }

    // cari longest jenis
    public static int longestJenis() 
    {
        int longest = 0;
        for (Baju baju : daftarProduk) {
            if (baju.getJenis().length() > longest) {
                longest = baju.getJenis().length();
            }
        }
        return longest;
    }

    // cari longest bahan
    public static int longestBahan() 
    {
        int longest = 0;
        for (Baju baju : daftarProduk) {
            if (baju.getBahan().length() > longest) {
                longest = baju.getBahan().length();
            }
        }
        return longest;
    }

    // cari longest warna
    public static int longestWarna() 
    {
        int longest = 0;
        for (Baju baju : daftarProduk) {
            if (baju.getWarna().length() > longest) {
                longest = baju.getWarna().length();
            }
        }
        return longest;
    }

    // cari longest untuk
    public static int longestUntuk() 
    {
        int longest = 0;
        for (Baju baju : daftarProduk) {
            if (baju.getUntuk().length() > longest) {
                longest = baju.getUntuk().length();
            }
        }
        return longest;
    }

    // cari longest size
    public static int longestSize() 
    {
        int longest = 0;
        for (Baju baju : daftarProduk) {
            if (baju.getSize().length() > longest) {
                longest = baju.getSize().length();
            }
        }
        return longest;
    }

    // cari longest merek
    public static int longestMerek() 
    {
        int longest = 0;
        for (Baju baju : daftarProduk) {
            if (baju.getMerek().length() > longest) {
                longest = baju.getMerek().length();
            }
        }
        return longest;
    }

    // Border tabel
    public static void borderTabel(int longestID, int longestNama, int longestHarga, int longestStok, int longestJenis, int longestBahan, int longestWarna, int longestUntuk, int longestSize, int longestMerek) 
    {
        System.out.print("+");
        // Jika ID terpanjang kurang dari 2, maka tambahkan 3 line
        if (longestID < 2) 
        {
            for (int i = 0; i < 3; i++) 
            {
                System.out.print("-");
            }
        } 
        else 
        {
            for (int i = 0; i < longestID + 1; i++) 
            {
                System.out.print("-");
            }
        }
        System.out.print("+");
        // Jika Nama terpanjang kurang dari 4, maka tambahkan 5 line
        if (longestNama < 4) 
        {
            for (int i = 0; i < 5; i++) 
            {
                System.out.print("-");
            }
        } 
        else 
        {
            for (int i = 0; i < longestNama + 1; i++) 
            {
                System.out.print("-");
            }
        }
        System.out.print("+");
        // Jika Harga terpanjang kurang dari 5, maka tambahkan 6 line
        if (longestHarga < 5) 
        {
            for (int i = 0; i < 6; i++) 
            {
                System.out.print("-");
            }
        } 
        else 
        {
            for (int i = 0; i < longestHarga + 1; i++) 
            {
                System.out.print("-");
            }
        }
        System.out.print("+");
        // Jika Stok terpanjang kurang dari 4, maka tambahkan 5 line
        if (longestStok < 4) 
        {
            for (int i = 0; i < 5; i++) 
            {
                System.out.print("-");
            }
        } 
        else 
        {
            for (int i = 0; i < longestStok + 1; i++) 
            {
                System.out.print("-");
            }
        }
        System.out.print("+");
        // Jika Jenis terpanjang kurang dari 5, maka tambahkan 6 line
        if (longestJenis < 5) 
        {
            for (int i = 0; i < 6; i++) 
            {
                System.out.print("-");
            }
        } 
        else 
        {
            for (int i = 0; i < longestJenis + 1; i++) 
            {
                System.out.print("-");
            }
        }
        System.out.print("+");
        // Jika Bahan terpanjang kurang dari 5, maka tambahkan 6 line
        if (longestBahan < 5) 
        {
            for (int i = 0; i < 6; i++) 
            {
                System.out.print("-");
            }
        } 
        else 
        {
            for (int i = 0; i < longestBahan + 1; i++) 
            {
                System.out.print("-");
            }
        }
        System.out.print("+");
        // Jika Warna terpanjang kurang dari 5, maka tambahkan 6 line
        if (longestWarna < 5) 
        {
            for (int i = 0; i < 6; i++) 
            {
                System.out.print("-");
            }
        } 
        else 
        {
            for (int i = 0; i < longestWarna + 1; i++) 
            {
                System.out.print("-");
            }
        }
        System.out.print("+");
        // Jika Untuk terpanjang kurang dari 5, maka tambahkan 6 line
        if (longestUntuk < 5) 
        {
            for (int i = 0; i < 6; i++) 
            {
                System.out.print("-");
            }
        } 
        else 
        {
            for (int i = 0; i < longestUntuk + 1; i++) 
            {
                System.out.print("-");
            }
        }
        System.out.print("+");
        // Jika Size terpanjang kurang dari 4, maka tambahkan 5 line
        if (longestSize < 4) 
        {
            for (int i = 0; i < 5; i++) 
            {
                System.out.print("-");
            }
        } 
        else 
        {
            for (int i = 0; i < longestSize + 1; i++) 
            {
                System.out.print("-");
            }
        }
        System.out.print("+");
        // Jika Merek terpanjang kurang dari 5, maka tambahkan 6 line
        if (longestMerek < 5) 
        {
            for (int i = 0; i < 6; i++) 
            {
                System.out.print("-");
            }
        } 
        else 
        {
            for (int i = 0; i < longestMerek + 1; i++) 
            {
                System.out.print("-");
            }
        }    
        System.out.println("+");
    }

    // Header tabel
    public static void headerTabel(int longestID, int longestNama, int longestHarga, int longestStok, int longestJenis, int longestBahan, int longestWarna, int longestUntuk, int longestSize, int longestMerek) 
    {
        System.out.print("|ID");
        // Jika ID terpanjang kurang dari 2, maka tambahkan 1 spasi
        if (longestID < 2) 
        {
            System.out.print(" ");
        }
        else 
        {
            for (int i = 0; i < longestID - 1; i++) 
            {
                System.out.print(" ");
            }
        }
        System.out.print("|Nama");
        // Jika Nama terpanjang kurang dari 4, maka tambahkan 1 spasi
        if (longestNama < 4) 
        {
            System.out.print(" ");
        }
        else 
        {
            for (int i = 0; i < longestNama - 3; i++) 
            {
                System.out.print(" ");
            }
        }
        System.out.print("|Harga");
        // Jika Harga terpanjang kurang dari 5, maka tambahkan 1 spasi
        if (longestHarga < 5) 
        {
            System.out.print(" ");
        }
        else 
        {
            for (int i = 0; i < longestHarga - 4; i++) 
            {
                System.out.print(" ");
            }
        }
        System.out.print("|Stok");
        // Jika Stok terpanjang kurang dari 4, maka tambahkan 1 spasi
        if (longestStok < 4) 
        {
            System.out.print(" ");
        }
        else 
        {
            for (int i = 0; i < longestStok - 3; i++) 
            {
                System.out.print(" ");
            }
        }
        System.out.print("|Jenis");
        // Jika Jenis terpanjang kurang dari 5, maka tambahkan 1 spasi
        if (longestJenis < 5) 
        {
            System.out.print(" ");
        }
        else 
        {
            for (int i = 0; i < longestJenis - 4; i++) 
            {
                System.out.print(" ");
            }
        }
        System.out.print("|Bahan");
        // Jika Bahan terpanjang kurang dari 5, maka tambahkan 1 spasi
        if (longestBahan < 5) 
        {
            System.out.print(" ");
        }
        else 
        {
            for (int i = 0; i < longestBahan - 4; i++) 
            {
                System.out.print(" ");
            }
        }
        System.out.print("|Warna");
        // Jika Warna terpanjang kurang dari 5, maka tambahkan 1 spasi  
        if (longestWarna < 5) 
        {
            System.out.print(" ");
        }
        else 
        {
            for (int i = 0; i < longestWarna - 4; i++) 
            {
                System.out.print(" ");
            }
        }
        System.out.print("|Untuk");
        // Jika Untuk terpanjang kurang dari 5, maka tambahkan 1 spasi
        if (longestUntuk < 5) 
        {
            System.out.print(" ");
        }
        else 
        {
            for (int i = 0; i < longestUntuk - 4; i++) 
            {
                System.out.print(" ");
            }
        }
        System.out.print("|Size");
        // Jika Size terpanjang kurang dari 4, maka tambahkan 1 spasi
        if (longestSize < 4) 
        {
            System.out.print(" ");
        }
        else 
        {
            for (int i = 0; i < longestSize - 3; i++) 
            {
                System.out.print(" ");
            }
        }
        System.out.print("|Merek");
        // Jika Merek terpanjang kurang dari 5, maka tambahkan 1 spasi
        if (longestMerek < 5) 
        {
            System.out.print(" ");
        }
        else 
        {
            for (int i = 0; i < longestMerek - 4; i++) 
            {
                System.out.print(" ");
            }
        }
        System.out.println("|");
    }

    // Isi tabel
    public static void isiTabel(int longestID, int longestNama, int longestHarga, int longestStok, int longestJenis, int longestBahan, int longestWarna, int longestUntuk, int longestSize, int longestMerek) 
    {
        for (Baju baju : daftarProduk) 
        {
            System.out.print("|" + baju.getId());
            if (longestID < 2)  // Maka tambahkan 3 - digitID(baju.getId()) spasi
            {
                for (int i = 0; i < 3 - digitID(baju.getId()); i++) 
                {
                    System.out.print(" ");
                }
            } 
            else 
            {
                for (int i = 0; i < longestID - digitID(baju.getId()) + 1; i++) 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("|" + baju.getNama());
            if (longestNama < 4)  // Maka tambahkan 5 - baju.getNama().length() spasi
            {
                for (int i = 0; i < 5 - baju.getNama().length(); i++) 
                {
                    System.out.print(" ");
                }
            } 
            else 
            {
                for (int i = 0; i < longestNama - baju.getNama().length() + 1; i++) 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("|" + baju.getHargaProduk());
            if (longestHarga < 5)  // Maka tambahkan 6 - digitID(baju.getHargaProduk()) spasi
            {
                for (int i = 0; i < 6 - digitID(baju.getHargaProduk()); i++) 
                {
                    System.out.print(" ");
                }
            } 
            else 
            {
                for (int i = 0; i < longestHarga - digitID(baju.getHargaProduk()) + 1; i++) 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("|" + baju.getStokProduk());
            if (longestStok < 4)  // Maka tambahkan 5 - digitID(baju.getStokProduk()) spasi
            {
                for (int i = 0; i < 5 - digitID(baju.getStokProduk()); i++) 
                {
                    System.out.print(" ");
                }
            } 
            else 
            {
                for (int i = 0; i < longestStok - digitID(baju.getStokProduk()) + 1; i++) 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("|" + baju.getJenis());
            if (longestJenis < 5)  // Maka tambahkan 6 - baju.getJenis().length() spasi
            {
                for (int i = 0; i < 6 - baju.getJenis().length(); i++) 
                {
                    System.out.print(" ");
                }
            } 
            else 
            {
                for (int i = 0; i < longestJenis - baju.getJenis().length() + 1; i++) 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("|" + baju.getBahan());
            if (longestBahan < 5)  // Maka tambahkan 6 - baju.getBahan().length() spasi
            {
                for (int i = 0; i < 6 - baju.getBahan().length(); i++) 
                {
                    System.out.print(" ");
                }
            } 
            else 
            {
                for (int i = 0; i < longestBahan - baju.getBahan().length() + 1; i++) 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("|" + baju.getWarna());
            if (longestWarna < 5)  // Maka tambahkan 6 - baju.getWarna().length() spasi
            {
                for (int i = 0; i < 6 - baju.getWarna().length(); i++) 
                {
                    System.out.print(" ");
                }
            } 
            else 
            {
                for (int i = 0; i < longestWarna - baju.getWarna().length() + 1; i++) 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("|" + baju.getUntuk());
            if (longestUntuk < 5)  // Maka tambahkan 6 - baju.getUntuk().length() spasi
            {
                for (int i = 0; i < 6 - baju.getUntuk().length(); i++) 
                {
                    System.out.print(" ");
                }
            } 
            else 
            {
                for (int i = 0; i < longestUntuk - baju.getUntuk().length() + 1; i++) 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("|" + baju.getSize());
            if (longestSize < 4)  // Maka tambahkan 5 - baju.getSize().length() spasi
            {
                for (int i = 0; i < 5 - baju.getSize().length(); i++) 
                {
                    System.out.print(" ");
                }
            } 
            else 
            {
                for (int i = 0; i < longestSize - baju.getSize().length() + 1; i++) 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("|" + baju.getMerek());
            if (longestMerek < 5)  // Maka tambahkan 6 - baju.getMerek().length() spasi
            {
                for (int i = 0; i < 6 - baju.getMerek().length(); i++) 
                {
                    System.out.print(" ");
                }
            } 
            else 
            {
                for (int i = 0; i < longestMerek - baju.getMerek().length() + 1; i++) 
                {
                    System.out.print(" ");
                }
            }
            
            System.out.println("|");
        }
    }

    // Tampilan tabel
    public static void tampilanTabel() 
    {
        int longestID = longestID();
        int longestNama = longestNama();
        int longestHarga = longestHarga();
        int longestStok = longestStok();
        int longestJenis = longestJenis();
        int longestBahan = longestBahan();
        int longestWarna = longestWarna();
        int longestUntuk = longestUntuk();
        int longestSize = longestSize();
        int longestMerek = longestMerek();

        borderTabel(longestID, longestNama, longestHarga, longestStok, longestJenis, longestBahan, longestWarna, longestUntuk, longestSize, longestMerek);
        headerTabel(longestID, longestNama, longestHarga, longestStok, longestJenis, longestBahan, longestWarna, longestUntuk, longestSize, longestMerek);
        borderTabel(longestID, longestNama, longestHarga, longestStok, longestJenis, longestBahan, longestWarna, longestUntuk, longestSize, longestMerek);
        isiTabel(longestID, longestNama, longestHarga, longestStok, longestJenis, longestBahan, longestWarna, longestUntuk, longestSize, longestMerek);
        borderTabel(longestID, longestNama, longestHarga, longestStok, longestJenis, longestBahan, longestWarna, longestUntuk, longestSize, longestMerek);
    }

    // Main
    public static void main(String[] args) 
{
    // Adding predefined data
    daftarProduk.add(new Baju(1, "Sweater Hangat", 75000, 10, "Baju", "Wol", "Merah", "Anjing", "M", "Pawfect"));
    daftarProduk.add(new Baju(2, "Jaket Waterproof", 120000, 5, "Jaket", "Polyester", "Biru", "Anjing", "L", "FurEver"));
    daftarProduk.add(new Baju(3, "Kaos Santai", 50000, 7, "Baju", "Katun", "Kuning", "Kucing", "S", "MeowStyle"));
    daftarProduk.add(new Baju(4, "Hoodie Sporty", 100000, 3, "Hoodie", "Fleece", "Hitam", "Anjing", "XL", "WoofyWear"));
    daftarProduk.add(new Baju(5, "Gaun Elegan", 150000, 2, "Gaun", "Sifon", "Pink", "Kucing", "M", "KittyCouture"));

    int pilihan = 0;
    do 
    {
        System.out.println("1. Tambah Produk");
        System.out.println("2. Tampilkan Produk");
        System.out.println("3. Keluar");
        System.out.print("Pilihan: ");
        pilihan = input.nextInt();
        input.nextLine();
        switch (pilihan) 
        {
            case 1:
                System.out.print("ID: ");
                int id = input.nextInt();
                input.nextLine();
                System.out.print("Nama: ");
                String nama = input.nextLine();
                System.out.print("Harga: ");
                int harga = input.nextInt();
                input.nextLine();
                System.out.print("Stok: ");
                int stok = input.nextInt();
                input.nextLine();
                System.out.print("Jenis: ");
                String jenis = input.nextLine();
                System.out.print("Bahan: ");
                String bahan = input.nextLine();
                System.out.print("Warna: ");
                String warna = input.nextLine();
                System.out.print("Untuk: ");
                String untuk = input.nextLine();
                System.out.print("Size: ");
                String size = input.nextLine();
                System.out.print("Merek: ");
                String merek = input.nextLine();
                Baju baju = new Baju(id, nama, harga, stok, jenis, bahan, warna, untuk, size, merek);
                daftarProduk.add(baju);
                break;
            case 2:
                tampilanTabel();
                break;
            case 3:
                System.out.println("Terima kasih");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
    } while (pilihan != 3);
}
}
