
class TamGiac {
	
    private double canhA;		// encapsulation 
    private double canhB;		// is very
    private double canhC;		// professional (tin toi di bro)
    
    // le constructor
    public TamGiac(double a, double b, double c) {
        canhA = a;
        canhB = b;
        canhC = c;
    }
    
    // Phuong thuc kiem tra 3 gia tri co phai la 3 canh cua tam giac
    public boolean laTamGiac() {
        return (canhA + canhB > canhC) && (canhA + canhC > canhB) && (canhB + canhC > canhA);
    }

    // Phuong thuc tinh chu vi
    public double tinhChuVi() {
        return canhA + canhB + canhC;
    }
    
    // Phuong thuc tinh dien tich
    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
    }

    public double getCanhA() {
        return canhA;
    }

    public double getCanhB() {
        return canhB;
    }

    public double getCanhC() {
        return canhC;
    }
}