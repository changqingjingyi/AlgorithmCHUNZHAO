//实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 2.00000, n = 10
//输出：1024.00000
// 
//
// 示例 2： 
//
// 
//输入：x = 2.10000, n = 3
//输出：9.26100
// 
//
// 示例 3： 
//
// 
//输入：x = 2.00000, n = -2
//输出：0.25000
//解释：2-2 = 1/22 = 1/4 = 0.25
// 
//
// 
//
// 提示： 
//
// 
// -100.0 < x < 100.0 
// -231 <= n <= 231-1 
// -104 <= xn <= 104 
// 
// Related Topics 数学 二分查找 
// 👍 574 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double myPow(double x, int n) {
        int N = n;
        return N > 0 ? discriminant(x, N) : 1 / discriminant(x, -N);

    }
    double discriminant(double x, int N) {
        if (N == 0) {
            return 1.0;
        }
        double res = discriminant(x, N / 2);
        return N % 2 == 0 ? res * res : res * res * x;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
