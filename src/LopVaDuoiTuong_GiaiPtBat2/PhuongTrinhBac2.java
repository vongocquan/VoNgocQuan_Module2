package LopVaDuoiTuong_GiaiPtBat2;

public class PhuongTrinhBac2 {
    double a, b, c;
    public PhuongTrinhBac2(){
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public PhuongTrinhBac2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }public String GiaiPhuongTrinhBatHai(double a, double b, double c) {
        double x = b * b - 4 * a * c;
        if (x < 0) {
            return "phuong trinh vo nghiem";
        } else if (x == 0) {
            return "phuong trinh co 2 nghiem kep: x1 = x2 = " + (-b / 2 * a);
        } else {
            return "phuong trinh co 2 nghiem x1 = " + ((-b + Math.sqrt(x)) / (2 * a)) + "x2 = " + ((-b - Math.sqrt(x)) / (2 * a));
        }
    }

}
