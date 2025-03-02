# TP-2-DPBO

# README - Program PetShop

## Janji
Saya Muhammad Isa Abdullah dengan NIM 2303508 mengerjakan Latihan Modul 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Atribut dan Methods
1. Kelas Petshop
Deskripsi:
Kelas utama yang merepresentasikan produk yang dijual di petshop.

🔹 Atribut
id (int) → ID unik untuk produk.
nama_produk (string) → Nama produk.
hargaProduk (float) → Harga produk dalam mata uang tertentu.
stokProduk (int) → Jumlah stok produk yang tersedia.
🔹 Methods
get_id() → Mengembalikan ID produk.
set_id(id) → Mengatur ID produk.
get_nama_produk() → Mengembalikan nama produk.
set_nama_produk(nama_produk) → Mengatur nama produk.
get_hargaProduk() → Mengembalikan harga produk.
set_hargaProduk(hargaProduk) → Mengatur harga produk.
get_stokProduk() → Mengembalikan jumlah stok produk.
set_stokProduk(stokProduk) → Mengatur jumlah stok produk.
2️. Kelas Aksesoris (Turunan dari Petshop)
Deskripsi:
Kelas yang merepresentasikan produk aksesoris di petshop.

🔹 Atribut
jenis (string) → Jenis aksesoris (misalnya: kalung, mainan, dll.).
bahan (string) → Bahan utama aksesoris (misalnya: plastik, kain, logam).
warna (string) → Warna aksesoris.
🔹 Methods
get_jenis() → Mengembalikan jenis aksesoris.
set_jenis(jenis) → Mengatur jenis aksesoris.
get_bahan() → Mengembalikan bahan aksesoris.
set_bahan(bahan) → Mengatur bahan aksesoris.
get_warna() → Mengembalikan warna aksesoris.
set_warna(warna) → Mengatur warna aksesoris.
3️. Kelas Baju_cpp (Turunan dari Aksesoris)
Deskripsi:
Kelas yang merepresentasikan produk baju untuk hewan di petshop.

🔹 Atribut
untuk (string) → Jenis hewan yang bisa memakai baju (misalnya: anjing, kucing).
size (string) → Ukuran baju (misalnya: S, M, L).
warna (string) → Warna baju (meng-overwrite warna dari kelas Aksesoris).
🔹 Methods
get_untuk() → Mengembalikan jenis hewan yang dapat memakai baju.
set_untuk(untuk) → Mengatur jenis hewan yang dapat memakai baju.
get_size() → Mengembalikan ukuran baju.
set_size(size) → Mengatur ukuran baju.
get_warna() → Mengembalikan warna baju.
set_warna(warna) → Mengatur warna baju.
