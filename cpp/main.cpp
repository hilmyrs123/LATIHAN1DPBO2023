#include "Mahasiswa.cpp"

using namespace std;

int main()
{
    // instantiasi

    Mahasiswa mhs;

    int i;

    // list
    list<Mahasiswa> mhslist;

    string nama;
    string nim;
    string prodi;
    string fakultas;

    // add data
    for (i = 0; i < 3; i++)
    {
        // temp
        Mahasiswa temp;
        // Attribute input
        cout << "Input nama, nim, prodi, fakultas :" << endl;
        cin >> nama >> nim >> prodi >> fakultas;

        // masukin input ke temp
        temp.setnama(nama);
        temp.setnim(nim);
        temp.setprodi(prodi);
        temp.setfakultas(fakultas);

        // insert temp ke list
        mhslist.push_back(temp);
    }

    // print list
    i = 0;
    for (list<Mahasiswa>::iterator it = mhslist.begin(); it != mhslist.end(); it++)
    {
        cout << (i) << "." << it->getnama() << it->getnim() << it->getprodi()
             << it->getfakultas() << "\n";

        i++;
    }

    // Change data

    return 0;
}