import java.util.ArrayList;

public class Develop {
    public static int[] solution(int[] progress, int[] speeds) {
        ArrayList<Integer> progList = new ArrayList<>();
        ArrayList<Integer> speedList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int p : progress) progList.add(p);
        for (int s : speeds)   speedList.add(s);

        while (!progList.isEmpty()) {

            for (int i = 0; i < progList.size(); i++) {
                progList.set(i, progList.get(i) + speedList.get(i));
            }
            if (progList.get(0) >= 100) {
                int cnt = 0;
                while (!progList.isEmpty() && progList.get(0) >= 100) {
                    progList.remove(0);
                    speedList.remove(0);
                    cnt++;
                }
                result.add(cnt);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) answer[i] = result.get(i);
        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds     = {1, 30, 5};
        int[] ans = solution(progresses, speeds); // [2, 1]
        System.out.println(java.util.Arrays.toString(ans));
    }
}
