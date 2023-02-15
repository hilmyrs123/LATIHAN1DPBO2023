#include <iostream>
#include <string>
#include <list>

using namespace std;

// class declaration
class Mahasiswa
{

    // private attributes
private:
    string nama;
    string nim;
    string prodi;
    string fakultas;

public:
    // konstruktor
    Mahasiswa()
    {
        // set ke value default
        this->nama = "";
        this->nim = "";
        this->prodi = "";
        this->fakultas = "";
    }

    // konstruktor dengan parameter
    Mahasiswa(string nama, string nim, string prodi, string fakultas)
    {
        this->nama = nama;
        this->nim = nim;
        this->prodi = prodi;
        this->fakultas = fakultas;
    }

    // Setter & Getter
    // SET
    void setnama(string nama)
    {
        this->nama = nama;
    }

    void setnim(string nim)
    {
        this->nim = nim;
    }

    void setprodi(string prodi)
    {
        this->prodi = prodi;
    }

    void setfakultas(string fakultas)
    {
        this->fakultas = fakultas;
    }

    // GET
    string getnama()
    {
        return this->nama;
    }

    string getnim()
    {
        return this->nim;
    }

    string getprodi()
    {
        return this->prodi;
    }

    string getfakultas()
    {
        return this->fakultas;
    }

    // Destruktor
    ~Mahasiswa()
    {
    }
};