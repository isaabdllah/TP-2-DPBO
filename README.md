# Tugas Praktikum 2 DPBO

## Janji
Saya Muhammad Isa Abdullah dengan NIM 2303508 mengerjakan Tugas Praktikum 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

---

## Penjelasan Atribut dan Methods

### Kelas `PetShop`
Kelas ini merepresentasikan produk yang dijual di toko hewan peliharaan.

**Atribut:**
- `id` (int): ID unik untuk setiap produk.
- `namaProduk` (string): Nama dari produk.
- `hargaProduk` (int): Harga produk.
- `stokProduk` (int): Jumlah stok produk.

**Methods:**
- Getter dan Setter untuk setiap atribut.
- `get_id()`: Mengembalikan ID produk.
- `get_namaProduk()`: Mengembalikan nama produk.
- `get_hargaProduk()`: Mengembalikan harga produk.
- `get_stokProduk()`: Mengembalikan jumlah stok produk.

---

### Kelas `Aksesoris` (turunan dari `PetShop`)
Kelas ini merupakan subclass dari `PetShop` yang merepresentasikan produk aksesoris.

**Atribut:**
- `jenis` (string): Jenis aksesoris.
- `bahan` (string): Bahan pembuat aksesoris.
- `warna` (string): Warna aksesoris.

**Methods:**
- Getter dan Setter untuk atribut tambahan.
- `get_jenis()`: Mengembalikan jenis aksesoris.
- `get_bahan()`: Mengembalikan bahan aksesoris.
- `get_warna()`: Mengembalikan warna aksesoris.

---

### Kelas `Baju` (turunan dari `Aksesoris`)
Kelas ini merupakan subclass dari `Aksesoris` yang merepresentasikan produk baju untuk hewan peliharaan.

**Atribut:**
- `untuk` (string): Target pemakaian baju (misalnya kucing atau anjing).
- `size` (string): Ukuran baju.
- `merek` (string): Merek baju.

**Methods:**
- Getter dan Setter untuk atribut tambahan.
- `get_untuk()`: Mengembalikan target pemakaian baju.
- `get_size()`: Mengembalikan ukuran baju.
- `get_merek()`: Mengembalikan merek baju.

---

## Alur Program

### 1. Menampilkan Data Baju
- Program menampilkan daftar baju yang tersedia di PetShop dalam bentuk tabel.
- Jika tidak ada data, program akan menampilkan pesan bahwa data kosong.

### 2. Menambah Data Baju
- Pengguna dapat menambahkan produk baju baru dengan menginput ID, nama, harga, stok, jenis, bahan, warna, target pemakaian, ukuran, dan merek.
- Data yang valid akan disimpan dalam daftar baju.
- Jika input tidak valid (misalnya ID atau harga bukan angka), program akan menampilkan pesan kesalahan.

### 3. Keluar dari Program
- Pengguna dapat memilih opsi keluar dari program.
- Program akan berhenti setelah menampilkan pesan penutupan.

---

