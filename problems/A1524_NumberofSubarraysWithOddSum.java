package problems;

public class A1524_NumberofSubarraysWithOddSum {
    // with time complexity o(n)^2
    // public int numOfSubarrays(int[] arr) {
    //     int MOD = 1_000_000_007;
    //     long oddSumArrCnt = 0;

    //     for(int i=0;i<arr.length;i++){
    //         int sum = 0;
    //         for(int j=i;j<arr.length;j++){
    //             sum = sum + arr[j];
    //             if(sum % 2 != 0) oddSumArrCnt++;
    //         }
    //     }
    //     return (int) (oddSumArrCnt % MOD);
    // }

    // trick - keep track of prefix, if sum even means all pairs of arr sum is odd and vise versa
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        long oddSumArrCnt = 0;

        int prefixSum = 0;
        int oddCount = 0;
        int evenCount = 1;

        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
            if(prefixSum % 2 == 0){
                oddSumArrCnt += oddCount;
                evenCount++;
            } else {
                oddSumArrCnt += evenCount;
                oddCount++;
            }
        }
        return (int) (oddSumArrCnt % MOD);
    }
}
