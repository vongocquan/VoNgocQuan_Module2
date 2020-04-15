package LopVaDoiTuongJava_XayDungLopFan;

public class Fan {
    final int slow = 1;

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    final int medium =2;
    final int fast = 3;
    int speed = 2;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan(){}
    public String toString() {
        if (this.on == false) {
            return "fan is off";
        } else {
            return "speed= " + this.speed + ", color= " + this.color + ", radius= " + this.radius;
        }

    }

}
