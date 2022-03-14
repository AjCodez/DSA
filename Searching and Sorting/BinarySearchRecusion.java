import java.util.Scanner;

public class BinarySearchRecusion {
    public static boolean bSearch(int[] ar, int l, int r, int x) {
        int m = l + (r - l) / 2;
        if (l > r)
            return false;
        else if (ar[m] == x)
            return true;
        else if (ar[m] < x)
            return bSearch(ar, m + 1, r, x);
        else
            return bSearch(ar, l, m - 1, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        if (bSearch(arr, 0, l - 1, x))
            System.out.println("Found");
        else
            System.out.println("Not found");
        sc.close();
    }
}
