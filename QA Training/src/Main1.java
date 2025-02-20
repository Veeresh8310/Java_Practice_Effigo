class Employee {
    String name;
    int age;
    Employee(String name, int age) {
        this.name = name;  
        this.age = age;  
    }
    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Employee emp = new Employee("Veeresh", 30);
        emp.display();
    }

}