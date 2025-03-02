from Baju import Baju

def longest_attr(baju_list, attr, min_width):
    return max(len(str(getattr(b, attr)())) for b in baju_list) if baju_list else min_width

def print_border(column_widths):
    print("+" + "+".join(["-" * (width + 2) for width in column_widths]) + "+")

def print_header(column_widths):
    headers = ["ID", "Nama Produk", "Harga", "Stok", "Jenis", "Bahan", "Warna", "Untuk", "Size", "Merek"]
    formatted_headers = []

    for header, width in zip(headers, column_widths):
        formatted_headers.append(f" {header.ljust(width)} ")

    print("|" + "|".join(formatted_headers) + "|")

def print_row(baju, column_widths):
    values = [
        str(baju.get_id()), baju.get_namaProduk(), str(baju.get_hargaProduk()), str(baju.get_stokProduk()),
        baju.get_jenis(), baju.get_bahan(), baju.get_warna(), baju.get_untuk(), baju.get_size(), baju.get_merek()
    ]

    formatted_values = [f" {val.ljust(width)} " for val, width in zip(values, column_widths)]
    print("|" + "|".join(formatted_values) + "|")

def tampilkan_baju(baju_list):
    if not baju_list:
        print("Data kosong, tidak ada baju di PetShop!")
        return

    column_widths = [
        max(longest_attr(baju_list, "get_id", 2), 2),
        max(longest_attr(baju_list, "get_namaProduk", 4), 4),
        max(longest_attr(baju_list, "get_hargaProduk", 5), 5),
        max(longest_attr(baju_list, "get_stokProduk", 4), 4),
        max(longest_attr(baju_list, "get_jenis", 5), 5),
        max(longest_attr(baju_list, "get_bahan", 5), 5),
        max(longest_attr(baju_list, "get_warna", 5), 5),
        max(longest_attr(baju_list, "get_untuk", 5), 5),
        max(longest_attr(baju_list, "get_size", 4), 4),
        max(longest_attr(baju_list, "get_merek", 5), 5),
    ]

    print_border(column_widths)
    print_header(column_widths)
    print_border(column_widths)

    for b in baju_list:
        print_row(b, column_widths)

    print_border(column_widths)

def tambah_baju(baju_list):
    try:
        id = int(input("Masukkan ID: "))
        nama_produk = input("Masukkan Nama Produk: ")
        harga = int(input("Masukkan Harga: "))
        stok = int(input("Masukkan Stok: "))
        jenis = input("Masukkan Jenis: ")
        bahan = input("Masukkan Bahan: ")
        warna = input("Masukkan Warna: ")
        untuk = input("Masukkan Untuk: ")
        size = input("Masukkan Size: ")
        merek = input("Masukkan Merek: ")

        baju_list.append(Baju(id, nama_produk, harga, stok, jenis, bahan, warna, untuk, size, merek))
    except ValueError:
        print("Input tidak valid! Pastikan ID, harga, dan stok adalah angka.")

def main():
    baju_list = []
    
    data_baju = [
        (1, "Sweater Hangat", 75000, 10, "Baju", "Wol", "Merah", "Anjing", "M", "Pawfect"),
        (2, "Jaket Waterproof", 120000, 5, "Jaket", "Polyester", "Biru", "Anjing", "L", "FurEver"),
        (3, "Kaos Santai", 50000, 7, "Baju", "Katun", "Kuning", "Kucing", "S", "MeowStyle"),
        (4, "Hoodie Sporty", 100000, 3, "Hoodie", "Fleece", "Hitam", "Anjing", "XL", "WoofyWear"),
        (5, "Gaun Elegan", 150000, 2, "Gaun", "Sifon", "Pink", "Kucing", "M", "KittyCouture")
    ]

    for data in data_baju:
        baju = Baju()
        baju.addBaju(*data)
        baju_list.append(baju)

    while True:
        print("Menu:")
        print("1. Tampilkan Baju")
        print("2. Tambah Baju")
        print("3. Keluar")
        choice = input("Pilih menu: ")

        if choice == "1":
            tampilkan_baju(baju_list)
        elif choice == "2":
            tambah_baju(baju_list)
        elif choice == "3":
            break
        else:
            print("Menu tidak valid!")

if __name__ == "__main__":
    main()
