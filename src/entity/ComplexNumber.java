package entity;

public class ComplexNumber {
    private Double re = 0.0;
    private Double im = 0.0;

    public ComplexNumber(Double re, Double im) {
        this.re = re;
        this.im = im;
    }

    public Double getRe() {
        return re;
    }

    public Double getIm() {
        return im;
    }

    public void addition(ComplexNumber x) {
        this.re += x.getRe();
        this.im += x.getIm();
    }

    public void subtraction(ComplexNumber x) {
        this.re -= x.getRe();
        this.im -= x.getIm();
    }

    public void multiply(ComplexNumber x) {
        double re, im;
        re = this.re * x.getRe() + (-1) * (this.im * x.getIm());
        im = this.re * x.getIm() + x.getRe() * this.im;
        this.re = re;
        this.im = im;
    }

    public void setIm(Double im) {
        this.im = im;
    }

    public void division(ComplexNumber x) {
        double sum = x.getRe() * x.getRe() + x.getIm() * x.getIm();
        x.setIm(x.getIm() * (-1));
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
