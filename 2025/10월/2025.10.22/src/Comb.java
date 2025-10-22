//import java.util.*;
//
//public class Comb {
//    int N = 4 , R=3,C=0;
//    int [] a = {1,2,3,4};
//    int[] b = new int[R];
//
//    void comb(int cnt , int start){
//        if (cnt == R) {
//            System.out.println(Arrays.toString(b));C++;
//            return;
//        }
//        for(int i = start;i<N; i++) {
//            b[cnt] = a[i];
//            comb(cnt + 1, i + 1);
//        }
//    }
//
//    int solution(){
//        comb(0,0);
//        return C;
//    }
//
//    public static void main(String[] args) {
//        int result = new Comb().solution();
//        System.out.println("result = " + result);
//    }
//}

import java.util.*;
public class Comb {
    int N=4,R=3,C=0;
    int [] a = {1, 2, 3, 4};
    int[] b = new int[R];


    void comb(int cnt, int start){
        if(cnt ==R){
            System.out.println(Arrays.toString(b)); C++;
            return;
        }

        for (int i = start; i < N; i++) {
            b[cnt] = a[i];
            comb(cnt + 1, i + 1);
        }
    }

    int solution(){
        comb(0, 0);
        return C;
    }

    public static void main(String[] args) {
        int result = new Comb().solution();
        System.out.println("result = " + result);
    }
}
