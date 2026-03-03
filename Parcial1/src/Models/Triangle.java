package Models;

public class Triangle extends GeometricObject{
    private double side1, side2, side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3)  throws IllegalTriangleException{
        super(color, filled);

        if (!isValid(side1, side2, side3)){
            throw new IllegalTriangleException("Triangulo invalido");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean isValid(double s1, double s2, double s3) {
        return (s1 + s2 > s3) &&
                (s1 + s3 > s2) &&
                (s2 + s3 > s1);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * ((s - side1) * (s - side2) * (s -side3)));
    }

    @Override
    public String toString() {
        return "Triángulo: side1 = " + side1 +
                " side2 = " + side2 +
                " side3 = " + side3 +
                " Color = " + getColor() +
                " Lleno = " + getFilled();
    }

}
