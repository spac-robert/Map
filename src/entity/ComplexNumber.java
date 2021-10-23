package entity;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public void addition(ComplexNumber x) {
        this.re += x.re;
        this.im += x.im;
    }

    public void subtraction(ComplexNumber x) {
        this.re -= x.re;
        this.im -= x.im;
    }

    public void multiply(ComplexNumber x) {
        double re, im;
        re = this.re * x.re + (-1) * (this.im * x.im);
        im = this.re * x.im + x.re * this.im;
        this.re = re;
        this.im = im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public void division(ComplexNumber x) {
        double sum = x.re * x.re + x.im * x.im;
        x.setIm(x.im * (-1));
        multiply(x);
        this.re /= sum;
        this.im /= sum;
    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }
}
