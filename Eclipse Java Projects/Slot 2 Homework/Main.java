import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap do dai canh a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhap do dai canh b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhap do dai canh c: ");
        double c = scanner.nextDouble();

        TamGiac tamGiac = new TamGiac(a, b, c);

        if (tamGiac.laTamGiac()) {
        	System.out.println("3 gia tri tren tao thanh 1 tam giac.");
            System.out.println("Chu vi cua tam giac la: " + tamGiac.tinhChuVi());
            System.out.println("Dien tich cua tam giac la: " + tamGiac.tinhDienTich());
        } 
        else {
            System.out.println("3 gia tri tren khong tao thanh tam giac.");
        }

        scanner.close();

	}

}
