//Deklarasi kelas Mahasiswa
public class Mahasiswa{
    //Private Attributes
    private String nama;
    private String NIM;
    private String prodi;
    private String fakultas;
    
    //Konstruktor
    public Mahasiswa(){
        //konstruktor kosong
    }

    public Mahasiswa(String nama, String NIM, String prodi, String fakultas){
        //konstruktor dengan parameter
        this.nama = nama;
        this.NIM = NIM;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    //setter getter

    //SETTER
    public void setnama(String nama){
        this.nama = nama;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public void setprodi(String prodi){
        this.prodi = prodi;
    }

    public void setfakultas(String fakultas){
        this.fakultas = fakultas;
    }

    //GETTER
    public String getnama(){
        return this.nama;
    }

     public String getNIM(){
        return this.NIM;
    }

    public String getprodi(){
        return this.prodi;
    }

    public String getfakultas(){
        return this.fakultas;
    }

    //method
    @Override
    //method untuk mengubah hashcode menjadi string
    public String toString(){
        return  this.getnama() + " " + this.getNIM() + " "
        + this.getprodi() + " " + this.getfakultas();
    }
}