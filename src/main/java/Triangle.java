public class Triangle implements Shape {
    private float a;
    private float h;

    public Triangle(float a, float b) {
        this.a = a;
        this.h = b;
    }

    @Override
    public float calculatedField() {
        return (a * h) / 2;
    }
}
