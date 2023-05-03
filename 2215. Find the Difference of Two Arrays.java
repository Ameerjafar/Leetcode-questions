import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<>();
        Hashtable<Integer,Integer> ht=new Hashtable<>();

        for(int i=0;i<=1;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<nums1.length;i++){
            ht.put(i,nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(!ht.contains(nums2[i]) && !list.get(1).contains(nums2[i])){
                list.get(1).add(nums2[i]);
            }
        }
        ht.clear();
        for(int i=0;i<nums2.length;i++){
            ht.put(i,nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(!ht.contains(nums1[i]) && (!list.get(0).contains(nums1[i]))){
                list.get(0).add(nums1[i]);
            }
        }
        return list;

    }
}
