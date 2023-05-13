package kr.ac.knou.java.ch3.sec4;

class Circle {
    private final double r;

    public Circle(double a) {
        this.r = a;
    }

    public double getArea() {
        return this.r * this.r * 3.14;
    }

    public double getRadius() {
        return this.r;
    }
}
