import src.example.core.Student;
import src.example.core.BankAccount;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class App {
    public static void main(String[] args) {
        // Cấu hình in tiếng Việt UTF-8 ra màn hình Console
        try {
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        } catch (Exception ignored) {}

        // 1. Thông tin học sinh
        System.out.println("=== THÔNG TIN HỌC SINH ===");
        Student s = new Student("Thanh Huu", "023456789", "Java");
        System.out.println("Name: " + s.getName());
        System.out.println("Phone: " + s.getPhone());
        System.out.println("Group: " + s.getGroup());

        // 2. Kiểm thử lớp BankAccount
        System.out.println("\n=== KIỂM THỬ LỚP BANKACCOUNT ===");
        
        // Tạo tài khoản hợp lệ
        BankAccount acc1 = new BankAccount("1012345678", "Nguyen Van A", 500000);
        System.out.println("Số tài khoản: " + acc1.accountNumber);
        System.out.println("Chủ tài khoản: " + acc1.getOwnerName());
        System.out.println("Số dư ban đầu: " + acc1.getBalance() + " VNĐ");

        // Đổi tên chủ tài khoản qua Setter
        acc1.setOwnerName("Nguyen Van B");
        System.out.println("Tên sau khi cập nhật: " + acc1.getOwnerName());

        // Thử nghiệm nạp tiền
        System.out.println("\n--- Thử nghiệm nạp tiền ---");
        acc1.deposit(200000); // Nạp hợp lệ
        acc1.deposit(-50000); // Nạp số âm

        // Thử nghiệm rút tiền
        System.out.println("\n--- Thử nghiệm rút tiền ---");
        acc1.withdraw(300000);  // Rút hợp lệ
        acc1.withdraw(1000000); // Rút quá số dư
        acc1.withdraw(-20000);  // Rút số âm

        // Thử tạo tài khoản số dư khởi tạo âm
        System.out.println("\n--- Thử tạo tài khoản số dư âm ---");
        BankAccount acc2 = new BankAccount("9988776655", "Tran Thi C", -100000);
        System.out.println("Số dư acc2: " + acc2.getBalance() + " VNĐ");
    }
}
