//import java.util.*;
//public class Perm {
//    int N = 4 , R = 3 , C = 0;
//    int [] a = {1,2,3,4};
//    int [] b =new int [R];
//    boolean[] v = new boolean [N];
//
//    void perm (int cnt) {
//        if (cnt == R) {
//            System.out.println(Arrays.toString(b));C++;
//            return;
//        }
//        for (int i = 0 ; i<N; i++) {
//            if (v[i]) continue;
//            v[i] = true;
//            b[cnt] = a[i];
//            perm(cnt+1);
//            v[i]=false;
//        }
//    }
//
//    public int solution () {
//        perm(0);
//        return C;
//    }
//
//    public static void main(String[] args){
//        int result = new Perm().solution();
//        System.out.println("result = " + result);
//    }
//}


//import java.util.*;
//public class Perm {
//    int N = 4 , R=3, C=0;
//    int [] a = {1,2,3,4};
//    int [] b = new int [R];
//    boolean [] v = new boolean [N];
//
//    void perm (int cnt) {
//        if (cnt == R) {
//            System.out.println(Arrays.toString(b));
//            C++;
//            return;
//        }
//
//        for (int i = 0 ; i<N;i++) {
//            if (v[i]) continue;
//            v[i] = true;
//            b[cnt] = a[i];
//            perm(cnt+1);
//            v[i] = false;
//        }
//    }
//
//    int solution(){
//        perm(0);
//        return C;
//    }
//
//    public static void main(String[] args) {
//        int result = new Perm().solution();
//        System.out.println("result = " + result);
//    }
//}

import java.util.*;
public class Perm {
    int N=4,R=3,C=0;
    int[] a = {1, 2, 3, 4};
    int[] b = new int[R];
    boolean [] v = new boolean[N];

    void perm(int cnt) {
        if (cnt == R){
            System.out.println(Arrays.toString(b)); C++;
            return;
        }

        for(int i=0;i<N;i++){
            if(v[i]) continue;
            v[i] = true;
            b[cnt] = a[i];
            perm(cnt + 1);
            v[i] = false;
        }
    }

    int solution() {
        perm(0);
        return C;
    }

    public static void main(String[] args) {
        int result = new Perm().solution();
        System.out.println("result = " + result);
    }


}