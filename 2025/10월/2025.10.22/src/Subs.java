//import java.util.*;
//public class Subs {
//    int N = 4 , C=0;
//    int[] a = {1, 2, 3, 4};
//
//    void subs(int cnt, String str) {
//        if (cnt == N) {
//            System.out.println(str);
//            C++;
//            return;
//        }
//        subs(cnt + 1, str);
//        subs(cnt + 1, str + a[cnt]);
//    }
//
//    int solution() {
//        subs(0,"");
//        return C;
//    }
//
//    public static void main(String[] args) {
//        int result = new Subs().solution();
//        System.out.println("result = " + result);
//    }
// }

import java.util.*;

public class Subs {
    int N =4, C = 0;
    int[] a = {1, 2, 3, 4};

    void subs(int cnt ,String str) {
        if (cnt == N) {
            System.out.println(str);
            C++;
            return;
        }

        subs(cnt + 1, str);
        subs(cnt + 1, str + a[cnt]);
    }

    int solution() {
        subs(0, "");
        return C;
    }

    public static void main(String[] args) {
        int result = new Subs().solution();
        System.out.println("result = " + result);
    }
}