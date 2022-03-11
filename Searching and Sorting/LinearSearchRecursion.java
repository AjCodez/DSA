import java.util.Scanner;

public class LinearSearchRecursion {
    public static boolean lSearch(int[] ar, int x, int i) {
            if(ar[i]==x)
                return true;
            else if(i==ar.length-1)
                return false;
            else
                return lSearch(ar, x, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        if(lSearch(arr, x, 0))
            System.out.println("Found");
        else
            System.out.println("Not found");
        sc.close();
    }
}
