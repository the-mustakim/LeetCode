package PrefixSum;
    public class Range_Sum_Query_Immutable {

        /***
         *
         *
         * ***/

        private int[] prefixSum;
        public Range_Sum_Query_Immutable(int[] nums) {
            this.prefixSum = nums;
            for(int i=1;i<prefixSum.length;i++){
                prefixSum[i] = prefixSum[i-1]+prefixSum[i]; //Time Complexity of this code is O(n)
            }
        }
        public int sumRange(int left, int right) {
        int rightSum = prefixSum[right];
        int leftSum = left>0 ? prefixSum[left]:0;
        return rightSum - leftSum;
        }

        public static void main(String args[]){
            int arr[] = {-2,0,3,-5,2,-1};
            Range_Sum_Query_Immutable obj = new Range_Sum_Query_Immutable(arr);
            System.out.println("The sum range sum is: " + obj.sumRange(0,2));
        }

}
