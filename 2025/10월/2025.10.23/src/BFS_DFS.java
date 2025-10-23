import java.io.*;
import java.util.*;

public class BFS_DFS {
    static ArrayList<Integer>[] graph;
    static boolean [] visited;
    static StringBuilder sb ;

    static void bfs(int start) {
        Queue<Integer> q = new ArrayDeque <> ();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int v = q.poll();
            sb.append(v).append(" ");

            for (int next : graph[v]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }

    static void dfs(int start){
        visited[start] = true;
        sb.append(start).append(" ");
        for (int next : graph[start]) {
            if (!visited[next]) {
                dfs(next);
            }
        }

    }


    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sz = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(sz.nextToken());
        int M = Integer.parseInt(sz.nextToken());
        int V = Integer.parseInt(sz.nextToken());

        graph = new ArrayList[N+1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList <> ();
        }

        for (int i = 0; i < M; i++) {
            sz = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(sz.nextToken());
            int b = Integer.parseInt(sz.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        visited = new boolean[N + 1];
        sb = new StringBuilder();
        dfs(V);
        System.out.println(sb);

        visited = new boolean[N + 1];
        sb = new StringBuilder();
        bfs(V);
        System.out.println(sb);

    }
}
