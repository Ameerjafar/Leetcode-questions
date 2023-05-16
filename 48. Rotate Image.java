class Solution {
    public void rotate(int[][] matrix) {
        for(int[] nums:matrix){
            for(int i=0;i<(nums.length+1)/2;i++){
                int temp=nums[i];
                nums[i]=nums[nums.length-i-1];
                nums[nums.length-i-1]=temp;
            }
        }
        int count=1;
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[j].length-count;j++){
                int temp=matrix[j][i];
                matrix[j][i]=matrix[matrix.length-i-1][matrix.length-j-1];
                matrix[matrix.length-i-1][matrix.length-j-1]=temp;
            }
            count++;
        }
        
    }
