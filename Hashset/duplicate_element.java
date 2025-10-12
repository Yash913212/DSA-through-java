package Hashset;

import java.util.HashSet;

public class duplicate_element {
    public static void main(String[] args) {
        int arr[] = {1,2,2,34};
        HashSet<Integer> hs = new HashSet<>();
        int duplicate = -1;
        for(int i=0;i<arr.length;i++){
            int val = arr[i];
            if(!hs.contains(val)){
                hs.add(val);
            }else{
                duplicate = val;
            }
        }
        System.out.println(duplicate);
    }
}
