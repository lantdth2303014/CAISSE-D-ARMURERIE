
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
            simplify();
        } else {
            System.out.println("Mau so khong the bang 0.");
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
            simplify();
        } else {
            System.out.println("Mau so khong the bang 0.");
        }
    }
    
    // basically finding the greatest common divisor of the numerator and denominator and then dividing both by that common divisor
    private void simplify() {
        int commonDivisor = gcd(Math.abs(numerator), Math.abs(denominator));  // gcd = greatest common divisor
        numerator = numerator / commonDivisor;
        denominator = denominator / commonDivisor;
    }
    
    // gcd method
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);  // (b, a mod b)
        }
    }

    public Fraction inverse() {
        return new Fraction(denominator, numerator);
    }

    public Fraction add(Fraction other) {
        int newNumerator = numerator * other.getDenominator() + other.getNumerator() * denominator;
        int newDenominator = denominator * other.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction sub(Fraction other) {
        int newNumerator = numerator * other.getDenominator() - other.getNumerator() * denominator;
        int newDenominator = denominator * other.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction mul(Fraction other) {
        int newNumerator = numerator * other.getNumerator();
        int newDenominator = denominator * other.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction div(Fraction other) {
        if (other.getNumerator() != 0) {
            int newNumerator = numerator * other.getDenominator();
            int newDenominator = denominator * other.getNumerator();
            return new Fraction(newNumerator, newDenominator);
        } else {
            System.out.println("Khong the chia cho phan so co tu so bang 0.");
            return null;
        }
    }

    public void display() {
        System.out.println(numerator + "/" + denominator);
    }
}