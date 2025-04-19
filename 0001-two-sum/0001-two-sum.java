import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices of the two numbers
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{}; // Return an empty array if no solution is found
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numsSize = sc.nextInt(); // Read number of elements
        int[] nums = new int[numsSize];

        for (int i = 0; i < numsSize; i++) {
            nums[i] = sc.nextInt(); // Read array elements
        }

        int target = sc.nextInt(); // Read target sum

        Solution sol = new Solution();
        int[] result = sol.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println(result[0] + " " + result[1]); // Print indices of the pair
        } else {
            System.out.println("No valid pair found");
        }

        sc.close();
    }
}
