/**
* �Ʋ��������У���ʱ�ˣ�������
*/
class Solution {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}

/**
* ��̬�滮
*/
class Solution {
    public int climbStairs(int n) {
        int q = 0, p = 0, sum = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = sum;
            sum = q + p;
        }
        return sum;
    }
}

/**
* �������鶯̬�滮һ��
*/
class Solution {
    public int climbStairs(int n) {
        int[] dm = new int[n + 1];
        dm[0] = 1;
        dm[1] = 1;
        for (int i = 2; i <= n; i++) {
            dm[i] = dm[i - 1] + dm[i - 2];
        }       
        return dm[n];
    }
}