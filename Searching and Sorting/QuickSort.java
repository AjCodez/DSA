import java.util.Scanner;

public class QuickSort1 {

    private static void swap(int [] arr, int a, int b) {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static int partition(int [] arr, int l, int r) {
        int i=l;
        for(int f=l;f<r;f++){
            if(arr[f]<arr[r]){
                swap(arr,i,f);
                i++;
            }
        }
        swap(arr,i,r);
        return i;
    }

    public static void quickSort(int [] arr,int l, int r) {
        if(l<r){
            int p=partition(arr, l, r);
            quickSort(arr, l, p-1);
            quickSort(arr, p+1, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}