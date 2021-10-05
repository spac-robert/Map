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

    public void setRe(Double re) {
        this.re = re;
    }

    public Double getIm() {
        return im;
    }

    public void setIm(Double im) {
        this.im = im;
    }

    public void addition(ComplexNumber x) {
        this.re += x.getRe();
        this.im += x.getIm();
    }
}
