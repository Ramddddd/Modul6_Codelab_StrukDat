package Codelab_BFS;

import java.util.*;

public class BFS {
    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> que;

    BFS(int v){
        node = v;
        adj = new LinkedList[node];
        for (int i = 0; i < v ; i++) {
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<Integer>();
    }

    void insertEdge(int v, int w){
        adj[v].add(w);
    }

    void BFS(int n)
    {
        boolean nodes[] = new boolean[node];
        int a = 0;
        nodes[n] = true;
        que.add(n);
        while (que.size() != 0)
        {
            n = que.poll();
            System.out.print(n+" ");
            for (int i = 0; i < adj[n].size(); i++) {
                a = adj[n].get(i);
                if (!nodes[a])
                {
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS bfs = new BFS(6);
        bfs.insertEdge(0,1);
        bfs.insertEdge(0,5);
        bfs.insertEdge(0,4);
        bfs.insertEdge(1,0);
        bfs.insertEdge(1,5);
        bfs.insertEdge(1,2);
        bfs.insertEdge(5,1);
        bfs.insertEdge(5,0);
        bfs.insertEdge(5,4);
        bfs.insertEdge(4,0);
        bfs.insertEdge(4,5);
        bfs.insertEdge(4,2);
        bfs.insertEdge(2,1);
        bfs.insertEdge(2,4);
        bfs.insertEdge(2,3);
        bfs.insertEdge(3,2);


        System.out.println("BFS untuk graph (dari node 3):");
        bfs.BFS(3);

    }
}