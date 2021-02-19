import java.util.*;

public class main {
	public static void main(String args[]) {
		int arr[] = {2,7,11,15};
		int tar = 9;
		
		int Ans[] = TwoSum(arr, tar);
		System.out.println(Ans[0] + " " + Ans[1]);
		
	}
	
	public static int[] TwoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i<nums.length ; i++) {
        	int temp = target - nums[i];
        	if (map.containsKey(temp)) {
        		return new int[] {map.get(temp), i};
        	}
        	map.put(nums[i], i);
        }
		
		throw new IllegalArgumentException("no two sum");
    }
	
}

/* 
    解題方向：
        創建一個HashMap來存取，
        用一個for迴圈來一一扣targer - nums[i]，
        然後再檢查HashMap裡面是否有扣完的值，如果有就是答案
        沒有的話把這組數字num[i]存進去keys值裡面，value值存放for迴圈的i值，下一輪for迴圈

    簡單來說就是去檢查相扣完的值有沒有在hashmap裡面，
    hashmap存放的是前面沒有找到還沒相扣的值(就是傳進來的陣列的值)
*/