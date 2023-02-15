# Penjelasan program Latihan 1 DPBO 2023 (JAVA)

###### oleh Muhammad Hilmy Rasyad Sofyan 2100187


## Desain
Menggunakan struktur data list yang lebih tepatnya array list dalam JAVA, karena  ukurannya yang dapat berubah sesuai banyaknya data yang dimasukkan. Lalu program pun dibagi menjadi dua file yakni Mahasiswa.java sebagai tempat untuk menyimpan objek Mahasiswa dan Main.java untuk main programnya

## Alur Program

### Dalam Mahasiswa.java

- Terdapat empat atribut private yakni nama, NIM, prodi, dan fakultas
- Lalu pembuatan konstruktor kosong dan konstruktor dengan parameter
- Terdapat Setter dan Getter
- Terakhir ada method untuk mengubah hashcode menjadi string, karena dalam array list kalo diprint tidak langsung menjadi string melainkan hashcode

### Dalam Main.java

- Menggunakan dua library yakni Scanner dan Arraylist
- Terdapat dua method yakni untuk print menu dan print list
- Lalu dalam main terdapat instansiasi Mahasiswa, ArrayList, dan Scanner
- Dalam instansiasi Mahasiswa saya add satu data di dalamnya
- Dilanjutkan dengan print list
- lalu print menu untuk mau melakukan apa nantinya
- seperti ketik 1 untuk add data, 2 untuk change data, 3 untuk remove data, dan angka lain untuk exit
- lalu ada input untuk meminta perintah anda
- dan loop while untuk cek kevalidan input, bila input > 3 dan != 0 maka valid akan tetap true
- Bila memilih 1 maka akan diminta menginput data baru, lalu menggunakan method add untuk menambahkan data pada list
- Untuk memilih 2 maka akan diminta untuk input data keberapa yang mau diganti dan nanti akan menggunakan method set untuk mengubahnya
- Yang terakhir itu 3 maka hanya akan diminta untuk input data keberapa yang mau dihapus dan nanti akan menggunakan method remove untuk menghapus data

###### untuk method add, set, dan remove itu berasal dari library ArrayList
