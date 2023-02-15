//library
import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void printmenu(){
        System.out.println("-----------------");
        System.out.println("Ketik 1 untuk Add data");
        System.out.println("Ketik 2 untuk Change data");
        System.out.println("Ketik 3 untuk Remove data");
        System.out.println("Ketik angka lain untuk exit");
        System.out.println("Mau apa? Ketik di sini: ");
    }

    public static void printlist(ArrayList<Mahasiswa> list){
        int i = 0;
        for(Mahasiswa mhsw : list){
                for(int j = 0; j<47; j++){
                    System.out.print("-");
                }
                System.out.println("");
                System.out.print(i + ".");
                i++;
                System.out.println(mhsw);

        }
        for(int j = 0; j<30; j++){
                    System.out.print("-");
        }
    }

    public static void main(String[] args){
        //buat scanner 
        Scanner sc = new Scanner(System.in);

        //membuat array list
        ArrayList<Mahasiswa> list = new ArrayList<Mahasiswa>();

        int i = 0;
        
        //Instansiasi dan mencoba masukin satu data dengan add method
        Mahasiswa mhs = new Mahasiswa();
        mhs.setnama("Ujang Leverkussen");
        mhs.setNIM("01");
        mhs.setprodi("Sastra Nuklir");
        mhs.setfakultas("FPBTS");
        list.add(mhs);

        //print list data yang ada
        System.out.println("List Data");

        printlist(list);
        
        printmenu();

        //meminta input
        int wantedmethod = 0;
        boolean valid = true;

        //cek valid atau tidaknya inputan
        while(valid != false){
            wantedmethod = sc.nextInt();
            if(wantedmethod <= 3 && wantedmethod != 0){
                //instantiasi mhsnew
                Mahasiswa mhsnew = new Mahasiswa();

                //untuk makan new line dari si nextInt()
                sc.nextLine();

                //masuk ke switch buat nentuin mau ngapain
                switch(wantedmethod){
                    case 1:

                        System.out.print("Input Nama : "); 
                        mhsnew.setnama(sc.nextLine());
                        System.out.print("Input NIM : ");
                        mhsnew.setNIM(sc.nextLine());
                        System.out.print("Input Prodi : ");
                        mhsnew.setprodi(sc.nextLine());
                        System.out.print("Input Fakultas : ");
                        mhsnew.setfakultas(sc.nextLine());

                        list.add(mhsnew);

                        System.out.println("Berhasil menambahkan data");
                        printlist(list);
                
                        break;
                    case 2:
                        System.out.print("Pilih data yang mau diubah: ");
                        int ubah = sc.nextInt();

                        //untuk makan new line dari nextInt
                        sc.nextLine();
                        System.out.print("Input Nama : "); 
                        mhsnew.setnama(sc.nextLine());
                        System.out.print("Input NIM : ");
                        mhsnew.setNIM(sc.nextLine());
                        System.out.print("Input Prodi : ");
                        mhsnew.setprodi(sc.nextLine());
                        System.out.print("Input Fakultas : ");
                        mhsnew.setfakultas(sc.nextLine());

                        list.set(ubah, mhsnew);

                        System.out.println("Berhasil merubah data");
                        printlist(list);

                        break;
                    case 3:
                        System.out.print("Pilih data yang mau dihapus: ");
                        ubah = sc.nextInt();
                        
                        //untuk makan new line dari nextInt
                        sc.nextLine();
    
                        list.remove(ubah);

                        System.out.println("Berhasil menghapus data");
                        printlist(list);

                        break;
                }

                printmenu();
                valid = true;
            }
            else{
                System.exit(0);
            }
            
        }
        

        
        
        



    }
}