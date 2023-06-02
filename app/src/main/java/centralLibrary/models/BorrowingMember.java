package centralLibrary.models;

public class BorrowingMember extends Member{
    private int jumlahDipinjam;

    public BorrowingMember(int id, String nama, String tanggalLahir, String alamat, String telepon, String gender) {
        super(id, nama, tanggalLahir, alamat, telepon, gender);
    }
    
    public BorrowingMember(int id, String nama, String tanggalLahir, String alamat, String telepon, String gender, int jumlahDipinjam) {
        super(id, nama, tanggalLahir, alamat, telepon, gender);
        this.jumlahDipinjam = jumlahDipinjam;
    }

    @Override
    public int getJumlahDipinjam() {
        return jumlahDipinjam;
    }

}

