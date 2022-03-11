import java.util.Scanner;

public class LinearSearch {
    public static boolean lSearch(int[] ar, int x) {
        for (int i : ar) {
            if(i==x)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        if(lSearch(arr, x))
            System.out.println("Found");
        else
            System.out.println("Not found");
        sc.close();
    }
}
