package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class majorityelement {
    //Leetcode prob 169;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input size
        int n = sc.nextInt();
        int[] nums = new int[n];

        // take array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // count frequency using HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        int ans = -1; // store majority element
        for (int key : hm.keySet()) {
            if (hm.get(key) > n / 2) {
                ans = key;
                break;
            }
        }

        System.out.println(ans);
    }
}
//We can do it by arrays
//arrays.sort[]
//int n = nums.length/2;
//return nums[n];

//Time complexity is O(n logn)