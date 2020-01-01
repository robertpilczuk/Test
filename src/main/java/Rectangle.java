public class Rectangle implements Shape {
    private float a;
    private float b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public float calculatedField() {
        return a * b;
    }
}
