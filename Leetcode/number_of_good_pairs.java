package Leetcode;

import java.util.HashMap;

public class number_of_good_pairs {
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,1};
        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else {
                hm.put(arr[i],1);
            }
        }

        for(int key:hm.keySet()){
            int val = hm.get(key);
            ans += (val * (val - 1))/2;
        }

        System.out.println(ans);

    }
}
