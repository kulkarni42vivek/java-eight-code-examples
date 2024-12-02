package Trees;

import java.util.*;


public class BFS {
    public static void main(String[] args) {
        int V = 5;

        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 4);

        System.out.println("BFS starting from 0:");
        bfs(adj, 2);
    }

    private static void addEdge(List<List<Integer>> adj, int i, int j) {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }

    private static void bfs(List<List<Integer>> adj, int s) {
        Queue<Integer> queue  = new ArrayDeque<>(adj.size());
        boolean[] visited = new boolean[adj.size()];
        queue.add(s);
        visited[s] = true;
        while(!queue.isEmpty()){

            int value = queue.poll();
            System.out.println(value);

            for (int x : adj.get(value)) {
                if (!visited[x]) {
                    visited[x] = true;
                    queue.add(x);
                }
            }
        }
    }
}
