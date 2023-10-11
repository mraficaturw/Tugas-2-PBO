package tugaspbo1;

    public class Nilai {
        
    String nama, nim;
    float absen, tugas, uts, uas;
    float akhir;

    float Nilai() {
        akhir = (absen * 10 / 100) + (tugas * 20 / 100) + (uts * 30 / 100) + (uas * 40 / 100);
        return akhir;
    }

    void CetakNilai() {
        System.out.println("NIM                 : " + this.nim);
        System.out.println("Nama                : " + this.nama);
        System.out.println("Nilai Absen         : " + this.absen);
        System.out.println("Nilai Tugas         : " + this.tugas);
        System.out.println("Nilai UTS           : " + this.uts);
        System.out.println("Nilai UAS           : " + this.uas);
        System.out.println("Nilai Akhir         : " + Nilai());
    }
}
