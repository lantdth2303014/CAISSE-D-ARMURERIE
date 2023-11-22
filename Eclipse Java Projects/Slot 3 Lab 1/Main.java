
public class Main {

	public static void main(String[] args) {
		Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(1, 2);

        System.out.println("Phan so 1:");
        fraction1.display();

        System.out.println("\nPhan so 2:");
        fraction2.display();

        System.out.println("\nPhan so tong:");
        Fraction resultAdd = fraction1.add(fraction2);
        resultAdd.display();

        System.out.println("\nPhan so hieu:");
        Fraction resultSub = fraction1.sub(fraction2);
        resultSub.display();

        System.out.println("\nPhan so tich:");
        Fraction resultMul = fraction1.mul(fraction2);
        resultMul.display();

        System.out.println("\nPhan so thuong:");
        Fraction resultDiv = fraction1.div(fraction2);
        if (resultDiv != null) {
            resultDiv.display();
        }

        System.out.println("\nNghich dao cua phan so 1:");
        Fraction inverseFraction1 = fraction1.inverse();
        inverseFraction1.display();

	}

}
