package centralLibrary.models;

public class BorrowingMember extends Member{
    private String judulBuku;
    private String jenisBuku;

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }

    public BorrowingMember(int id, String nama, String tanggalLahir, String alamat, String telepon, String gender) {
        super(id, nama, tanggalLahir, alamat, telepon, gender);
    }
    
    public BorrowingMember(int id, String nama, String tanggalLahir, String alamat, String telepon, String gender, String judulBuku, String jenisBuku) {
        super(id, nama, tanggalLahir, alamat, telepon, gender);
        this.judulBuku = judulBuku;
        this.jenisBuku = jenisBuku;
    }

    @Override
    public String getJudulBuku() {
        return judulBuku;
    }

    @Override
    public String getJenisBuku() {
        return jenisBuku;
    }
}
