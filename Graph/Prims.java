import java.util.Scanner;

public class Prims {
    public static void prims(int matrix[][]) {
        int n = matrix.length;
        boolean visited[] = new boolean[n];
        int parent[] = new int[n];
        int weight[] = new int[n];
        // assign the value of source vertex from where you start
        parent[0] = -1;
        weight[0] = 0;
        for (int i = 1; i < n; i++) {
            weight[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            int minvertex = findMinimum(visited, weight);
            visited[minvertex] = true;
            // check the neighbours of the visited vertex

            for (int j = 0; j < n; j++) {
                if (matrix[minvertex][j] != 0 && !visited[j]) {
                    if (weight[j] > matrix[minvertex][j]) {
                        weight[j] = matrix[minvertex][j];
                        parent[j] = minvertex;
                    }
                }
            }
        }
        // printing the minimum spanning tree
        for (int i = 0; i < n; i++) {
            if (i < parent[i]) {
                System.out.println(i + "   " + parent[i] + "   " + weight[i]);
            } else
                System.out.println(parent[i] + "   " + i + "   " + weight[i]);
        }
    }

    // method to find the minimum vertex
    private static int findMinimum(boolean[] visited, int[] weight) {
        int minvertex = -1;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && (minvertex == -1 || weight[i] < weight[minvertex])) {
                minvertex = i;
            }
        }
        return minvertex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertex");
        int n = sc.nextInt();
        System.out.println("Enter the number of edges");
        int e = sc.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            // creation of undirected graph
            matrix[v1][v2] = weight;
            matrix[v2][v1] = weight;
        }
        prims(matrix);
        sc.close();
    }
}