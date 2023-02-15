# Penjelasan program Latihan 1 DPBO 2023 (JAVA)

###### Saya Muhammad Hilmy Rasyad Sofyan NIM 2100187 mengerjakan Latihan 1 dalam mata kuliah Desain Pemograman Berbasis Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.


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

## Dokumentasi Running JAVA Program
### Tampilan awal
![Screenshot (3025)](https://user-images.githubusercontent.com/90629617/219037967-94d1ed76-44f0-4647-8efe-0dd673fad867.png)
### Menambahkan data
![Screenshot (3026)](https://user-images.githubusercontent.com/90629617/219038346-391f15fc-6401-4b94-8617-718436f00ebe.png)
### Merubah data
![Screenshot (3027)](https://user-images.githubusercontent.com/90629617/219038594-c4dba2a5-8b0f-431f-90fd-8c679f79f5c1.png)
### Menghapus data
![Screenshot (3028)](https://user-images.githubusercontent.com/90629617/219038601-7204af12-f99c-4a58-a1de-dd0006ca571d.png)
### exit
![Screenshot (3029)](https://user-images.githubusercontent.com/90629617/219038605-b495e7c1-72fb-499c-bc8c-9b6b9c4946fd.png)
