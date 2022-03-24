import java.util.Scanner;

public class MergeSort1 {

    public static void merge(int arr[], int l, int m, int r) {
        int [] ar1 = new int[m-l+1];
        int [] ar2 = new int[r-m];

        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = arr[l+i];
        }
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = arr[m+i+1];
        }

        int i=0,j=0,k=l;
        while(i<(m-l+1) && j<(r-m)){
            
            if(ar1[i]<=ar2[j]){
                arr[k]=ar1[i];
                k++;
                i++;
            }
            else{
                arr[k]=ar2[j];
                k++;
                j++;
            }
        }
        while(i<m-l+1){
            arr[k]=ar1[i];
            i++;
            k++;
        }
        while(j<r-m){
            arr[k]=ar2[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int arr[], int l, int r) {
        if(l<r){
            int m = l + (r-l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        mergeSort(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
