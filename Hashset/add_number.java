package Hashset;

import java.util.HashSet;

public class add_number {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(50);
        hs.add(20);
        hs.add(30);
        hs.remove(20);
        if(!hs.contains(10)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        System.out.println(hs);
        System.out.println(hs.size());
    }
}
