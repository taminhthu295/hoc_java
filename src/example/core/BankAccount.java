package src.example.core;

public class BankAccount {
    // 1. Khai bao thuoc tinh voi access modifier phu hop
    // accountNumber: Cho phep doc ghi o khap moi noi -> public
    public String accountNumber;

    // ownerName: Ben ngoai doc va cap nhat thong qua getter/setter -> private
    private String ownerName;

    // balance: Bao mat tuyet doi, ngan chan can thiep truc tiep tu ngoai va lop con -> private
    private double balance;

    // 2. Constructor khoi tao 3 tham so
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (initialBalance < 0) {
            this.balance = 0;
            System.out.println("[Loi] So du ban dau khong duoc nho hon 0! Da gan so du mac dinh = 0.");
        } else {
            this.balance = initialBalance;
        }
    }

    // Nap tien vao tai khoan
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Nap thanh cong " + amount + " VND. So du hien tai: " + this.balance + " VND");
        } else {
            System.out.println("[Loi] So tien nap phai lon hon 0! (So tien nhap: " + amount + ")");
        }
    }

    // Rut tien tu tai khoan
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("[Loi] So tien rut phai lon hon 0! (So tien nhap: " + amount + ")");
        } else if (amount > this.balance) {
            System.out.println("[Loi] So du khong du de rut! (So du hien tai: " + this.balance + ", yeu cau rut: " + amount + ")");
        } else {
            this.balance -= amount;
            System.out.println("Rut thanh cong " + amount + " VND. So du con lai: " + this.balance + " VND");
        }
    }

    // 3. Getter va Setter
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

    // balance CHI co getter, KHONG co setter truc tiep de bao ve tinh toan ven du lieu
    public double getBalance() {
        return this.balance;
    }
}
