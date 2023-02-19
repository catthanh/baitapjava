public class ImaginaryNumber {
    double real;

    double imaginary;

    public ImaginaryNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public ImaginaryNumber add(ImaginaryNumber number) {
        double newReal = real + number.real;
        double newImaginary = imaginary + number.imaginary;
        return new ImaginaryNumber(newReal, newImaginary);
    }

    public ImaginaryNumber multiply(ImaginaryNumber number) {
        double newReal = real * number.real - imaginary * number.imaginary;
        double newImaginary = real * number.imaginary + imaginary * number.real;
        return new ImaginaryNumber(newReal, newImaginary);
    }

    public static void main(String[] args) {
        ImaginaryNumber number1 = new ImaginaryNumber(1, 2);
        ImaginaryNumber number2 = new ImaginaryNumber(3, 4);
        ImaginaryNumber number3 = number1.add(number2);
        System.out.println(number3);
        ImaginaryNumber number4 = number1.multiply(number2);
        System.out.println(number4);
    }
}
