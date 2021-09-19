public class binatang {
    // classfield
    private String nama;
    private int umur;

    // constructor
    // default
    public binatang() {
        nama = "Jerapah";
        umur = 20;
    }

    // parameterized
    public binatang(String inputNama, int inputUmur) {
        nama = inputNama;
        umur = inputUmur;
    }

    public static void main(String[] args) {
        binatang binatang1 = new binatang();
        binatang binatang2 = new binatang("Banteng", 80);
        System.out.println(binatang1);
        System.out.println(binatang2);
        burung burung1 = new burung();
        System.out.println(binatang2.nama);
        System.out.println(burung1.getNama());
        binatang2.setNama("kucing");
        System.out.println(binatang2.nama);
        burung1.terbang();
        binatang2.terbang();
    }

    public String toString() {
        return "Nama : " + nama + " Umur : " + umur;
    }

    // inheritance
    public void terbang() {
        System.out.println("Aku Tidak Bisa Terbang");
    }

    // enscapculation
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}