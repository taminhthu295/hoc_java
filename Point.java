import java.util.Scanner;

public class Point {
    // Thuộc tính của lớp Point
    private String tenDiem;
    private double hoanhDo;
    private double tungDo;

    // ==========================================
    // a) Các phương thức get/set cho lớp Point
    // ==========================================

    public String getTenDiem() {
        return tenDiem;
    }

    public void setTenDiem(String tenDiem) {
        this.tenDiem = tenDiem;
    }

    public double getHoanhDo() {
        return hoanhDo;
    }

    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public double getTungDo() {
        return tungDo;
    }

    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }

    // ==========================================
    // b) Các phương thức khởi tạo (Constructor)
    // ==========================================

    // i) Phương thức khởi tạo không có tham số nào: hoành độ, tung độ = 0, tên mặc định là "A"
    public Point() {
        tenDiem = "A";
        hoanhDo = 0;
        tungDo = 0;
    }

    // ii) Phương thức khởi tạo nhận hai số thực làm tham số
    public Point(double hoanhDo, double tungDo) {
        this.tenDiem = "A";
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    // iii) Phương thức khởi tạo nhận 1 xâu ký tự và 2 số thực làm tham số
    public Point(String tenDiem, double hoanhDo, double tungDo) {
        this.tenDiem = tenDiem;
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    // ==========================================
    // c) Phương thức nhập vào một điểm từ bàn phím
    // ==========================================
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tung do: ");
        tungDo = sc.nextDouble();
        System.out.print("Nhap hoanh do: ");
        hoanhDo = sc.nextDouble();
    }

    // ==========================================
    // d) Phương thức in thông tin một điểm ra màn hình
    // ==========================================
    public void inDiem() {
        // Dưới dạng: Tên_điểm(Tung_độ, Hoành_độ). Ví dụ: A(2, 4)
        System.out.println(tenDiem + "(" + tungDo + ", " + hoanhDo + ")");
    }

    // ==========================================
    // e) Hàm main kiểm tra các phương thức đã cài đặt
    // ==========================================
    public static void main(String[] args) {
        // Kiểm tra câu b.i: Constructor không tham số
        Point p1 = new Point();
        System.out.print("Diem p1 (khoi tao mac dinh): ");
        p1.inDiem(); // In: A(0.0, 0.0)

        // Kiểm tra câu b.ii: Constructor nhận 2 số thực
        Point p2 = new Point(4, 2);
        System.out.print("Diem p2 (hoanh do 4, tung do 2): ");
        p2.inDiem(); // In: A(2.0, 4.0)

        // Kiểm tra câu b.iii: Constructor nhận 1 chuỗi và 2 số thực
        Point p3 = new Point("B", 3, 5);
        System.out.print("Diem p3 (ten B, hoanh do 3, tung do 5): ");
        p3.inDiem(); // In: B(5.0, 3.0)

        // Kiểm tra câu a: Các phương thức get và set
        p1.setTenDiem("C");
        p1.setHoanhDo(6);
        p1.setTungDo(8);
        System.out.println("Sau khi set p1 -> Ten: " + p1.getTenDiem() 
                + ", Hoanh do: " + p1.getHoanhDo() 
                + ", Tung do: " + p1.getTungDo());
        System.out.print("In lai p1 sau khi set: ");
        p1.inDiem(); // In: C(8.0, 6.0)

        // Kiểm tra câu c: Nhập từ bàn phím
        Point p4 = new Point();
        p4.setTenDiem("M");
        System.out.println("Nhap toa do cho diem " + p4.getTenDiem() + ":");
        p4.nhap();
        System.out.print("Diem sau khi nhap: ");
        p4.inDiem();
    }
}
