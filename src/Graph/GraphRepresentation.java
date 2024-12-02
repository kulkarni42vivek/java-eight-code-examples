package Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphRepresentation {
    public static void main(String[] args) {
        int V = 4;
        int[][] matrix  = new int[V][V];

        for(int i = 0 ;i< V;i++){
            for(int j = 0 ;j<V;j++){
                matrix[i][j] = 0 ;
            }
        }

        addEdge(matrix, 0, 1);
        addEdge(matrix, 0, 2);
        addEdge(matrix, 1, 2);
        addEdge(matrix, 2, 3);


        System.out.println("Adjacency Matrix Representation");
        displayMatrix(matrix);


        int VX = 4;
        List<List<Integer>> adj = new ArrayList<>(VX);
        for (int i = 0; i < VX ; i++) {
            adj.add(new ArrayList<>());
        }


        addEdgeAdj(adj, 0, 1);
        addEdgeAdj(adj, 0, 2);
        addEdgeAdj(adj, 1, 2);
        addEdgeAdj(adj, 2, 3);

        System.out.println("Adjacency List Representation:");
        displayAdjList(adj);
    }

    private static void displayAdjList(List<List<Integer>> adj) {
        for (int i = 0 ;i<adj.size();i++){
            System.out.print(i + " : ");
            for(int j = 0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)  + " ");
            }
            System.out.println();
        }
    }

    private static void addEdgeAdj(List<List<Integer>> adj, int i, int j) {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }

    private static void displayMatrix(int[][] matrix) {
        for(int i = 0 ;i<matrix.length;i++){
            for(int j =0 ;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void addEdge(int[][] matrix, int i, int j) {
        matrix[i][j] = 1;
        matrix[j][i] = 1;
    }
}
