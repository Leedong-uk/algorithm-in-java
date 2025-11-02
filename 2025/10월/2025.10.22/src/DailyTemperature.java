import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DailyTemperature {
    public static int[] dailyTemperature (int [] temperature) {
        int n = temperature.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && temperature[stack.peek()] < temperature[i]) {
                int idx = stack.pop();
                answer[idx] = i-idx;
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] temperature = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperature(temperature))); // [1, 1, 4, 2, 1, 1, 0, 0]

    }

}
