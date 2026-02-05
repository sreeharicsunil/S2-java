import java.util.Scanner;

class AddMatrix {
    int r, c;
    int[][] arr = new int[10][10];

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static AddMatrix sum(AddMatrix m1, AddMatrix m2) {
        AddMatrix temp = new AddMatrix();

        if (m1.r == m2.r && m1.c == m2.c) {
            temp.r = m1.r;
            temp.c = m1.c;

            for (int i = 0; i < m1.r; i++) {
                for (int j = 0; j < m1.c; j++) {
                    temp.arr[i][j] = m1.arr[i][j] + m2.arr[i][j];
                }
            }
        } else {
            System.out.println("Addition not possible");
        }
        return temp;
    }

    public void display() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AddMatrix m1 = new AddMatrix();
        AddMatrix m2 = new AddMatrix();

        m1.get();
        m2.get();

        AddMatrix result = sum(m1, m2);

        System.out.println("Addition of matrices:");
        result.display();
    }
}
