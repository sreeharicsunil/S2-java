import java.util.*;

public class Search {
    int[] arr = new int[10];
    int count;

    // Read array elements
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of array: ");
        count = sc.nextInt();

        System.out.println("Enter the array elements:");
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Search element
    public void itemSearch() {
        int n, flag = 0, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element you want to search: ");
        n = sc.nextInt();

        for (i = 0; i < count; i++) {
            if (arr[i] == n) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("Element is found at position " + (i + 1));
        } else {
            System.out.println("Element is not found");
        }
    }

    public static void main(String[] args) {
        Search s1 = new Search();
        s1.get();
        s1.itemSearch();
    }
}
