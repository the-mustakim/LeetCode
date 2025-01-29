package PrefixSum;

    public class Range_Sum_Query_Immutable {
        private int[] prefixSum;

        public Range_Sum_Query_Immutable(int[] nums) {
            prefixSum = new int[nums.length];
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum=sum+nums[i];
                prefixSum[i]=sum;
            }
        }

        public int sumRange(int left, int right) {
            int RightSum = prefixSum[right];
            int LeftSum = left>0 ? prefixSum[left-1]:0;
            return RightSum-LeftSum;
        }
}
