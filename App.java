import src.example.core.Student;
import src.example.core.BankAccount;

public class App {
    public static void main(String[] args) {
        // 1. Thong tin hoc sinh
        System.out.println("=== THONG TIN HOC SINH ===");
        Student s = new Student("Thanh Huu", "023456789", "Java");
        System.out.println("Name: " + s.getName());
        System.out.println("Phone: " + s.getPhone());
        System.out.println("Group: " + s.getGroup());

        // 2. Kiem thu lop BankAccount
        System.out.println("\n=== KIEM THU LOP BANKACCOUNT ===");
        
        // Tao tai khoan hop le
        BankAccount acc1 = new BankAccount("1012345678", "Nguyen Van A", 500000);
        System.out.println("So tai khoan: " + acc1.accountNumber);
        System.out.println("Chu tai khoan: " + acc1.getOwnerName());
        System.out.println("So du ban dau: " + acc1.getBalance() + " VND");

        // Doi ten chu tai khoan qua Setter
        acc1.setOwnerName("Nguyen Van B");
        System.out.println("Ten sau khi cap nhat: " + acc1.getOwnerName());

        // Thu nghiem nap tien
        System.out.println("\n--- Thu nghiem nap tien ---");
        acc1.deposit(200000); // Nap hop le
        acc1.deposit(-50000); // Nap so am

        // Thu nghiem rut tien
        System.out.println("\n--- Thu nghiem rut tien ---");
        acc1.withdraw(300000);  // Rut hop le
        acc1.withdraw(1000000); // Rut qua so du
        acc1.withdraw(-20000);  // Rut so am

        // Thu tao tai khoan so du khoi tao am
        System.out.println("\n--- Thu tao tai khoan so du am ---");
        BankAccount acc2 = new BankAccount("9988776655", "Tran Thi C", -100000);
        System.out.println("So du acc2: " + acc2.getBalance() + " VND");
    }
}
