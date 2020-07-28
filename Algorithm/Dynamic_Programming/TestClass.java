package Algorithm.Dynamic_Programming;

import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        int[][] edges = new int[n - 1][2];
        for (int i_edges = 0; i_edges < n - 1; i_edges++) {

            for (int j_edges = 0; j_edges < 2; j_edges++) {
                edges[i_edges][j_edges] = in.nextInt();
            }
        }

        int[] thieves = new int[k];
        for (int i_thieves = 0; i_thieves < k; i_thieves++) {
            thieves[i_thieves] = in.nextInt();
        }

        int out_ = Solution(thieves, edges, n, k);
        System.out.println(out_);
    }

    static int Solution(int[] thieves, int[][] edges, int n, int k) {
        // Write your code here
        Graph graph = new Graph(n + 1);
        for (int[] is : edges)
            graph.addEdge(is[0], is[1]);
        for (int i : thieves)
            graph.addTemples(i);
        graph.BFS(1);
        return graph.ans;
    }
}

class Graph {

    private int V;
    private LinkedList<Integer> adj[];
    protected Set<Integer> templeCities = new HashSet<>();
    int ans = 0;

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addTemples(int i) {
        templeCities.add(i);
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n] && !templeCities.contains(n)) {
                    visited[n] = true;
                    ans++;
                    queue.add(n);
                }
            }
        }
    }
}