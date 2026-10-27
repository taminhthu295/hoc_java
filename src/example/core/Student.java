package src.example.core;

public class Student {
    private String name;
    private String phone;
    private String group;

    public Student(String name, String phone, String group) {
        this.name = name;
        this.phone = phone;
        this.group = group;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getGroup() {
        return this.group;
    }
}
