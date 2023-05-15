class Solution {
    public int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]>arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            

        }
        return -1;

    }
    public int helper(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int ans=pivot(nums);
        int firsttry=helper(nums,target,0,ans);
        if(firsttry!=-1){
            return firsttry;
        }
        return helper(nums,target,ans+1,nums.length-1);
    }
}
