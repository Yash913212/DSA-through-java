package Hashset;

import java.util.HashSet;

public class missing_number {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2};
        HashSet<Integer> hs = new HashSet<>();
        int duplicate = -1;
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i])){
                hs.add(arr[i]);
            }else{
                duplicate = arr[i];
            }
        }
        int missing = -1;
        for(int i=1;i<=arr.length;i++){
//            System.out.println(i);
            if(!hs.contains(i)){
                missing = i;
            }
        }
        System.out.println(missing);
    }
}
