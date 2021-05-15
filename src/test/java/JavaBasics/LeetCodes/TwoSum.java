package JavaBasics.LeetCodes;

public class TwoSum {

        public int[] twoSum(int[] nums, int target) {
            int[] arr1= new int[2];
            for(int i=0;i<nums.length;i++)
            {
                if ((nums[i] + nums[++i]) == target) {

                    arr1[0] = i-1;
                    arr1[1] = i ;
                    break;

                }
            }
            return arr1;


        }

        public static void main(String[] args)
        {
            TwoSum s= new TwoSum();
            int[] nums={2,7,11,15};
            int target=9;
            int[] arr= s.twoSum(nums,target);

            for(int i=0;i<arr.length;i++)
            {

                System.out.println(arr[i]);
            }
        }

}
