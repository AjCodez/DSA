import java.util.*;

public class BinarySearch {
    public static boolean bSearch(int[] ar, int x) {
        int l=0,r=ar.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(ar[m]==x){
                return true;
            }
            else{
                if(ar[m]<x)
                    l=m+1;
                else
                    r=m-1;
            }
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
        if(bSearch(arr, x))
            System.out.println("Found");
        else
            System.out.println("Not found");
        sc.close();
    }
}
