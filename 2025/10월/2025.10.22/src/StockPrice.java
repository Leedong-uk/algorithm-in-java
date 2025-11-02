import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class StockPrice {
    public static int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque <> ();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = n - idx - 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2,3};
        int[] result = solution(prices);
        System.out.println("result = " + Arrays.toString(result));
    }
}
