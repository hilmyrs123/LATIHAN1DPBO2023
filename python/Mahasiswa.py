#deklarasi kelas
class Mahasiswa:

    #private attributes
    __nama = ""
    __NIM = ""
    __prodi = ""
    __fakultas = ""

    #konstruktor
    def __init__(self, nama ="", NIM = "", prodi = "", fakultas = ""):
        self.__nama = nama
        self.__NIM = NIM
        self.__prodi = prodi
        self.__fakultas = fakultas

    #setter & getter

    #set
    def setnama(self, nama):
        self.__nama = nama

    def setNIM(self, NIM):
        self.__NIM = NIM

    def setprodi(self, prodi):
        self.__prodi = prodi

    def setfakultas(self, fakultas):
        self.__fakultas = fakultas

    #get
    def getnama(self):
        return self.__nama

    def getNIM(self):
        return self.__NIM
    
    def getprodi(self):
        return self.__prodi

    def getfakultas(self):
        return self.__fakultas

        
