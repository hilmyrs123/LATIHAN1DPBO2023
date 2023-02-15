<?php

class Mahasiswa
{
    private $nama = '';
    private $nim = '';
    private $prodi = '';
    private $fakultas = '';

    //konstruktor
    public function __construct(
        $nama = '',
        $nim = '',
        $prodi = '',
        $fakultas = ''
    ) {
        $this->nama = $nama;
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
    }

    //setter & getter
    public function setnama($nama)
    {
        $this->nama = $nama;
    }

    public function setnim($nim)
    {
        $this->nim = $nim;
    }

    public function setprodi($prodi)
    {
        $this->prodi = $prodi;
    }

    public function setfakultas($fakultas)
    {
        $this->fakultas = $fakultas;
    }

    //get
    public function getnama()
    {
        return $this->nama;
    }

    public function getnim()
    {
        return $this->nim;
    }

    public function getprodi()
    {
        return $this->prodi;
    }

    public function getfakultas()
    {
        return $this->fakultas;
    }
}
