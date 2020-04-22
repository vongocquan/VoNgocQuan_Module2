package CaseStudy.Task1;

public class Room extends Services {
    private String dichVuDiKem;

    public Room() {
    }

    public String getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    @Override
    public String showInfor() {
        return "Room{" +
                "dichVuDiKem='" + dichVuDiKem + '\'' +
                '}' + super.toString();
    }


    public Room(String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    public Room(String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue, String dichVuDiKem) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuDiKem = dichVuDiKem;
    }
}
