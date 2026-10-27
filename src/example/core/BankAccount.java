package src.example.core;

public class BankAccount {
    // 1. Khai báo thuộc tính với access modifier phù hợp
    // accountNumber: Cho phép đọc ghi ở khắp mọi nơi -> public
    public String accountNumber;

    // ownerName: Bên ngoài đọc và cập nhật thông qua getter/setter -> private
    private String ownerName;

    // balance: Bảo mật tuyệt đối, ngăn chặn can thiệp trực tiếp từ ngoài và lớp con -> private
    private double balance;

    // 2. Constructor khởi tạo 3 tham số
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (initialBalance < 0) {
            this.balance = 0;
            System.out.println("[Lỗi] Số dư ban đầu không được nhỏ hơn 0! Đã gán số dư mặc định = 0.");
        } else {
            this.balance = initialBalance;
        }
    }

    // Nạp tiền
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Nạp thành công " + amount + " VNĐ. Số dư hiện tại: " + this.balance + " VNĐ");
        } else {
            System.out.println("[Lỗi] Số tiền nạp phải lớn hơn 0! (Số tiền nhập: " + amount + ")");
        }
    }

    // Rút tiền
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("[Lỗi] Số tiền rút phải lớn hơn 0! (Số tiền nhập: " + amount + ")");
        } else if (amount > this.balance) {
            System.out.println("[Lỗi] Số dư không đủ để rút! (Số dư hiện tại: " + this.balance + ", yêu cầu rút: " + amount + ")");
        } else {
            this.balance -= amount;
            System.out.println("Rút thành công " + amount + " VNĐ. Số dư còn lại: " + this.balance + " VNĐ");
        }
    }

    // Getter và Setter theo đúng yêu cầu bảo vệ dữ liệu
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // balance CHỈ có getter, KHÔNG có setter trực tiếp để bảo toàn tính toàn vẹn dữ liệu
    public double getBalance() {
        return this.balance;
    }
}
