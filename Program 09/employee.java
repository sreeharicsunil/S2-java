import java.util.*;

class Employee {

    int eno;
    String ename;
    int salary;

    Scanner sc = new Scanner(System.in);

    public void read() {

        System.out.println("Enter the employee ID:");
        eno = sc.nextInt();
        sc.nextLine();   // clear buffer

        System.out.println("Enter the employee name:");
        ename = sc.nextLine();

        System.out.println("Enter the salary:");
        salary = sc.nextInt();
    }

    public void display() {

        System.out.println("Employee ID: " + eno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees:");
        int n = sc.nextInt();

        Employee emp[] = new Employee[n];

        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            emp[i].read();
        }

        System.out.println("Search");

        while (true) {

            System.out.print("Enter ID to search (or -1 to exit): ");
            int no = sc.nextInt();

            if (no == -1)
                break;

            boolean found = false;

            for (int i = 0; i < n; i++) {

                if (emp[i].eno == no) {
                    emp[i].display();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found.");
            }
        }

        sc.close();
    }
}
