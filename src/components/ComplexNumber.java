package components;

public class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public ComplexNumber square()
    {
        return new ComplexNumber(
          re*re - im*im,
          2*re*im
        );
    }

    public ComplexNumber add(ComplexNumber other)
    {
        return new ComplexNumber(
                re + other.getRe(),
                im+other.getIm()
        );
    }
    public double modulusSquared()
    {
        return re*re + im*im;
    }
}
