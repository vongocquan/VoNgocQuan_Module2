package CaseStudy.Task1;

public abstract class Services{
    private String tenDichVu = "thue phong";
    private String dienTichSuDung = "45 m2";
    private String chiPhiThue = "50 do";
    private int soLuongNguoiToiDa = 3;
    private String kieuThue = "thue theo ngay";

    public Services() {
    }

    public Services(String tenDichVu, String dienTichSuDung, String chiPhiThue, int soLuongNguoiToiDa, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(String dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }
    public String toString() {
        return "Services{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung='" + dienTichSuDung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    abstract String showInfor();
}
