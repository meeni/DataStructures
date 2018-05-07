package Array;

import java.util.Arrays;

public class ThreeSumClosest {
	
		public static void main(String args[])
		{
			int [] num = {-1,2,1,-4};
			int target = 1;
			int sum = threeSumClosest(num,target);
			System.out.println("the closest sum is :"+sum);
		}
	    public static int threeSumClosest(int[] num, int target) {
	        int result = num[0] + num[1] + num[2];//choose any three element as the closest sum
	        Arrays.sort(num);
	        for (int i = 0; i < num.length - 2; i++) {
	            int start = i + 1;
	            int end = num.length - 1;
	            while (start < end) {
	                int sum = num[i] + num[start] + num[end];
	                System.out.println(sum);
	                if (sum > target) {
	                    end--;
	                } else {
	                    start++;
	                }
	                if (Math.abs(sum - target) < Math.abs(result - target)) {
	                    result = sum;
	                }
	            }
	        }
	        return result;
	    }
}
