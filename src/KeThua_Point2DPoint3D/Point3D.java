package KeThua_Point2DPoint3D;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }public float[] getXYZ(){
        float[] arr;
        return arr = new float[]{super.getX(), z};
    }public String toString(){
        return super.toString() + ", " +z;
    }
}
