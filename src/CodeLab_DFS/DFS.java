package CodeLab_DFS;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    DFS(int V)
    {
        adj = new LinkedList[V];
        visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void insertedge(int src, int dest){
        adj[src].add(dest);
    }

    void DFS(int vertex){
        visited[vertex] = true;
        System.out.print(vertex+" ");

        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()){
            int n = it.next();
            if (!visited[n]) {
                DFS(n);
            }
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS(6);

        dfs.insertedge(0, 1);
        dfs.insertedge(0, 5);
        dfs.insertedge(0, 4);
        dfs.insertedge(1, 0);
        dfs.insertedge(1, 5);
        dfs.insertedge(1, 2);
        dfs.insertedge(5, 1);
        dfs.insertedge(5, 0);
        dfs.insertedge(5, 4);
        dfs.insertedge(4, 0);
        dfs.insertedge(4, 5);
        dfs.insertedge(4, 2);
        dfs.insertedge(2, 1);
        dfs.insertedge(2, 4);
        dfs.insertedge(2, 3);
        dfs.insertedge(3, 2);


        System.out.println("DFS untuk graph (dari node 3):");
        dfs.DFS(3);
    }

}
