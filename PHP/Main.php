<?php
include 'Baju.php';
session_start();
session_unset(); // Hapus semua data session
session_destroy();
session_start(); // Mulai session baru


// Simpan data di session
if (!isset($_SESSION['baju_list'])) {
    $_SESSION['baju_list'] = [
        new Baju(1, 'Kaos Polos', 50000, 10, 'uploads/contoh1.jpeg', 'Kaos', 'Katun', 'Hitam', 'Anjing', 'L', 'Uniqlo'),
        new Baju(2, 'Kemeja Formal', 150000, 5, 'uploads/contoh2.jpeg', 'Kemeja', 'Poliester', 'Putih', 'Anjing', 'M', 'Zara'),
        new Baju(3, 'Jaket Hoodie', 200000, 7, 'uploads/contoh3.jpg', 'Jaket', 'Fleece', 'Abu-abu', 'Anjing', 'XL', 'Adidas'),
        new Baju(4, 'Dress Casual', 175000, 3, 'uploads/contoh4.jpeg', 'Dress', 'Rayon', 'Merah', 'Kucing', 'S', 'H&M'),
        new Baju(5, 'Sweater Oversized', 180000, 8, 'uploads/contoh5.jpg', 'Sweater', 'Wool', 'Coklat', 'Kucing', 'M', 'Nike')
    ];
}

// Handle form submit
if ($_SERVER['REQUEST_METHOD'] == 'POST' && isset($_POST['addBaju'])) {
    $id = count($_SESSION['baju_list']) + 1;
    $namaProduk = $_POST['namaProduk'];
    $harga_produk = $_POST['harga_produk'];
    $stok_produk = $_POST['stok_produk'];
    $jenis = $_POST['jenis'];
    $bahan = $_POST['bahan'];
    $warna = $_POST['warna'];
    $untuk = $_POST['untuk'];
    $size = $_POST['size'];
    $merek = $_POST['merek'];

    // Upload Foto
    $foto_produk = "uploads/default.png";
    if (!empty($_FILES['foto_produk']['name'])) {
        $target_dir = "uploads/";
        if (!is_dir($target_dir)) {
            mkdir($target_dir, 0777, true);
        }
        $foto_produk = $target_dir . basename($_FILES['foto_produk']['name']);
        move_uploaded_file($_FILES['foto_produk']['tmp_name'], $foto_produk);
    }

    $baju = new Baju($id, $namaProduk, $harga_produk, $stok_produk, $foto_produk, $jenis, $bahan, $warna, $untuk, $size, $merek);
    $_SESSION['baju_list'][] = $baju;
}
?>

<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daftar Baju</title>
    <style>
        table { border-collapse: collapse; width: 100%; }
        th, td { border: 1px solid black; padding: 10px; text-align: left; }
        img { max-width: 100px; height: auto; }
    </style>
</head>
<body>
    <h2>Daftar Baju</h2>
    <table>
        <tr>
            <th>ID</th><th>Nama Produk</th><th>Harga</th><th>Stok</th><th>Jenis</th>
            <th>Bahan</th><th>Warna</th><th>Untuk</th><th>Size</th><th>Merek</th><th>Foto</th>
        </tr>
        <?php foreach ($_SESSION['baju_list'] as $baju): ?>
            <tr>
                <td><?= $baju->getId(); ?></td>
                <td><?= $baju->getNamaProduk(); ?></td>
                <td><?= $baju->getHargaProduk(); ?></td>
                <td><?= $baju->getStokProduk(); ?></td>
                <td><?= $baju->getJenis(); ?></td>
                <td><?= $baju->getBahan(); ?></td>
                <td><?= $baju->getWarna(); ?></td>
                <td><?= $baju->getUntuk(); ?></td>
                <td><?= $baju->getSize(); ?></td>
                <td><?= $baju->getMerek(); ?></td>
                <td><img src="<?= $baju->getFotoProduk(); ?>" alt="Foto Baju"></td>
            </tr>
        <?php endforeach; ?>
    </table>

    <h2>Tambah Baju</h2>
    <form action="" method="POST" enctype="multipart/form-data">
        Nama Produk: <input type="text" name="namaProduk" required><br>
        Harga: <input type="number" name="harga_produk" required><br>
        Stok: <input type="number" name="stok_produk" required><br>
        Jenis: <input type="text" name="jenis" required><br>
        Bahan: <input type="text" name="bahan" required><br>
        Warna: <input type="text" name="warna" required><br>
        Untuk: <input type="text" name="untuk" required><br>
        Size: <input type="text" name="size" required><br>
        Merek: <input type="text" name="merek" required><br>
        Foto Produk: <input type="file" name="foto_produk" accept="image/*"><br>
        <button type="submit" name="addBaju">Tambah</button>
    </form>
</body>
</html>
