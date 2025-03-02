<?php
include 'Petshop.php';

class Aksesoris extends Petshop
{
    private $jenis;
    private $bahan;
    private $warna;

    public function __construct($id, $namaProduk, $stok_produk, $hargaProduk, $foto_produk, $jenis, $bahan, $warna)
    {
        parent::__construct($id, $namaProduk, $stok_produk, $hargaProduk, $foto_produk);
        $this->jenis = $jenis;
        $this->bahan = $bahan;
        $this->warna = $warna;
    }

    public function setJenis($jenis)
    {
        $this->jenis = $jenis;
    }

    public function getJenis()
    {
        return $this->jenis;
    }

    public function setBahan($bahan)
    {
        $this->bahan = $bahan;
    }

    public function getBahan()
    {
        return $this->bahan;
    }

    public function setWarna($warna)
    {
        $this->warna = $warna;
    }

    public function getWarna()
    {
        return $this->warna;
    }

    public function __destruct()
    {
    }

}