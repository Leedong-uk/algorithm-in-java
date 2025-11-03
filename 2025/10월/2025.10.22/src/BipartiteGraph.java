import java.util.Arrays;
import java.util.Deque;

public class BipartiteGraph {
    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] check = new int[n];
        Arrays.fill(check, -1); // -1: 방문 안함, 0/1: 두 가지 색
        boolean output = true;

        for (int i = 0; i < n; i++) {
            if (check[i] == -1) {
                if (!bfs(i, graph, check)) {
                    output = false;
                    break;
                }
            }
        }
        return output;
    }

    private static boolean bfs(int start, int[][] graph, int[] check) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(start);
        check[start] = 0;

        while (!dq.isEmpty()) {
            int x = dq.pollFirst(); // 큐의 맨 앞에서 꺼내기
            for (int next : graph[x]) {
                if (check[next] == -1) {
                    check[next] = 1 - check[x]; // 색 번갈아 칠하기
                    dq.addLast(next); // 뒤쪽에 추가
                } else if (check[next] == check[x]) {
                    return false; // 인접한 노드가 같은 색이면 이분 그래프 아님
                }
            }
        }
        return true;
    }