<?php
include 'Aksesoris.php';

class Baju extends Aksesoris
{
    private $untuk;
    private $size;
    private $merek;

    public function __construct($id, $namaProduk, $harga_produk, $stok_produk, $foto_produk, $jenis, $bahan, $warna, $untuk, $size, $merek)
    {
        parent::__construct($id, $namaProduk, $harga_produk, $stok_produk, $foto_produk, $jenis, $bahan, $warna);
        $this->untuk = $untuk;
        $this->size = $size;
        $this->merek = $merek;
    }

    public function setUntuk($untuk)
    {
        $this->untuk = $untuk;
    }

    public function getUntuk()
    {
        return $this->untuk;
    }

    public function setSize($size)
    {
        $this->size = $size;
    }

    public function getSize()
    {
        return $this->size;
    }

    public function setMerek($merek)
    {
        $this->merek = $merek;
    }

    public function getMerek()
    {
        return $this->merek;
    }

    public function addBaju($id, $namaProduk, $harga_produk, $stok_produk, $foto_produk, $jenis, $bahan, $warna, $untuk, $size, $merek)
    {
        parent::setId($id);
        parent::setNamaProduk($namaProduk);
        parent::setHargaProduk($harga_produk);
        parent::setStokProduk($stok_produk);
        parent::setFotoProduk($foto_produk);
        parent::setJenis($jenis);
        parent::setBahan($bahan);
        parent::setWarna($warna);
        $this->untuk = $untuk;
        $this->size = $size;
        $this->merek = $merek;
    }

    public function __destruct()
    {
    }
}