#import

from Mahasiswa import Mahasiswa

#instantiasi
mhs = Mahasiswa()

#bikin array
mhsw = []
mhsw.append(Mahasiswa("asep", "01", "sastra nuklir", "FPBTS"))

#menambahkan data dalam array
i = 1
while i == 1:
    print("Input nama :"); nama = str(input())
    print("Input NIM :"); NIM = str(input())
    print("Input prodi :"); prodi = str(input())
    print("Input fakultas :"); fakultas = str(input())

    #memasukan data ke array
    mhsw.append(Mahasiswa(nama, NIM, prodi, fakultas))

    #loop biar bisa lanjut nambah data
    print("mau lanjut? 1 untuk ya | 0 untuk tidak")
    i = int(input())
    #blom ada error handling krn saya speedrun tugas


#print list
for mhs in mhsw:
    print("-----------------------------------------------------------")
    print(str(i) + ". | ", mhs.getnama(), mhs.getNIM(), mhs.getprodi(), mhs.getfakultas())
    i+=1

#merubah data dalam array
i = 0 #sebagai contoh merubah yang pertama
print("Input nama :"); nama = str(input())
print("Input NIM :"); NIM = str(input())
print("Input prodi :"); prodi = str(input())
print("Input fakultas :"); fakultas = str(input())

mhsw[i] = Mahasiswa(nama, NIM, prodi, fakultas)

for mhs in mhsw:
    print("-----------------------------------------------------------")
    print(str(i) + ". | ", mhs.getnama(), mhs.getNIM(), mhs.getprodi(), mhs.getfakultas())
    i+=1

#menghapus data dalam array
#minimal ada 2 data
i = 0
mhsw.pop(i)

print("data setelah dihapus")
for mhs in mhsw:
    print("-----------------------------------------------------------")
    print(str(i) + ". | ", mhs.getnama(), mhs.getNIM(), mhs.getprodi(), mhs.getfakultas())
    i+=1