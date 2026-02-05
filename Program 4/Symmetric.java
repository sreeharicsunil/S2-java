import java.util.Scanner;

public class Symmetric {
    int r, c;
    int[][] arr;

    public void get() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        arr = new int[r][c];

        System.out.println("Enter the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public void isSym() {
        if (r != c) {
            System.out.println("This is not a symmetric matrix");
            return;
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] != arr[j][i]) {
                    System.out.println("This is not a symmetric matrix");
                    return;
                }
            }
        }

        System.out.println("This is a symmetric matrix");
    }

    public static void main(String[] args) {
        Symmetric matrix = new Symmetric();
        matrix.get();
        matrix.isSym();
    }
}

